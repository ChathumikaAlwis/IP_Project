package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypckg.Img;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import mypckg.DbConnection;
import mypckg.DbConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Connection;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Header</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("  <style>\n");
      out.write("      .navbar {\n");
      out.write("    margin-bottom: 0;\n");
      out.write("    background-color: #000000;\n");
      out.write("    z-index: 9999;\n");
      out.write("    border: 0;\n");
      out.write("    font-size: 12px !important;\n");
      out.write("    line-height: 1.42857143 !important;\n");
      out.write("    letter-spacing: 4px;\n");
      out.write("    border-radius: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(" .navbar .navbar-brand {\n");
      out.write("    color: #fff !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar-nav li a:hover, .navbar-nav li.active a {\n");
      out.write("    color: #000000 !important;\n");
      out.write("    background-color: #fff !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar-default .navbar-toggle {\n");
      out.write("    border-color: transparent;\n");
      out.write("    color: #fff !important;\n");
      out.write("}\n");
      out.write("  </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span> \n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"homepage.jsp\">Restaurant.com</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("        <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" style=\"color:#fff\">MENU<span class=\"caret\"></span></a>\n");
      out.write("            <ul class=\"dropdown-menu\" style=\"background-color:#000000\">\n");
      out.write("          \n");
      out.write("                ");

DbConnection conn = new DbConnection();
//String url="jdbc:mysql://localhost/test";

      out.write('\n');
 
String query="select catId,catName from menucat";
//Connection conn=DriverManager.getConnection(url,username,password);
//Statement stmt=conn.createStatement();
//ResultSet rs=stmt.executeQuery(query);
ResultSet rs = conn.executeSelect(query);
while(rs.next())
{

      out.write("\n");
      out.write("<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/product.jsp?pid=");
      out.print(rs.getString("catId"));
      out.write("\" style=\"color:#fff\">");
      out.print(rs.getString("catname") );
      out.write("</a></li>\n");

}
rs.close();
conn.close();

      out.write(" \n");
      out.write("                \n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("        <li><a href=\"homepage.jsp#contactdiv\" style=\"color:#fff\">CONTACT US</a></li>\n");
      out.write("      </ul>\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("        ");
 if(session.getAttribute("username")==null) {
      out.write("\n");
      out.write("        <li><a href=\"register.jsp\" style=\"color:#fff\">REGISTER</a></li>\n");
      out.write("        <li><a href=\"login.jsp\" style=\"color:#fff\">LOGIN</a></li>  ");
}
        else{   
      out.write("\n");
      out.write("        <li><a href=\"order.jsp\" style=\"color:#fff\"><i class=\"glyphicon glyphicon-shopping-cart\"></i>CART</a></li>\n");
      out.write("        <li><a href=\"logout.jsp\" style=\"color:#fff\">");
      out.print( session.getAttribute("username") );
      out.write("</a></li>  ");

        } 
        
      out.write("\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <div class=\"container-fluid\" style=\"margin-top: 4%\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        ");

        String pId = request.getParameter("pid"); 
        DbConnection con = new DbConnection(); 
        String sql = "SELECT catName FROM menucat WHERE catId="+ pId +";";
        ResultSet r = con.executeSelect(sql);
        r.next();
        String pname=r.getString(1);
        Img i=null;
        String sq = "SELECT itemId,itemName,img,price,availability FROM menuitem WHERE catId="+ pId +";";
        ResultSet rs1 = con.executeSelect(sq);
        
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        <h1>");
      out.print( pname );
      out.write("</h1>        \n");
      out.write("    \n");
      out.write("        <div class=\"row\">\n");
      out.write("        ");

        while(rs1.next()){
      out.write("\n");
      out.write("        \n");
      int itemId = rs1.getInt(1);
        String itemName = rs1.getString(2);
        Blob img = rs1.getBlob(3);
        double price = rs1.getDouble(4); int availabilty = rs1.getInt(5);
        
        
        String sq2 = "SELECT count(cId) FROM cart WHERE itemId="+ itemId +";";
        ResultSet rs2 = con.executeSelect(sq2);
        rs2.next();
        int it = rs2.getInt(1);
        
        
        
        
        i =new Img();
        i.getImg(itemName,img);
        String inameedit = itemName.replaceAll("\\s+","");
      out.write("\n");
      out.write("        <div class=\"col-xs-3\" style=\"border:#000000 3px solid;padding-bottom: 2%\"><form name=\"product\" action=\"\" method=\"POST\">\n");
      out.write("            <img style=\"\" src=\"images/fooditems/");
      out.print( inameedit );
      out.write(".jpg\" width=\"100%\" height=\"100%\">\n");
      out.write("            <div >");
      out.print(itemName);
      out.write("</div><div>");
      out.print( price);
      out.write("</div>  \n");
      out.write("            ");
if(it<1){
      out.write("\n");
      out.write("            <input type=\"submit\" class=\"btn-success\" value=\"ADD\" id=\"addbtn\" name=\"addbtn\" onclick=\"clicke();\" />");
}
else{
      out.write("\n");
      out.write("<input type=\"submit\" value=\"Added\" class=\"btn-default\" id=\"addbtn\" name=\"addbtn\" disabled=\"true\" onclick=\"clicke(); />\n");
}
            
      out.write("\n");
      out.write("            <input type=\"hidden\" name=\"itemid\" value=\"");
      out.print( itemId );
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"k\" value=\"0\">\n");
      out.write("            </form></div>\n");
      out.write("            \n");
      out.write("    ");
  }
        i.close();
        con.close();
        //catch(Exception e){System.out.println(e.getMessage())
          //   ;}

   
    
      out.write("\n");
      out.write("                 \n");
      out.write("    <script>\n");
      out.write("            function clicke(){\n");
      out.write("                document.getElementById(\"addbtn\").disabled = true;\n");
      out.write("                //    document.getElementById(\"addbtn\").disbled = true;\n");
      out.write("                    /*     int key= Integer.parseInt(request.getParameter(\"k\"));\n");
      out.write("                    System.out.println(item+\"ye\"+k);\n");
      out.write("                    Cookie c = new Cookie(\"item\"+key,item);\n");
      out.write("                    c.setMaxAge(24 * 60 * 60);\n");
      out.write("                    response.addCookie(c);\n");
      out.write("                    k++;*/\n");
      out.write("            alert('ds');        \n");
      out.write("                    ");

        if(session.getAttribute("username")==null){response.sendRedirect("login.jsp");}
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
        
        }
        catch(Exception e){System.out.println(e.getLocalizedMessage()+"asd");}
 
                    
      out.write("\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("          \n");
      out.write("          </script>\n");
      out.write("       </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("      \n");
      out.write("     \n");
      out.write("     \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("       \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("  \n");
      out.write("    </body>    \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
