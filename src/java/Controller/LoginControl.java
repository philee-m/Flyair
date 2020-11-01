/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.OperatorDao;
import Domain.Account;
import Domain.AccountStatus;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Philip
 */
@WebServlet(name = "LoginControl", urlPatterns = {"/LoginControl"})
public class LoginControl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Account acc = new OperatorDao().checkAccount(username);
        
        if (acc == null) {
            session.setAttribute("message", "the username or password specified is wrong!!! ");
            response.sendRedirect("Error.jsp");
        } else if (acc.getAccountStatus() != AccountStatus.ACTIVE) {
            session.setAttribute("message", "your account has been blocked!!! ");
            response.sendRedirect("Error.jsp");
        } else {
            try {
                String hashedpass = acc.getPasswordhash();
                HashService h = new HashService();

                String hsh = h.createPasswordHash(request.getParameter("password"), acc.getSalt());
                if (hsh.equals(hashedpass)) {
                    System.out.println("password match");
                    session.setAttribute("user", acc.getUsername());
                    session.setAttribute("operatorpost", acc.getPost().toString());
                    response.sendRedirect("Dashboard.jsp");
                } else {
                    session.setAttribute("message", "the username or password specified is wrong!!! ");
                    System.out.println("password not match");
                    response.sendRedirect("Error.jsp");
                }
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(LoginControl.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
