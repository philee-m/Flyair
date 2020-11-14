package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Tickets_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

//            if (session.getAttribute("user") == "null") {
//                response.sendRedirect("Login.jsp");
//            }
        
      out.write("\n");
      out.write("        <header>\n");
      out.write("            <nav class=\"navbar navbar-dark navbar-expand-md\">\n");
      out.write("                <div class=\"container-fluid\"><a class=\"navbar-brand\" href=\"#\"> </a><button data-toggle=\"collapse\"\n");
      out.write("                                                                                           class=\"navbar-toggler\" data-target=\"#navcol-1\"><span class=\"sr-only\">Toggle navigation</span><span\n");
      out.write("                            class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navcol-1\">\n");
      out.write("                        <ul class=\"nav navbar-nav mx-auto\">\n");
      out.write("                            <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link active\" href=\"index.html\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"Local-Content.html\">About Us</a></li>\n");
      out.write("                            <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\"\n");
      out.write("                                                                        href=\"International-content.html\">Contact</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"welcome\">\n");
      out.write("            <div class=\"centered\">\n");
      out.write("                <h3>Black Panther</h3>\n");
      out.write("                <h3>2020-01-11</h3>\n");
      out.write("                <h3>20:00</h3>\n");
      out.write("\n");
      out.write("                <div class=\"ticket\">\n");
      out.write("                    <h5>Black Panther</h5>\n");
      out.write("                    <h5>200 seats</h5>\n");
      out.write("                    <h5>40 per ticket</h5>\n");
      out.write("                    <a href=\"buyticket.html\" class=\"btn btn-primary\">Buy ticket</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"ticket\">\n");
      out.write("                    <h5>Black Panther</h5>\n");
      out.write("                    <h5>200 seats</h5>\n");
      out.write("                    <h5>40 per ticket</h5>\n");
      out.write("                    <a href=\"buyticket.html\" class=\"btn btn-primary\">Buy ticket</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
