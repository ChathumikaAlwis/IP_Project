<%-- 
    Document   : userlogin
    Created on : Mar 29, 2018, 1:08:35 PM
    Author     : Chath
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to BuildHub!</title>
        
        
        <h4><% request.getAttribute("status"); %></h4>
        <%@include file="login.jsp"%>
    </head>
    <body>
    </body>
</html>
