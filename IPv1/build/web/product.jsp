<%-- 
    Document   : product
    Created on : Apr 10, 2018, 11:39:11 PM
    Author     : Chath
--%>

<%@page import="mypckg.Img"%>
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
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <%@include file="header.jsp" %>
    </head>
    <body >
        <div class="container-fluid" style="margin-top: 4%">
    
    
        <%
        String pId = request.getParameter("pid"); 
        DbConnection con = new DbConnection(); 
        
        String sql = "SELECT catName FROM menucat WHERE catId="+ pId +";";
        ResultSet r = con.executeSelect(sql);
        r.next();
        String pname=r.getString(1);
        Img i=null;
        String sq = "SELECT itemId,itemName,img,price,availability FROM menuitem WHERE catId="+ pId +";";
        ResultSet rs1 = con.executeSelect(sq);
        String userId1="";int it;
        
        %>
        
        <h1><%= pname %></h1>        
    
        <div class="row">
        <%
            
        if(session.getAttribute("username")!=null){
        String unn1 = (String)session.getAttribute("username");
        String sq333 = "SELECT cusId FROM customer WHERE username='"+ unn1  +"';";
        ResultSet rs333 = con.executeSelect(sq333);
        rs333.next();
        userId1 = rs333.getString(1);
            }
        while(rs1.next()){%>
        
<%      int itemId = rs1.getInt(1);
        String itemName = rs1.getString(2);
        Blob img = rs1.getBlob(3);
        double price = rs1.getDouble(4); int availabilty = rs1.getInt(5);
        
        
        if(session.getAttribute("username")!=null){
        String sq2 = "SELECT count(cId) FROM cart WHERE itemId="+ itemId +" AND userId="+userId1+";";
        ResultSet rs2 = con.executeSelect(sq2);
        rs2.next();
        it = rs2.getInt(1);
        }
        else{
        String sq2 = "SELECT count(cId) FROM cart WHERE itemId="+ itemId +";";
        ResultSet rs2 = con.executeSelect(sq2);
        rs2.next();
        it = rs2.getInt(1);
        }
        
        
        
        i =new Img();
        i.getImg(itemName,img);
        String inameedit = itemName.replaceAll("\\s+","");%>
        <div class="col-xs-3" style="border:#000000 3px solid;padding-bottom: 2%"><form name="product" action="" method="POST">
            <img style="" src="images/fooditems/<%= inameedit %>.jpg" width="100%" height="100%">
            <div ><%=itemName%></div><div><%= price%></div>  
        <%if(session.getAttribute("username")==null){%>
        <a href="login.jsp" style="color: black">Login</a>
        <% }
          else if(it<1){%>
            <input type="submit" class="btn-success" value="ADD" id="addbtn" name="addbtn" onclick="this.style.backgroundColor='black';clicke();" /><%}
else{%>
<input type="submit" value="Added" class="btn-default" id="addbtn" name="addedbtn" disabled="true" />
<%}
            %>
            <input type="hidden" name="itemid" value="<%= itemId %>">
            <input type="hidden" name="k" value="0">
            </form></div>
            
    <%  }
        i.close();
        con.close();
        //catch(Exception e){System.out.println(e.getMessage())
          //   ;}

   
    %>
                 

       </div>
        
        
        
      
     
     
    
    
</div>
       
        <jsp:include page="footer.jsp"/>  
        
        
        
        
            <script type="text/javascript">
            function clicke(){
               
    //    document.getElementById("addbtn").disbled = true;
                    /*     int key= Integer.parseInt(request.getParameter("k"));
                    System.out.println(item+"ye"+k);
                    Cookie c = new Cookie("item"+key,item);
                    c.setMaxAge(24 * 60 * 60);
                    response.addCookie(c);
                    k++;*/
            
                    <%
        
        try{
            String unn = (String)session.getAttribute("username");
        String sq33 = "SELECT cusId FROM customer WHERE username='"+ unn  +"';";
        
        ResultSet rs33 = con.executeSelect(sq33);
        rs33.next();
        String userId = rs33.getString(1);
        System.out.println(userId);
 
        
                           String item =null;
                    item =request.getParameter("itemid");                    
                    String s = "INSERT INTO cart(userId,itemId) VALUES("+userId+","+item+");";
                    String rest = con.execInsert(s);
                    System.out.println(rest+"res");
        //response.sendRedirect("product.jsp");
        }
        catch(Exception e){System.out.println(e.getLocalizedMessage()+"asd");}
 
                    %>
                      };

          
          </script>
    </body>    
</html>
