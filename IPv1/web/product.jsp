<%-- 
    Document   : product
    Created on : Apr 10, 2018, 11:39:11 PM
    Author     : Chath
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="mypckg.DbConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <%@include file="header.jsp" %>
    </head>
    <body >
     <div style="margin-top: 4%;height:100%">
        <%
        String pId = request.getParameter("pid"); 
        DbConnection con = new DbConnection(); 
        String sql = "SELECT catname FROM foodcat WHERE catId="+ pId +";";
        ResultSet r = con.executeSelect("jdbc:mysql://localhost/test", sql);
        r.next();
        String pname=r.getString(1);
        %>
        <h1><%= pname %></h1>
    </div>
        <%@include file="footer.jsp" %>
    </body>
    
</html>
