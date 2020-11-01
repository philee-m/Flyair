/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.OperatorDao;
import Domain.Account;
import Domain.AccountStatus;
import Domain.Gender;
import Domain.Operator;
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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        OperatorDao operatorDao = new OperatorDao();
        Operator operator = new Operator();
        Account account = new Account();
        HashService hs = new HashService();

        try {
            account = hs.createpassword(request.getParameter("password"));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(OperatorControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(OperatorControl.class.getName()).log(Level.SEVERE, null, ex);
        }

        operator.setFirstname(request.getParameter("firstname"));
        operator.setLastname(request.getParameter("lastname"));
        operator.setEmail(request.getParameter("email"));
        operator.setPhonenumber(request.getParameter("phonenumber"));
        operator.setGender(Gender.valueOf(request.getParameter("gender")));
        operator.setCity(request.getParameter("city"));
        operator.setAddress(request.getParameter("address"));
        
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        operator.setCreatedon(Timestamp.valueOf(formatter.format(ts)));

        account.setOperator(operator);
        account.setUsername(request.getParameter("username"));
        account.setAccountStatus(AccountStatus.ACTIVE);
        account.setPost(Post.valueOf(request.getParameter("post")));
        

        operatorDao.createOperator(operator, account);
        response.sendRedirect("Dashboard.jsp");

    }

}
