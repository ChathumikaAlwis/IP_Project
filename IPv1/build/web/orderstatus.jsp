<%-- 
    Document   : orderstatus
    Created on : May 10, 2018, 10:28:09 PM
    Author     : Chath
--%>

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
    <body><div style="margin-top: 5%;height: 100%">
            <%
                String msg = (String)request.getAttribute("msg");
                String status ="";
            if(Integer.parseInt(msg)==1){
        String unn = (request.getParameter("username")).toString();
        DbConnection con = new DbConnection(); 
        String sq33 = "SELECT tele FROM customer WHERE username='"+ unn  +"';";
        try {
            System.out.println("ordertype");
        ResultSet rs33 = con.executeSelect(sq33);
        rs33.next();
        String tele = rs33.getString(1);
        status="Order Complete! You will recieve the reciept shortly via text to:"+ tele+"";
        
        }
        catch(Exception e){System.out.println(e.getMessage());
        }
        finally{ con.close();}
        }        
            else{
            status="Failed! Try Again!";
            }
        
        
            %>
            <h1><%= status %></h1>
        
            <a href="homepage.jsp">Back to Home</a>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
