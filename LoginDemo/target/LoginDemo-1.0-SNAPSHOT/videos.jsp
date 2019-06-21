<%-- 
    Document   : videos.jsp
    Created on : Jun 17, 2019, 9:29:49 PM
    Author     : sujan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Videos</title>
    </head>
    <body>
        <h1>This is video </h1>
        <%
            response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");

            if(session.getAttribute("username")==null){
                response.sendRedirect("login.jsp");
            }
        %>
<iframe width="560" height="315" src="https://www.youtube.com/embed/a2cKbQODCGU" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>>
    </body>
</html>
