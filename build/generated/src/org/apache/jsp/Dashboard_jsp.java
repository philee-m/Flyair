package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Domain.Operator;
import java.text.SimpleDateFormat;
import java.util.List;
import Dao.GenericDao;
import Domain.Flight;
import Controller.DashboardService;

public final class Dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin dashboard</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"xresources/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"xresources/font-awesome.min.css\">\n");
      out.write("        <script src=\"xresources/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <script src=\"xresources/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            String display_hide = "none";
//            if (session.getAttribute("user") == null) {
//                response.sendRedirect("Login.jsp");
//            } else {
//                String username = (String) session.getAttribute("user");
//                String post = (String) session.getAttribute("operatorpost");
//                display_hide = (post.equalsIgnoreCase("ADMIN")) ? "block" : "none";
//            }
            GenericDao genericDao = new GenericDao();
            SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
            SimpleDateFormat timeformat = new SimpleDateFormat("HH:mm:ss");
            List<Flight> flightlist = (List<Flight>) genericDao.findAll(new Flight());
            List<Operator> operatorlist = (List<Operator>) genericDao.findAll(new Operator());
            DashboardService ds = new DashboardService();
            request.setAttribute("genderlist", ds.getGenderList());
            request.setAttribute("statuslist", ds.getAccountstatuslist());
            request.setAttribute("postlist", ds.getPostlist());
            request.setAttribute("categorylist", ds.getCategorylist());
            session.setAttribute("action", "create");

        
      out.write("\n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("            <h2 style=\"font-size: 20px; font-weight: bold;text-align: center;\">Dashboard</h2>\n");
      out.write("            <div class=\"separator\"></div>\n");
      out.write("            <a href=\"#\" onclick=\"openMenu(event, 'ticket-tab')\" class=\"sidebar-a\"><img src=\"add.svg\" class=\"sidebar-icon\" alt=\"\"> Add flight</a>\n");
      out.write("            <a href=\"#\" onclick=\"openMenu(event, 'view-ticket-tab')\"><img src=\"update.svg\" class=\"sidebar-icon\" alt=\"\">Update flight</a>\n");
      out.write("            <a href=\"#\" style=\"display: block\" onclick=\"openMenu(event, 'operator-tab')\" class=\"sidebar-a\"><img src=\"add.svg\" class=\"sidebar-icon\" alt=\"\"> Add Operator</a>\n");
      out.write("            <a href=\"#\" style=\"display: block\" onclick=\"openMenu(event, 'view-operator-tab')\"><img src=\"update.svg\" class=\"sidebar-icon\" alt=\"\">Update Operator</a>\n");
      out.write("            <a href=\"logout.jsp\"><img src=\"logout.svg\" class=\"sidebar-icon\" alt=\"\">logout</a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"admin\">\n");
      out.write("            <div class=\"home admin-tab\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"admin-tab\" id=\"ticket-tab\" style=\"display: none;\">\n");
      out.write("                <h2>Add Flight</h2>\n");
      out.write("                <form action=\"FlightControl\" method=\"POST\">\n");
      out.write("                    <div class=\"inputs\">\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">Airline Name</label>\n");
      out.write("                            <input type=\"text\" name=\"airline\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">takeoff place</label>\n");
      out.write("                            <input type=\"text\" name=\"takeoffPlace\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">takeoff airport</label>\n");
      out.write("                            <input type=\"text\" name=\"takeoffAirport\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">Destination Place</label>\n");
      out.write("                            <input type=\"text\" name=\"destinationPlace\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">Destination Airport</label>\n");
      out.write("                            <input type=\"text\" name=\"destinationAirport\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">Departure Date</label>\n");
      out.write("                            <input type=\"date\" name=\"departureDate\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">Departure Time</label>\n");
      out.write("                            <input type=\"time\" name=\"departureTime\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">Journey Hours</label>\n");
      out.write("                            <input type=\"number\" step=\"0.1\" name=\"journeyHrs\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <h2 style=\"text-align: center\">Flight Category</h2>\n");
      out.write("                    <div class=\"inputs\">\n");
      out.write("                        <table id=\"category-table\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>category name</th>\n");
      out.write("                                    <th>category seats</th>\n");
      out.write("                                    <th>category price</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><input type=\"text\" name=\"catname1\"></td>\n");
      out.write("                                    <td><input type=\"number\" name=\"catseats1\"></td>\n");
      out.write("                                    <td><input type=\"number\" name=\"catprice1\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"number\" name=\"catrows\" id=\"totalrows\" hidden>\n");
      out.write("                    <input type=\"text\" name=\"action\" value=\"addflight\" hidden>\n");
      out.write("                    <button type=\"button\" class=\"admin-btn\" onclick=\"add()\">+</button>\n");
      out.write("                    <button type=\"button\" class=\"admin-btn\" onclick=\"remove()\">-</button><br>\n");
      out.write("                    <button type=\"submit\" class=\"admin-btn\">submit</button>\n");
      out.write("                    <label for=\"\">press +, - button to add or remove category respectively</label>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- view tickets,ticket table ,search tickets -->\n");
      out.write("\n");
      out.write("            <div class=\"admin-tab\" id=\"view-ticket-tab\" style=\"display: none;\">\n");
      out.write("                <h2>View Flights</h2>\n");
      out.write("                <div class=\"filter\">\n");
      out.write("                    <a href=\"Dashboard.jsp\"></a>\n");
      out.write("                </div>\n");
      out.write("                <table>\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Airline</th>\n");
      out.write("                            <th>Takeoff place</th>\n");
      out.write("                            <th>Takeoff airport</th>\n");
      out.write("                            <th>Destination Place</th>\n");
      out.write("                            <th>Destination Airport</th>\n");
      out.write("                            <th>Departure Date</th>\n");
      out.write("                            <th>Departure Time</th>\n");
      out.write("                            <th>Action</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
                            int i = 0;
                            for (Flight flightinstance : flightlist) {
                                i++;//this will provide the position of the object to update
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(flightinstance.getAirline());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(flightinstance.getTakeoffPlace());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(flightinstance.getTakeoffAirport());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(flightinstance.getDestinationPlace());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(flightinstance.getDestinationAirport());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(dateformat.format(flightinstance.getDepartureDate()));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(timeformat.format(flightinstance.getDepartureTime()));
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"UpdateFlight.jsp?flightid=");
      out.print(flightinstance.getId());
      out.write("\"><button>Edit</button></a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"admin-tab\" id=\"operator-tab\" style=\"display: none;\">\n");
      out.write("                <h2>operator Addition form</h2>\n");
      out.write("                <form action=\"OperatorControl\" method=\"post\">\n");
      out.write("                    <div class=\"inputs\">\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">First name <span>*</span></label>\n");
      out.write("                            <input type=\"text\" name=\"firstname\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">last name <span>*</span></label>\n");
      out.write("                            <input type=\"text\" name=\"lastname\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">gender</label>\n");
      out.write("                            <select name=\"gender\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">Date Of Birth</label>\n");
      out.write("                            <input type=\"date\" name=\"dateofbirth\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">Identification Type</label>\n");
      out.write("                            <select name=\"identificationtype\">\n");
      out.write("                                <option value=\"NATIONAL_ID\">NATIONAL_ID</option>\n");
      out.write("                                <option value=\"PASSPORT\">PASSPORT</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">ID Number</label>\n");
      out.write("                            <input type=\"text\" name=\"idnumber\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">Nationality</label>\n");
      out.write("                            <input type=\"text\" name=\"nationality\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">Email <span>*</span></label>\n");
      out.write("                            <input type=\"text\" name=\"email\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">Phone number <span>*</span></label>\n");
      out.write("                            <input type=\"text\" name=\"phonenumber\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">Country <span>*</span></label>\n");
      out.write("                            <input type=\"text\" name=\"country\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">City <span>*</span></label>\n");
      out.write("                            <input type=\"text\" name=\"city\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">Street Address <span>*</span></label>\n");
      out.write("                            <input type=\"text\" name=\"street\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <h2></h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <h2 style=\"text-align: center\">Account Details</h2>\n");
      out.write("                    <div class=\"inputs\">\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">User name <span>*</span></label>\n");
      out.write("                            <input type=\"text\" name=\"username\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">Post <span>*</span></label>\n");
      out.write("                            <select name=\"post\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">Account Status <span>*</span></label>\n");
      out.write("                            <select name=\"status\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputbox\">\n");
      out.write("                            <label for=\"\">password <span>*</span></label>\n");
      out.write("                            <input type=\"password\" name=\"password\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"text\" name=\"action\" hidden value=\"addoperator\">\n");
      out.write("                    <button type=\"submit\" class=\"admin-btn\">submit</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"admin-tab\" id=\"view-operator-tab\" style=\"display: none;\">\n");
      out.write("                <h2>View Operators</h2>\n");
      out.write("                <div class=\"filter\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <table>\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>First Name</th>\n");
      out.write("                            <th>Last Name</th>\n");
      out.write("                            <th>City</th>\n");
      out.write("                            <th>Email</th>\n");
      out.write("                            <th>Phone Number</th>\n");
      out.write("                            <th>Date Created 1</th>\n");
      out.write("                            <th>Date Created 2</th>\n");
      out.write("                            <th>Action</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                            for (Operator operatorInstance : operatorlist) {


                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(operatorInstance.getFirstname());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(operatorInstance.getLastname());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(operatorInstance.getDateOfBirth());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(operatorInstance.getNationality());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(operatorInstance.getAddress().getEmail());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(dateformat.format(operatorInstance.getCreatedon()));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(operatorInstance.getCreatedon());
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"UpdateOperator.jsp?operatorid=");
      out.print(operatorInstance.getId());
      out.write("\"><button>Edit</button></a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function openMenu(evt, MenuName) {\n");
      out.write("                var i, x, tablinks;\n");
      out.write("                x = document.getElementsByClassName(\"admin-tab\");\n");
      out.write("                for (i = 0; i < x.length; i++) {\n");
      out.write("                    x[i].style.display = \"none\";\n");
      out.write("                }\n");
      out.write("                document.getElementById(MenuName).style.display = \"flex\";\n");
      out.write("                evt.currentTarget.className += \" w3-grey\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function add() {\n");
      out.write("\n");
      out.write("                var tableRef = document.getElementById('category-table').getElementsByTagName('tbody')[0];\n");
      out.write("                var rowsnumber = tableRef.rows.length + 1;\n");
      out.write("\n");
      out.write("                var newRow = tableRef.insertRow();\n");
      out.write("                var newCell = newRow.insertCell(0);\n");
      out.write("                var newInput = document.createElement(\"INPUT\");\n");
      out.write("                newInput.setAttribute(\"type\", \"text\");\n");
      out.write("                newInput.setAttribute(\"name\", \"catname\" + rowsnumber);\n");
      out.write("                newCell.appendChild(newInput);\n");
      out.write("\n");
      out.write("                var newCell = newRow.insertCell(1);\n");
      out.write("                var newInput = document.createElement(\"INPUT\");\n");
      out.write("                newInput.setAttribute(\"type\", \"number\");\n");
      out.write("                newInput.setAttribute(\"name\", \"catseats\" + rowsnumber);\n");
      out.write("                newCell.appendChild(newInput);\n");
      out.write("\n");
      out.write("                var newCell = newRow.insertCell(2);\n");
      out.write("                var newInput = document.createElement(\"INPUT\");\n");
      out.write("                newInput.setAttribute(\"type\", \"number\");\n");
      out.write("                newInput.setAttribute(\"name\", \"catprice\" + rowsnumber);\n");
      out.write("                newCell.appendChild(newInput);\n");
      out.write("                document.getElementById('totalrows').value = tableRef.rows.length;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            function remove() {\n");
      out.write("                var tableRef = document.getElementById('category-table').getElementsByTagName('tbody')[0];\n");
      out.write("                tableRef.deleteRow(tableRef.rows.length - 1);\n");
      out.write("                document.getElementById('totalrows').value = tableRef.rows.length;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${genderlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("gender");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${postlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("post");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${statuslist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("status");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
