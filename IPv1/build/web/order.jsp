<%-- 
    Document   : order
    Created on : Apr 21, 2018, 12:24:13 PM
    Author     : Chath
--%>

<%@page import="mypckg.Img"%>
<%@page import="java.sql.Blob"%>
<%@page import="mypckg.DbConnection"%>
<%@page import="java.sql.ResultSet"%>
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
    <body>
                <div  style="margin-top: 4%">
        
        <% Img i = null;
                String unn = (String)session.getAttribute("username");
            if(unn==null){response.sendRedirect("login.jsp");}
            else{
            DbConnection con = new DbConnection();
        
        String sq33 = "SELECT cusId FROM customer WHERE username='"+ unn  +"';";
        ResultSet rs33 = con.executeSelect(sq33);
        rs33.next();
        String userId = rs33.getString(1);
        String sq44 = "SELECT itemId FROM cart WHERE userId="+ userId +";";
        ResultSet rs44 = con.executeSelect(sq44);
        double total=0;%>
        <form name="orderform" action="orderprocess" method="POST"> 
        <table class="table table-dark"  style="width: 100%;height: 300%;overflow-x:auto;">
            
                <thead><tr><th>Image</th><th>Item Name</th><th>Available</th><th>Price</th><th>Quantity</th><th>Remove</th></tr></thead><tbody>
            <%
                int b=0;
        while(rs44.next()){ 
               int itemid = rs44.getInt(1);
            String sq55 = "SELECT itemName,img,price,availability,itemId FROM menuitem WHERE itemId='"+ itemid  +"';";
        ResultSet rs55 = con.executeSelect(sq55);
        rs55.next();
        String itemName = rs55.getString(1);
        Blob img = rs55.getBlob(2);
        double price = rs55.getDouble(3); int availabilty = rs55.getInt(4); int itemId=rs55.getInt(5);
       
       i =new Img();
        i.getImg(itemName,img);
        String inameedit = itemName.replaceAll("\\s+","");
            int l;%>
        
            <tr >
                <input type="hidden" name="item<%=b%>price" value="<%= price %>">
                
                <td ><img style="" src="images/fooditems/<%= inameedit %>.jpg" width="50px" height="50px"></td>
                <td><%= itemName %></td>
                <td><%= (availabilty>0)?"available":"not available" %></td>
                <td><%= price %></td>
                <td><select name="item<%=b%>quantity" >
                <% for(l=1;l<=15;l++){%><option vlaue="<%=l%>"><%=l%></option><%}%>
            </select></td>
            
             <td><input style="width: 30px;text-align: center;"  class="btn-danger" value = "X" name = "deletebtn" /> </td>
             
            </tr>
           
                <% ++b;
                
        }%><input type="hidden" name="b" value="<%=b%>">
         <tr>
                <td></td><td></td><td></td><td></td><td></td><td></td>
                </tr>
        </tbody>  </table><input style="float:right;margin-right:5% "  class="btn-success" type = "submit" value = "Continue" name = "contbtn" /> 
                
        
        </form><%
        



}
        %></div>
        
    </body>
</html>
