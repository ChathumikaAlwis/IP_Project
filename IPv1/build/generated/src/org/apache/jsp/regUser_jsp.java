package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;

public final class regUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/register.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 session.invalidate(); 
      out.write("\n");
      out.write("        ");
 String status = (String) request.getAttribute("status"); 
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <h6 style=\"color:white\">");
      out.print( request.getAttribute("status") );
      out.write("<h6>   \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("    #contain {\n");
      out.write("    max-width: 750px;  \n");
      out.write("      </style>\n");
      out.write("      <script> \n");
      out.write("    $(function(){\n");
      out.write("      $(\"#includedHeader\").load(\"header.jsp\");\n");
      out.write("      $(\"#includedFooter\").load(\"footer.jsp\");\n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:#000000\">\n");
      out.write("  <div id=\"includedHeader\"></div> \n");
      out.write("  <br/><br/><br/><br/><br/><br/>\n");
      out.write("<div class=\"container\" id=\"contain\">\n");
      out.write("\t<div class=\"col-lg-12 well\" style=\"background-color:#000000\" >\n");
      out.write("\t<div class=\"row\" style=\"background-color:#000000\">\n");
      out.write("            <form action=\"userServlet\" method=\"POST\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\" style=\"color:#fff\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>First Name</label>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" placeholder=\"Enter First Name Here..\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Last Name</label>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\"  placeholder=\"Enter Last Name Here..\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\" style=\"color:#fff\">\n");
      out.write("\t\t\t\t\t\t\t<label>Address</label>\n");
      out.write("\t\t\t\t\t\t\t<textarea placeholder=\"Enter Address Here..\" rows=\"3\" class=\"form-control\"></textarea>\n");
      out.write("\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t<div class=\"row\" style=\"color:#fff\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>NIC</label>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Enter National ID Here..\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Contact</label>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Enter Contact Number Here..\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"form-group\" style=\"color:#fff\">\n");
      out.write("\t\t\t\t\t\t<label>UserName</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" placeholder=\"Enter UserName Here..\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t</div>\t\t\n");
      out.write("\t\t\t\t\t<div class=\"form-group\" style=\"color:#fff\">\n");
      out.write("\t\t\t\t\t\t<label>Email Address</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" placeholder=\"Enter Email Address Here..\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t<div class=\"form-group\" style=\"color:#fff\">\n");
      out.write("\t\t\t\t\t\t<label>Password</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"password\" placeholder=\"Enter Password Here..\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                            <div class=\"form-group\" style=\"color:#fff\">\n");
      out.write("\t\t\t\t\t\t<label>Re-Enter Password</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" placeholder=\"Re-Enter Password Here..\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                                        <input type=\"submit\" value=\"SIGN UP\" name=\"submit\" class=\"btn btn-lg btn-info\" style=\"background-color:#000000; border-color: #fff\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form> \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("  <br/><br/>\n");
      out.write("  <div id=\"includedFooter\"></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("           \n");
      out.write("    </body>\n");
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
