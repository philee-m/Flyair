/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.AccountDao;
import Dao.GenericDao;
import Dao.OperatorDao;
import Domain.Account;
import Domain.AccountStatus;
import Domain.Address;
import Domain.Gender;
import Domain.IdentificationType;
import Domain.Operator;
import Domain.OperatorAccount;
import Domain.Post;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Timestamp;
//import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Philip
 */
@WebServlet(name = "OperatorControl", urlPatterns = {"/OperatorControl"})
public class OperatorControl extends HttpServlet {

    Operator operator;
    Account account;
    Address address;
    OperatorAccount operatorAccount;
    RequestDispatcher dispatcher;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        OperatorDao operatorDao = new OperatorDao();
        HashService hs = new HashService();
        String action = request.getParameter("action");
        String status = null;

        switch (action) {

            case "addoperator":

                operatorAccount = new OperatorAccount();
                operator = new Operator();
                address = new Address();

                try {
                    account = hs.createpassword(request.getParameter("password"));
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(OperatorControl.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoSuchProviderException ex) {
                    Logger.getLogger(OperatorControl.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                address.setEmail(request.getParameter("email"));
                address.setPhoneNumber(request.getParameter("phonenumber"));
                address.setCountry(request.getParameter("country"));
                address.setCity(request.getParameter("city"));
                address.setStreet(request.getParameter("street"));

                operator.setFirstname(request.getParameter("firstname"));
                operator.setLastname(request.getParameter("lastname"));
                operator.setGender(Gender.valueOf(request.getParameter("gender")));
                operator.setDateOfBirth(java.sql.Date.valueOf(request.getParameter("dateofbirth")));
                operator.setNationality(request.getParameter("nationality"));
                operator.setIdentificationType(IdentificationType.valueOf(request.getParameter("identificationtype")));
                operator.setIdNumber(Long.parseLong(request.getParameter("idnumber")));
                operator.setAddress(address);

                Date date = new Date();
                Timestamp ts = new Timestamp(date.getTime());
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                operator.setCreatedon(Timestamp.valueOf(formatter.format(ts)));

                operatorAccount.setOperator(operator);
                operatorAccount.setPasswordhash(account.getPasswordhash());
                operatorAccount.setUsername(request.getParameter("username"));
                operatorAccount.setPost(Post.valueOf(request.getParameter("post")));
                operatorAccount.setAccountStatus(AccountStatus.valueOf(request.getParameter("status")));
                operatorAccount.setSalt(account.getSalt());

                status = operatorDao.createOperator(operator, operatorAccount);

                request.setAttribute("status", status);
                dispatcher = request.getRequestDispatcher("Dashboard.jsp");
                dispatcher.forward(request, response);
                break;
            case "updateoperator":
                GenericDao genericDao = new GenericDao();
                AccountDao accountDao = new AccountDao();
                System.out.println("in update operator");
                Long operatoride = (Long) request.getSession().getAttribute("operatorid");
                operator = (Operator) genericDao.findBYId(new Operator(), operatoride);
                operatorAccount = (OperatorAccount) accountDao.SearchByOperatorId(operatoride);
                address = operator.getAddress();

                if (!(request.getParameter("password") == null)) {
                    try {
                        account = hs.createpassword(request.getParameter("password"));
                    } catch (NoSuchAlgorithmException ex) {
                        Logger.getLogger(OperatorControl.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (NoSuchProviderException ex) {
                        Logger.getLogger(OperatorControl.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    operatorAccount.setPasswordhash(account.getPasswordhash());
                    operatorAccount.setSalt(account.getSalt());
                }

                try {
                    address.setEmail(request.getParameter("email"));
                    address.setPhoneNumber(request.getParameter("phonenumber"));
                    address.setCountry(request.getParameter("country"));
                    address.setCity(request.getParameter("city"));
                    address.setStreet(request.getParameter("street"));

                    operator.setFirstname(request.getParameter("firstname"));
                    operator.setLastname(request.getParameter("lastname"));
                    operator.setGender(Gender.valueOf(request.getParameter("gender")));
                    operator.setDateOfBirth(java.sql.Date.valueOf(request.getParameter("dateofbirth")));
                    operator.setNationality(request.getParameter("nationality"));
                    operator.setIdentificationType(IdentificationType.valueOf(request.getParameter("identificationtype")));
                    operator.setIdNumber(Long.parseLong(request.getParameter("idnumber")));
                    operator.setAddress(address);

                    operatorAccount.setOperator(operator);

                    operatorAccount.setUsername(request.getParameter("username"));
                    operatorAccount.setPost(Post.valueOf(request.getParameter("post")));
                    operatorAccount.setAccountStatus(AccountStatus.valueOf(request.getParameter("status")));

                    status = operatorDao.updateOperator(operator, operatorAccount);

                    request.setAttribute("status", status);
                    dispatcher = request.getRequestDispatcher("Dashboard.jsp");
                    dispatcher.forward(request, response);
                } catch (Exception e) {
                    System.out.println("error is " + e.getMessage());

                }
                break;

            default:
                System.out.println("no action mentioned");
        }

    }

}
