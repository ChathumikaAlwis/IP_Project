<%-- 
    Document   : pictst
    Created on : Apr 18, 2018, 2:23:36 AM
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
    </head>
    <body><form name="savepic" action="savepic" method="POST" enctype="multipart/form-data">
            <% DbConnection conn = new DbConnection();
            String query="select catId,catName from menucat";
            ResultSet rs = conn.executeSelect(query); %>
            
            <select name="catid"><%
                while(rs.next()){
                    //System.out.println(rs.getString(2));
                %>
                  <option value="<%=rs.getString(1)%>"><%=rs.getString(2)%></option><%}%> 
            </select>
            <%
            rs.close();
            conn.close();

            %>
            <input type="text" name="itemname" value="" size="10" />
            
            
            <br/><br/>
            <input type="file" name="pic"/>
        <input type="submit" value="submit" />
        </form>
        
    </body>
</html>
