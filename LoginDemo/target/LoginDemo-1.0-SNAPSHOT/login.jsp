<%-- 
    Document   : login.jsp
    Created on : Jun 17, 2019, 1:53:41 PM
    Author     : sujan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>This is Login Page</h1>
        <form action="login" method="post">
            User name: <input type="text" name="username"><br>
            Password:<input type="password" name="password"> <br>
            <input type="submit" value="login">
                
            
        </form>
    </body>
</html>
