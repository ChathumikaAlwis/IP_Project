package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
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
String url="jdbc:mysql://localhost/test";

      out.write('\n');
 
String query="select catId,catname from foodcat";
//Connection conn=DriverManager.getConnection(url,username,password);
//Statement stmt=conn.createStatement();
//ResultSet rs=stmt.executeQuery(query);
ResultSet rs = conn.executeSelect(url, query);
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
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("     <div style=\"margin-top: 5%;height:100%\">\n");
      out.write("        ");

        String pId = request.getParameter("pid"); 
        String sql = "SELECT catname FROM foodcat WHERE catId="+ pId +";";
        ResultSet r = conn.executeSelect("jdbc:mysql://localhost/test", sql);
        r.next();
        String pname=r.getString(1);
        
      out.write("\n");
      out.write("        <h1>");
      out.print( pname );
      out.write("</h1>\n");
      out.write("    </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<head>\n");
      out.write("    <title>Footer with social icons</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        #myFooter {\n");
      out.write("\tbackground-color: #000000;\n");
      out.write("\tcolor:white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myFooter .footer-copyright{\n");
      out.write("\tbackground-color: #000000;\n");
      out.write("\tpadding-top:3px;\n");
      out.write("\tpadding-bottom:3px;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myFooter .footer-copyright p{\n");
      out.write("\tmargin:10px;\n");
      out.write("\tcolor: #ccc;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myFooter ul{\n");
      out.write("\tlist-style-type: none;\n");
      out.write("    padding-left: 0;\n");
      out.write("    line-height: 1.7;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myFooter h5{\n");
      out.write("\tfont-size: 18px;\n");
      out.write("    color: white;\n");
      out.write("    font-weight: bold;\n");
      out.write("    margin-top: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myFooter a{\n");
      out.write("\tcolor:#d2d1d1;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myFooter a:hover, #myFooter a:focus{\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tcolor:white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myFooter .myCols{\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myFooter .social-networks{\n");
      out.write("\ttext-align: center;\n");
      out.write("\tpadding-top: 30px;\n");
      out.write("\tpadding-bottom: 38px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myFooter .social-networks a{\n");
      out.write("    font-size: 32px;\n");
      out.write("    margin-right: 5px;\n");
      out.write("    margin-left: 5px;\n");
      out.write("    color: #f9f9f9;\n");
      out.write("    padding: 10px;\n");
      out.write("    transition: 0.2s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myFooter .social-networks a:hover{\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myFooter .facebook:hover{\n");
      out.write("\tcolor:#0077e2;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myFooter .google:hover{\n");
      out.write("\tcolor:#ef1a1a;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myFooter .twitter:hover{\n");
      out.write("\tcolor: #00aced;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 767px){\n");
      out.write("\t#myFooter {\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("/* CSS used for positioning the footers at the bottom of the page. */\n");
      out.write("/* You can remove this. */\n");
      out.write("\n");
      out.write("\n");
      out.write("html{\n");
      out.write("\theight: 100% !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body{\n");
      out.write("    display: flex;\n");
      out.write("    display: -webkit-flex;\n");
      out.write("    flex-direction: column;\n");
      out.write("    -webkit-flex-direction: column;\n");
      out.write("    height: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".content{\n");
      out.write("\tflex: 1 0 auto;\n");
      out.write("\t-webkit-flex: 1 0 auto;\n");
      out.write("\tmin-height: 200px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myFooter{\n");
      out.write("\tflex: 0 0 auto;\n");
      out.write("    -webkit-flex: 0 0 auto;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <footer id=\"myFooter\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3 myCols\">\n");
      out.write("                    <h5>Get started</h5>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">Sign up</a></li>\n");
      out.write("                        <li><a href=\"#\">Downloads</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3 myCols\">\n");
      out.write("                    <h5>About us</h5>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">Company Information</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact us</a></li>\n");
      out.write("                        <li><a href=\"#\">Reviews</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3 myCols\">\n");
      out.write("                    <h5>Support</h5>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">FAQ</a></li>\n");
      out.write("                        <li><a href=\"#\">Help desk</a></li>\n");
      out.write("                        <li><a href=\"#\">Forums</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3 myCols\">\n");
      out.write("                    <h5>Legal</h5>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">Terms of Service</a></li>\n");
      out.write("                        <li><a href=\"#\">Terms of Use</a></li>\n");
      out.write("                        <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"social-networks\">\n");
      out.write("            <a href=\"#\" class=\"twitter\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("            <a href=\"#\" class=\"facebook\"><i class=\"fa fa-facebook-official\"></i></a>\n");
      out.write("            <a href=\"#\" class=\"google\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("  \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
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
