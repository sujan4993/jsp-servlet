<!DOCTYPE html>
<html>
    <head>
        <title>Welcome Page</title>
        <meta language="java" http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Welcome </h1>
        
        <%
            response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
            
            if(session.getAttribute("username")==null){
                response.sendRedirect("login.jsp");
            }
        %>
        
        Welcome ${username}
        <a href="videos.jsp">Videos</a>
        <form action="Logout">
            <input type="submit" value="logout">
    </body>
</html>
