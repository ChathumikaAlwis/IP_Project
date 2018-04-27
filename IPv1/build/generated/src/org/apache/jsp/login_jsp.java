package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        ");
 session.invalidate(); 
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("   <script> \n");
      out.write("    $(function(){\n");
      out.write("      $(\"#includedHeader\").load(\"header.html\");\n");
      out.write("      $(\"#includedFooter\").load(\"footer.html\");\n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("    <body  style=\"background-color: #000000\">\n");
      out.write("                \n");
      out.write("    <div id=\"includedHeader\"></div>\n");
      out.write("    <br/><br/>\n");
      out.write("    <br/><br/>\n");
      out.write("        <div class=\"container\">    \n");
      out.write("        <div id=\"loginbox\" style=\"margin-top:50px;\" class=\"mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2\">                    \n");
      out.write("            <div class=\"panel panel-info\">\n");
      out.write("                    <div class=\"panel-heading\" style=\"background-color: #000000\">\n");
      out.write("                        <div class=\"panel-title\" style=\"background-color: #000000; color: #ffffff\">Sign In</div>\n");
      out.write("                        <div style=\"float:right; font-size: 80%; position: relative; top:-10px;\"><a href=\"#\">Forgot password?</a></div>\n");
      out.write("                    </div>     \n");
      out.write("\n");
      out.write("                    <div style=\"padding-top:30px; background-color: #000000\" class=\"panel-body\">\n");
      out.write("\n");
      out.write("                        <div style=\"display:none\" id=\"login-alert\" class=\"alert alert-danger col-sm-12\"></div>\n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("                                    \n");
      out.write("                            ");
 String status = (String)request.getAttribute("status");
                            if(status!=null){
                            
      out.write("\n");
      out.write("                            <h5 class=\"text-danger\">");
      out.print( status );
      out.write("</h5>  ");
}
      out.write("\n");
      out.write(" <form name=\"loginform\" id =\"loginform\" class=\"form-horizontal\" rple=\"form\" action=\"loginServlet\" method=\"POST\">\n");
      out.write("                            <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("                                        <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\n");
      out.write("                                        <input id=\"login-username\" type=\"text\" class=\"form-control\" name=\"username\" value=\"\" placeholder=\"username or email\">                                        \n");
      out.write("                                    </div>\n");
      out.write("                                \n");
      out.write("                            <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("                                        <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-lock\"></i></span>\n");
      out.write("                                        <input id=\"login-password\" type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"password\">\n");
      out.write("                                    </div>\n");
      out.write("                                \n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <div class=\"checkbox\" style=\"color: #ffffff\">\n");
      out.write("                                        <label>\n");
      out.write("                                          <input id=\"login-remember\" type=\"checkbox\" name=\"remember\" value=\"1\"> Remember me\n");
      out.write("                                        </label>\n");
      out.write("                                      </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div style=\"margin-top:10px\" class=\"form-group\">\n");
      out.write("                                    <!-- Button -->\n");
      out.write("\n");
      out.write("                                    <div class=\"col-sm-12 controls\">\n");
      out.write("                                        </a><input type=\"submit\" id=\"btn-login\" class=\"btn-success\" value=\"Login\" name=\"login\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12 control\">\n");
      out.write("                                        <div style=\"border-top: 1px solid#888; padding-top:15px; font-size:85%; color: #ffffff\" >\n");
      out.write("                                            Don't have an account! \n");
      out.write("                                        <a href=\"register.html\">\n");
      out.write("                                            Sign Up Here\n");
      out.write("                                        </a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>    \n");
      out.write("                                 \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>                     \n");
      out.write("                    </div>  \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    <br/><br/>\n");
      out.write("    <br/><br/>\n");
      out.write("     <div id=\"includedFooter\"></div>\n");
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
