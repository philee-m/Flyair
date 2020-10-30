package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FlightResult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat:300,400,600\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Nova+Round&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/ionicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/lightslider.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
      out.write("    <!-- <link rel=\"stylesheet\" href=\"style.css\"> -->\n");
      out.write("    <title>Flight Result</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <nav class=\"navbar navbar-dark navbar-expand-md\">\n");
      out.write("            <div class=\"container-fluid\"><a class=\"navbar-brand\" href=\"#\"> </a><button data-toggle=\"collapse\"\n");
      out.write("                    class=\"navbar-toggler\" data-target=\"#navcol-1\"><span class=\"sr-only\">Toggle navigation</span><span\n");
      out.write("                        class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navcol-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav mx-auto\">\n");
      out.write("                        <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link active\" href=\"index.html\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"Local-Content.html\">About Us</a></li>\n");
      out.write("                        <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\"\n");
      out.write("                                href=\"International-content.html\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <section class=\"flight-search-results\">\n");
      out.write("        <div class=\"flight-result\">\n");
      out.write("            <div class=\"image\">\n");
      out.write("                <img src=\"assets/img/ethiopian airline.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"flight-details\">\n");
      out.write("                <div class=\"airline\">\n");
      out.write("                    DEPARTURE - Ethiopian Airline\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"timing\">\n");
      out.write("                    <div>\n");
      out.write("                        <h5>16:30</h5>\n");
      out.write("                        <h5>Kigali(KIA)</h5>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        16h 20m' <img src=\"assets/img/planetakeoff.png\" alt=\"\" width=\"30\">\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <h5>06:40</h5>\n");
      out.write("                        <h5>London(LHA)</h5>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"prices\">\n");
      out.write("                    <div>\n");
      out.write("                        <p>Only 4 tickets left</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"price\">\n");
      out.write("                        <div>\n");
      out.write("                            <h3>$340</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <button class=\"btn btn-success\" type=\"submit\">select</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"flight-result\">\n");
      out.write("            <div class=\"image\">\n");
      out.write("                <img src=\"assets/img/ethiopian airline.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"flight-details\">\n");
      out.write("                <div class=\"airline\">\n");
      out.write("                    DEPARTURE - Ethiopian Airline\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"timing\">\n");
      out.write("                    <div>\n");
      out.write("                        <h5>16:30</h5>\n");
      out.write("                        <h5>Kigali(KIA)</h5>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        16h 20m' <img src=\"assets/img/planetakeoff.png\" alt=\"\" width=\"30\">\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <h5>06:40</h5>\n");
      out.write("                        <h5>London(LHA)</h5>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"prices\">\n");
      out.write("                    <div>\n");
      out.write("                        <p>Only 4 tickets left</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"price\">\n");
      out.write("                        <div>\n");
      out.write("                            <h3>$340</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <button class=\"btn btn-success\" type=\"submit\">select</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"flight-result\">\n");
      out.write("            <div class=\"image\">\n");
      out.write("                <img src=\"assets/img/ethiopian airline.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"flight-details\">\n");
      out.write("                <div class=\"airline\">\n");
      out.write("                    DEPARTURE - Ethiopian Airline\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"timing\">\n");
      out.write("                    <div>\n");
      out.write("                        <h5>16:30</h5>\n");
      out.write("                        <h5>Kigali(KIA)</h5>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        16h 20m' <img src=\"assets/img/planetakeoff.png\" alt=\"\" width=\"30\">\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <h5>06:40</h5>\n");
      out.write("                        <h5>London(LHA)</h5>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"prices\">\n");
      out.write("                    <div>\n");
      out.write("                        <p>Only 4 tickets left</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"price\">\n");
      out.write("                        <div>\n");
      out.write("                            <h3>$340</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <button class=\"btn btn-success\" type=\"submit\">select</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <section class=\"footer-top\">\n");
      out.write("            <div>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"\">create content</a></li>\n");
      out.write("                    <li><a href=\"\">All programs</a></li>\n");
      out.write("                    <li><a href=\"\">Lorem ipsum dolor</a></li>\n");
      out.write("                    <li><a href=\"\">our terms and condition</a></li>\n");
      out.write("                    <li><a href=\"\">our terms and condition</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"\">Home</a></li>\n");
      out.write("                        <li><a href=\"\">About Us</a></li>\n");
      out.write("                        <li><a href=\"\">Contact us</a></li>\n");
      out.write("                        <li><a href=\"\">Contact us</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"\">Terms</a></li>\n");
      out.write("                        <li><a href=\"\">Privacy policy and cookie policy Us</a></li>\n");
      out.write("                        <li><a href=\"\">Contact us</a></li>\n");
      out.write("                        <li><a href=\"\">Featured courses</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <section class=\"footer-bottom container\">\n");
      out.write("            <a href=\"#\" class=\"logo\"></a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                <li><a href=\"\"><i class=\"fa fa-youtube-play\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                <li><a href=\"\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                <li><a href=\"\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                <li><a href=\"\"><i class=\"fa fa-google\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </section>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/lightslider.js\"></script>\n");
      out.write("    <script src=\"assets/js/script.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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
