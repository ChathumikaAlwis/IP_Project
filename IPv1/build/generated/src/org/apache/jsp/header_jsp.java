package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypckg.DbConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Connection;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
 
String query="select catId,catname from foodcat";
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
      out.write("        <li><a href=\"#about\" style=\"color:#fff\"><i class=\"glyphicon glyphicon-shopping-cart\"></i>CART</a></li>\n");
      out.write("        ");
 if(session.getAttribute("username")==null) {
      out.write("\n");
      out.write("        <li><a href=\"register.jsp\" style=\"color:#fff\">REGISTER</a></li>\n");
      out.write("        <li><a href=\"login.jsp\" style=\"color:#fff\">LOGIN</a></li>  ");
}
        else{   
      out.write("\n");
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
