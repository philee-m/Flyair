<%-- 
    Document   : UpdateOperator
    Created on : Oct 31, 2020, 11:37:45 AM
    Author     : Philip
--%>

<%@page import="Domain.AccountStatus"%>
<%@page import="Domain.Gender"%>
<%@page import="Domain.Post"%>
<%@page import="Controller.DashboardService"%>
<%@page import="Dao.AccountDao"%>
<%@page import="Domain.Account"%>
<%@page import="Domain.Account"%>
<%@page import="Domain.Operator"%>
<%@page import="Dao.GenericDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Operator</title>
        <link rel="stylesheet" href="xresources/bootstrap.min.css">
        <link rel="stylesheet" href="xresources/font-awesome.min.css">
        <script src="xresources/jquery-3.4.1.min.js"></script>
        <script src="xresources/bootstrap.min.js"></script>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <%

            Long operatorid = Long.parseLong(request.getParameter("operatorid"));
            Operator operator = (Operator) GenericDao.getInstance().findBYId(new Operator(), operatorid);
            Account account = (Account) AccountDao.getInstance().SearchByOperatorId(operatorid);
            session.setAttribute("operatorid", operatorid);
            DashboardService ds = new DashboardService();
            Gender[] genderlist = ds.getGenderList();
            Post[] postlist = ds.getPostlist();
            AccountStatus[] statuslist = ds.getAccountstatuslist();
            


            


        %>
        <div class="admin">
            <div class="admin-tab" id="operator-tab" style="display: block; margin: auto">
                <h2>operator Update form</h2>
                <form action="UpdateControl" method="post">
                    <div class="inputs">
                        <div class="inputbox">
                            <label for="">First name <span>*</span></label>
                            <input type="text" name="firstname" value="<%=operator.getFirstname()%>">
                        </div>
                        <div class="inputbox">
                            <label for="">last name <span>*</span></label>
                            <input type="text" name="lastname" value="<%=operator.getLastname()%>">
                        </div>
                        <div class="inputbox">
                            <label for="">gender</label>
                            <select name="gender">
                                <%
                                    for (Gender gender : genderlist) {
                                        if (gender.equals(operator.getGender())) {
                                %>
                                
                                <option value="<%=gender%>" selected><%=gender%></option>
                                <%} else{%>
                                <option value="<%=gender%>"><%=gender%></option>
                                <%}}%>
                            </select>
                        </div>
                        <div class="inputbox">
                            <label for="">Email <span>*</span></label>
                            <input type="text" name="email" value="<%=operator.getEmail()%>">
                        </div>
                        <div class="inputbox">
                            <label for="">Phone number <span>*</span></label>
                            <input type="text" name="phonenumber" value="<%=operator.getPhonenumber()%>">
                        </div>
                        <div class="inputbox">
                            <label for="">City <span>*</span></label>
                            <input type="text" name="city" value="<%=operator.getCity()%>">
                        </div>
                        <div class="inputbox">
                            <label for="">Address <span>*</span></label>
                            <input type="text" name="address" value="<%=operator.getAddress()%>">
                        </div>
                        <div class="inputbox">
                        </div>
                        <h2></h2>

                    </div>
                    <h2 style="text-align: center">Account Details</h2>
                    <div class="inputs">
                        <div class="inputbox">
                            <label for="">User name <span>*</span></label>
                            <input type="text" name="username" value="<%=account.getUsername()%>">
                        </div>
                        <div class="inputbox">
                            <label for="">Post <span>*</span></label>
                            <select name="post">
                                <%
                                    for (Post post : postlist) {
                                        if (post.equals(account.getPost())) {
                                %>
                                
                                <option value="<%=post%>" selected><%=post%></option>
                                <%} else{%>
                                <option value="<%=post%>"><%=post%></option>
                                <%}}%>
                            </select>
                        </div>
                        <div class="inputbox">
                            <label for="">Account Status <span>*</span></label>
                            <select name="statusvalue">
                                <%
                                    for (AccountStatus status : statuslist) {
                                        if (status.equals(account.getAccountStatus())) {
                                %>
                                
                                <option value="<%=status%>" selected><%=status%></option>
                                <%} else{%>
                                <option value="<%=status%>"><%=status%></option>
                                <%}}%>
                            </select>
                        </div>

                    </div>
                    <input type="text" name="actione" hidden value="updateoperator">
                    <button type="submit" class="admin-btn">submit</button>
                </form>
            </div>

        </div>
    </body>
</html>
