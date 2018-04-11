<%-- 
    Document   : regUser
    Created on : Mar 24, 2018, 7:58:56 PM
    Author     : Chath
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <% session.invalidate(); %>
        <%--<%= status %>--%>
        <%--if(Integer.parseInt(status)>0){
                response.sendRedirect("index.html");}--%>
        <h6 style="color:white"><%= request.getAttribute("status") %><h6>   
        <%@include file="register.jsp" %> 
           
    </body>
</html>
