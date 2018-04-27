<%-- 
    Document   : imgdisplay
    Created on : Apr 18, 2018, 12:05:53 PM
    Author     : Chath
--%>

<%@page import="java.io.OutputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.sql.Blob"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="mypckg.DbConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%= request.getAttribute("msg") %></h1>
        <% String iname=request.getAttribute("itemname").toString(); %>
        
        <%
            String fpath=null;
            String inameedit = iname.replaceAll("\\s+","");
            DbConnection con = new DbConnection();    
    String sql = "SELECT img FROM menuitem WHERE itemname='"+iname+"';";
    try{
    ResultSet rs = con.executeSelect(sql);
    fpath = "D:\\IPv1\\web\\images\\fooditems\\"+inameedit+".jpg";
    rs.next();
    Blob b= rs.getBlob(1);
    System.out.println(fpath);
    InputStream ips = b.getBinaryStream();
    System.out.println("FileSaved!");
    OutputStream ops = new FileOutputStream(fpath);
    System.out.println("FileSaved22222222222222!");
    int bytesread = -1;
    byte[] buffer = new byte[4096];
    while((bytesread=ips.read(buffer))!=-1){
    ops.write(buffer, 0, bytesread);
    }
    
    ips.close(); ops.close();
    System.out.println("FileSaved2!");
    con.close();
    }
    
    catch(Exception e){System.out.println(e.getMessage())
         ;}
    
    
    %>
    
    <img src="images/fooditems/<%= inameedit %>.jpg" height="100px" width="100px">
    
    </body>
</html>
