<%-- 
    Document   : orderconfirm
    Created on : May 10, 2018, 5:49:50 PM
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
    <body><br/><br/>
        <div style="height:100%">
            <form name="orderconf" action="orderconf" method="POST">
        
                <% String unn = (String)session.getAttribute("username");
                System.out.println(request.getAttribute("total"));
                double total = (double) request.getAttribute("total");
                
                %>
        <h4 style="margin-top: 7%;margin-left: 5%">Please Confirm payment of LKR:<%= total %> </h4>
        <div style="margin-left: 5%">Order Type: <select name="ordertype">
            <option>Take Away</option>
            <option>Delivery</option>
            <option>Dine In Reservation</option>
        </select>
        </div>
        
        <input type="hidden" name="total" value="<%=total%>">
        <input type="hidden" name="username" value="<%=unn%>">
        <input class="btn-success" style="margin-left: 5%;margin-top: 1%" type="submit" value="Continue" name="submit" />
        </form>
        </div>
        <jsp:include page="footer.jsp"/>  
    </body>
</html>
