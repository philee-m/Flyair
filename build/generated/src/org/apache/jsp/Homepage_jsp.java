package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat:300,400,600\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Nova+Round&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/ionicons.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/lightslider.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\r\n");
      out.write("        <!-- <link rel=\"stylesheet\" href=\"style.css\"> -->\r\n");
      out.write("        <title>Flyair Homepage</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            <nav class=\"navbar navbar-dark navbar-expand-md\">\r\n");
      out.write("                <div class=\"container-fluid\"><a class=\"navbar-brand\" href=\"#\"> </a><button data-toggle=\"collapse\"\r\n");
      out.write("                                                                                           class=\"navbar-toggler\" data-target=\"#navcol-1\"><span class=\"sr-only\">Toggle navigation</span><span\r\n");
      out.write("                            class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navcol-1\">\r\n");
      out.write("                        <ul class=\"nav navbar-nav mx-auto\">\r\n");
      out.write("                            <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link active\" href=\"index.html\">Home</a></li>\r\n");
      out.write("                            <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"Local-Content.html\">About Us</a></li>\r\n");
      out.write("                            <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"International-content.html\">Contact Us</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <ul class=\"nav navbar-nav mx-auto\">\r\n");
      out.write("                            <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link active\" href=\"index.html\">My Tickets</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <section class=\"welcome\">\r\n");
      out.write("            <div class=\"centered\">\r\n");
      out.write("                <h2>Search Flight</h2>\r\n");
      out.write("                <form action=\"FlightControl\" method=\"GET\">\r\n");
      out.write("                    <div class=\"inputs\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"inputbox\">\r\n");
      out.write("                            <label for=\"\">Depart From?</label>\r\n");
      out.write("                            <input type=\"text\" name=\"takeoffPlace\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"inputbox\">\r\n");
      out.write("                            <label for=\"\">Depart To?</label>\r\n");
      out.write("                            <input type=\"text\" name=\"destinationPlace\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"inputbox\">\r\n");
      out.write("                            <label for=\"\">Departure Date</label>\r\n");
      out.write("                            <input type=\"date\" name=\"departureDate\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"inputbox\">\r\n");
      out.write("                            <label for=\"\">Class</label>\r\n");
      out.write("                            <select name=\"class\">\r\n");
      out.write("                                <option value=\"ECONOMY\">ECONOMY</option>\r\n");
      out.write("                                <option value=\"PREMIUM_ECONOMY\">PREMIUM_ECONOMY</option>\r\n");
      out.write("                                <option value=\"BUSINESS_CLASS\">BUSINESS_CLASS</option>\r\n");
      out.write("                                <option value=\"FIRST_CLASS\">FIRST_CLASS</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <button type=\"submit\" class=\"admin-btn\">search</button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <footer>\r\n");
      out.write("            <section class=\"footer-top\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"\">create content</a></li>\r\n");
      out.write("                        <li><a href=\"\">All programs</a></li>\r\n");
      out.write("                        <li><a href=\"\">Lorem ipsum dolor</a></li>\r\n");
      out.write("                        <li><a href=\"\">our terms and condition</a></li>\r\n");
      out.write("                        <li><a href=\"\">our terms and condition</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"\">Home</a></li>\r\n");
      out.write("                            <li><a href=\"\">About Us</a></li>\r\n");
      out.write("                            <li><a href=\"\">Contact us</a></li>\r\n");
      out.write("                            <li><a href=\"\">Contact us</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"\">Terms</a></li>\r\n");
      out.write("                            <li><a href=\"\">Privacy policy and cookie policy Us</a></li>\r\n");
      out.write("                            <li><a href=\"\">Contact us</a></li>\r\n");
      out.write("                            <li><a href=\"\">Featured courses</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </section>\r\n");
      out.write("            <section class=\"footer-bottom container\">\r\n");
      out.write("                <a href=\"#\" class=\"logo\"></a>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("                    <li><a href=\"\"><i class=\"fa fa-youtube-play\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("                    <li><a href=\"\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("                    <li><a href=\"\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("                    <li><a href=\"\"><i class=\"fa fa-google\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </section>\r\n");
      out.write("        </footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/lightslider.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
