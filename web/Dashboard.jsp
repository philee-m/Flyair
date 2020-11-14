<%-- 
    Document   : Dashboard
    Created on : Oct 27, 2020, 6:59:38 PM
    Author     : Philip
--%>

<%@page import="Domain.Operator"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="Dao.GenericDao"%>
<%@page import="Domain.Flight"%>
<%@page import="Controller.DashboardService"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin dashboard</title>
        <link rel="stylesheet" href="xresources/bootstrap.min.css">
        <link rel="stylesheet" href="xresources/font-awesome.min.css">
        <script src="xresources/jquery-3.4.1.min.js"></script>
        <script src="xresources/bootstrap.min.js"></script>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>

        <%
            String display_hide = null;
            if (session.getAttribute("user") == null) {
                response.sendRedirect("Login.jsp");
            } else {
                String username = (String) session.getAttribute("user");
                String post = (String) session.getAttribute("operatorpost");
                display_hide = (post.equalsIgnoreCase("ADMIN")) ? "block" : "none";
            }
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

        %>
        <div class="sidebar">
            <h2 style="font-size: 20px; font-weight: bold;text-align: center;">Dashboard</h2>
            <div class="separator"></div>
            <a href="#" onclick="openMenu(event, 'ticket-tab')" class="sidebar-a"><img src="add.svg" class="sidebar-icon" alt=""> Add flight</a>
            <a href="#" onclick="openMenu(event, 'view-ticket-tab')"><img src="update.svg" class="sidebar-icon" alt="">Update flight</a>
            <a href="#" style="display: <%=display_hide%>" onclick="openMenu(event, 'operator-tab')" class="sidebar-a"><img src="add.svg" class="sidebar-icon" alt=""> Add Operator</a>
            <a href="#" style="display: <%=display_hide%>" onclick="openMenu(event, 'view-operator-tab')"><img src="update.svg" class="sidebar-icon" alt="">Update Operator</a>
            <a href="logout.jsp"><img src="logout.svg" class="sidebar-icon" alt="">logout</a>

        </div>
        <div class="admin">
            <div class="home admin-tab">

            </div>
            <div class="admin-tab" id="ticket-tab" style="display: none;">
                <h2>Add Flight</h2>
                <form action="FlightControl" method="POST">
                    <div class="inputs">
                        <div class="inputbox">
                            <label for="">Airline Name</label>
                            <input type="text" name="airline">
                        </div>

                        <div class="inputbox">
                            <label for="">takeoff place</label>
                            <input type="text" name="takeoffPlace">
                        </div>
                        <div class="inputbox">
                            <label for="">takeoff airport</label>
                            <input type="text" name="takeoffAirport">
                        </div>
                        <div class="inputbox">
                            <label for="">Destination Place</label>
                            <input type="text" name="destinationPlace">
                        </div>
                        <div class="inputbox">
                            <label for="">Destination Airport</label>
                            <input type="text" name="destinationAirport">
                        </div>
                        <div class="inputbox">
                            <label for="">Departure Date</label>
                            <input type="date" name="departureDate">
                        </div>
                        <div class="inputbox">
                            <label for="">Departure Time</label>
                            <input type="time" name="departureTime">
                        </div>
                        <div class="inputbox">
                            <label for="">Journey Hours</label>
                            <input type="number" step="0.1" name="journeyHrs">
                        </div>
                    </div>
                    <h2 style="text-align: center">Flight Category</h2>
                    <div class="inputs">
                        <table id="category-table">
                            <thead>
                                <tr>
                                    <th>category name</th>
                                    <th>category seats</th>
                                    <th>category price</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td><input type="text" name="catname1"></td>
                                    <td><input type="number" name="catseats1"></td>
                                    <td><input type="number" name="catprice1"></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <input type="number" name="catrows" id="totalrows" hidden>
                    <input type="text" name="action" value="addflight" hidden>
                    <button type="button" class="admin-btn" onclick="add()">+</button>
                    <button type="button" class="admin-btn" onclick="remove()">-</button><br>
                    <button type="submit" class="admin-btn">submit</button>
                    <label for="">press +, - button to add or remove category respectively</label>
                </form>
            </div>



            <!-- view tickets,ticket table ,search tickets -->

            <div class="admin-tab" id="view-ticket-tab" style="display: none;">
                <h2>View Flights</h2>
                <div class="filter">
                    <a href="Dashboard.jsp"></a>
                </div>
                <table>
                    <thead>
                        <tr>
                            <th>Airline</th>
                            <th>Takeoff place</th>
                            <th>Takeoff airport</th>
                            <th>Destination Place</th>
                            <th>Destination Airport</th>
                            <th>Departure Date</th>
                            <th>Departure Time</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%                            int i = 0;
                            for (Flight flightinstance : flightlist) {
                                i++;//this will provide the position of the object to update
                        %>
                        <tr>
                            <td><%=flightinstance.getAirline()%></td>
                            <td><%=flightinstance.getTakeoffPlace()%></td>
                            <td><%=flightinstance.getTakeoffAirport()%></td>
                            <td><%=flightinstance.getDestinationPlace()%></td>
                            <td><%=flightinstance.getDestinationAirport()%></td>
                            <td><%=dateformat.format(flightinstance.getDepartureDate())%></td>
                            <td><%=timeformat.format(flightinstance.getDepartureTime())%></td>
                            <td>
                                <a href="UpdateFlight.jsp?flightid=<%=flightinstance.getId()%>"><button>Edit</button></a>
                            </td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
            </div>


            <div class="admin-tab" id="operator-tab" style="display: none;">
                <h2>operator Addition form</h2>
                <form action="OperatorControl" method="post">
                    <div class="inputs">
                        <div class="inputbox">
                            <label for="">First name <span>*</span></label>
                            <input type="text" name="firstname" required>
                        </div>
                        <div class="inputbox">
                            <label for="">last name <span>*</span></label>
                            <input type="text" name="lastname" required>
                        </div>
                        <div class="inputbox">
                            <label for="">gender</label>
                            <select name="gender">
                                <c:forEach items="${genderlist}" var="gender">
                                    <option value="${gender}">${gender}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="inputbox">
                            <label for="">Date Of Birth</label>
                            <input type="date" name="dateofbirth" required>
                        </div>
                        <div class="inputbox">
                            <label for="">Identification Type</label>
                            <select name="identificationtype">
                                <option value="NATIONAL_ID">NATIONAL_ID</option>
                                <option value="PASSPORT">PASSPORT</option>
                            </select>
                        </div>
                        <div class="inputbox">
                            <label for="">ID Number</label>
                            <input type="text" name="idnumber" required>
                        </div>
                        <div class="inputbox">
                            <label for="">Nationality</label>
                            <input type="text" name="nationality" required>
                        </div>
                        <div class="inputbox">
                            <label for="">Email <span>*</span></label>
                            <input type="text" name="email" required>
                        </div>
                        <div class="inputbox">
                            <label for="">Phone number <span>*</span></label>
                            <input type="text" name="phonenumber" required>
                        </div>
                        <div class="inputbox">
                            <label for="">Country <span>*</span></label>
                            <input type="text" name="country" required>
                        </div>
                        <div class="inputbox">
                            <label for="">City <span>*</span></label>
                            <input type="text" name="city" required>
                        </div>
                        <div class="inputbox">
                            <label for="">Street Address <span>*</span></label>
                            <input type="text" name="street" required>
                        </div>
                        
                    </div>


                    <h2></h2>


                    <h2 style="text-align: center">Account Details</h2>
                    <div class="inputs">
                        <div class="inputbox">
                            <label for="">User name <span>*</span></label>
                            <input type="text" name="username" required>
                        </div>
                        <div class="inputbox">
                            <label for="">Post <span>*</span></label>
                            <select name="post">
                                <c:forEach items="${postlist}" var="post">
                                    <option value="${post}">${post}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="inputbox">
                            <label for="">Account Status <span>*</span></label>
                            <select name="status">
                                <c:forEach items="${statuslist}" var="status">
                                    <option value="${status}">${status}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="inputbox">
                            <label for="">password <span>*</span></label>
                            <input type="password" name="password" required>
                        </div>

                    </div>
                    <input type="text" name="action" hidden value="addoperator">
                    <button type="submit" class="admin-btn">submit</button>
                </form>
            </div>
            <div class="admin-tab" id="view-operator-tab" style="display: none;">
                <h2>View Operators</h2>
                <div class="filter">

                </div>
                <table>
                    <thead>
                        <tr>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>City</th>
                            <th>Email</th>
                            <th>Phone Number</th>
                            <th>Date Created 1</th>
                            <th>Date Created 2</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for (Operator operatorInstance : operatorlist) {


                        %>
                        <tr>
                            <td><%=operatorInstance.getFirstname()%></td>
                            <td><%=operatorInstance.getLastname()%></td>
                            <td><%=operatorInstance.getDateOfBirth()%></td>
                            <td><%=operatorInstance.getNationality()%></td>
                            <td><%=operatorInstance.getAddress().getEmail()%></td>
                            <td><%=dateformat.format(operatorInstance.getCreatedon())%></td>
                            <td><%=operatorInstance.getCreatedon()%></td>
                            <td>
                                <a href="UpdateOperator.jsp?operatorid=<%=operatorInstance.getId()%>"><button>Edit</button></a>
                            </td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
            </div>
        </div>

        <script>
            function openMenu(evt, MenuName) {
                var i, x, tablinks;
                x = document.getElementsByClassName("admin-tab");
                for (i = 0; i < x.length; i++) {
                    x[i].style.display = "none";
                }
                document.getElementById(MenuName).style.display = "flex";
                evt.currentTarget.className += " w3-grey";
            }

            function add() {

                var tableRef = document.getElementById('category-table').getElementsByTagName('tbody')[0];
                var rowsnumber = tableRef.rows.length + 1;

                var newRow = tableRef.insertRow();
                var newCell = newRow.insertCell(0);
                var newInput = document.createElement("INPUT");
                newInput.setAttribute("type", "text");
                newInput.setAttribute("name", "catname" + rowsnumber);
                newCell.appendChild(newInput);

                var newCell = newRow.insertCell(1);
                var newInput = document.createElement("INPUT");
                newInput.setAttribute("type", "number");
                newInput.setAttribute("name", "catseats" + rowsnumber);
                newCell.appendChild(newInput);

                var newCell = newRow.insertCell(2);
                var newInput = document.createElement("INPUT");
                newInput.setAttribute("type", "number");
                newInput.setAttribute("name", "catprice" + rowsnumber);
                newCell.appendChild(newInput);
                document.getElementById('totalrows').value = tableRef.rows.length;

            }
            function remove() {
                var tableRef = document.getElementById('category-table').getElementsByTagName('tbody')[0];
                tableRef.deleteRow(tableRef.rows.length - 1);
                document.getElementById('totalrows').value = tableRef.rows.length;
            }




        </script>
    </body>
</html>
