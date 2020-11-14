<%-- 
    Document   : Login
    Created on : Aug 18, 2020, 9:25:02 PM
    Author     : Philip
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login </title>
        <link rel="stylesheet" href="xresources/bootstrap.min.css">
        <link rel="stylesheet" href="xresources/font-awesome.min.css">
        <script src="xresources/jquery-3.4.1.min.js"></script>
        <script src="xresources/bootstrap.min.js"></script>
        <link rel="stylesheet" href="style.css">
        <script src="index.js" ></script>
    </head>

    <body>
        <form action="LoginControl" method="get">
            <div class="login">
                <div class="form-group">
                    <label for="">username</label><br>
                    <input type="text" name="username" class="form-control" required>
                </div>
                <div class="form-group">
                    <label for="">password</label><br>
                    <input type="password" name="password" class="form-control" required>
                </div>
                <input type="text" name="logger" value="operator" hidden> 
                <button type="submit">sign in</button>
            </div>
        </form>
    </body>
</html>
