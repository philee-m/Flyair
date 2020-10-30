<%-- 
    Document   : Homepage
    Created on : Jul 31, 2020, 8:18:22 AM
    Author     : Philip
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="xresources/bootstrap.min.css">
        <title>Error Page</title>
        
    </head>
    <body>
        <%
            if (session.getAttribute("message") != null) {
                String msg = session.getAttribute("message").toString();
                session.removeAttribute("message");
                out.println("<div class='alert alert-danger'>"+msg+"</div>");
                
                
            }
        %>
    </body>
</html>





