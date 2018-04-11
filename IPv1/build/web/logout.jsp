<%-- 
    Document   : logout
    Created on : Mar 29, 2018, 7:22:59 PM
    Author     : Chath
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% session.invalidate(); %>
        <h1>Logging out!</h1>
        <% response.sendRedirect("homepage.jsp");             %>
    </body>
</html>
