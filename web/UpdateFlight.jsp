<%-- 
    Document   : UpdateTicket
    Created on : Oct 27, 2020, 7:16:31 PM
    Author     : Philip
--%>

<%@page import="Domain.FlightBookingStatus"%>
<%@page import="Controller.DashboardService"%>
<%@page import="Dao.CategoryDao"%>
<%@page import="java.util.List"%>
<%@page import="Domain.FlightCategory"%>
<%@page import="Dao.GenericDao"%>
<%@page import="Domain.Flight"%>
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
            Long flightid = Long.parseLong(request.getParameter("flightid"));
            GenericDao generic = new GenericDao();
            CategoryDao categoryDao = new CategoryDao();
            Flight flight = (Flight) generic.findBYId(new Flight(), flightid);
            List<FlightCategory> categorylist = categoryDao.SearchByFlightId(flightid);
            session.setAttribute("flightid", flightid);
            DashboardService ds = new DashboardService();
            FlightBookingStatus [] flightstatuslist = ds.getFlightstatuslist();
        %>
        <div class="admin">
            <div class="admin-tab" id="ticket-tab" style="display: block; margin: auto">
                <h2 style="text-align: center">Update Flight</h2>
                <form action="FlightControl" method="POST">
                    <div class="inputs">
                        <div class="inputbox">
                            <label for="">Airline Name</label>
                            <input type="text" name="airline" value="<%=flight.getAirline()%>">
                        </div>
                        <div class="inputbox">
                            <label for="">takeoff place</label>
                            <input type="text" name="takeoffPlace" value="<%=flight.getTakeoffPlace()%>">
                        </div>
                        <div class="inputbox">
                            <label for="">takeoff airport</label>
                            <input type="text" name="takeoffAirport" value="<%=flight.getTakeoffAirport()%>">
                        </div>
                        <div class="inputbox">
                            <label for="">Destination Place</label>
                            <input type="text" name="destinationPlace" value="<%=flight.getDestinationPlace()%>">
                        </div>
                        <div class="inputbox">
                            <label for="">Destination Airport</label>
                            <input type="text" name="destinationAirport" value="<%=flight.getDestinationAirport()%>">
                        </div>
                        <div class="inputbox">
                            <label for="">Departure Date</label>
                            <input type="date" name="departureDate" value="<%=flight.getDepartureDate()%>">
                        </div>
                        <div class="inputbox">
                            <label for="">Departure Time</label>
                            <input type="time" name="departureTime" value="<%=flight.getDepartureTime()%>">
                        </div>
                        <div class="inputbox">
                            <label for="">Journey Hours</label>
                            <input type="number" step="0.1" name="journeyHrs" value="<%=flight.getJourneyHrs()%>">
                        </div>
                        <div class="inputbox">
                            <label for="">Status</label>
                            <select name="status">
                                <%
                                    for(FlightBookingStatus flightstatus:flightstatuslist){
                                        if (flightstatus.equals(flight.getFlightStatus())) {
                                %>
                                <option value="<%=flightstatus%>" selected><%=flightstatus%></option>
                                <%} else{%>
                                <option value="<%=flightstatus%>"><%=flightstatus%></option>
                                <%}}%>
                            </select>
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
                                <%
                                int i = 0;
                                for (FlightCategory cat : categorylist) {
                                    i++;
                                %>
                                <tr>
                                    <td><input type="text" name="catname<%=i%>" value="<%=cat.getCategory().toString()%>"></td>
                                    <td><input type="number" name="catseats<%=i%>" value="<%=cat.getCategorySeats()%>"></td>
                                    <td><input type="number" name="catprice<%=i%>" value="<%=cat.getCategoryPrice()%>"></td>
                                </tr>
                                <%}%>
                            </tbody>
                        </table>
                    </div>
                    <input id='hidden-total-rows' type='hidden' value='<%=categorylist.size()%>' />
                    <input type="text" name="action" value="updateflight" hidden>
                    <input type="number" name="catrows" id="totalrows" hidden>
                    <button type="button" class="admin-btn" onclick="add()">+</button>
                    <button type="button" class="admin-btn" onclick="remove()">-</button><br>
                    <button type="submit" class="admin-btn">submit</button>
                    
                    <label for="">press +, - button to add or remove category respectively</label>
                </form>
            </div>

        </div>
        <script>
            var totalCount = document.getElementById('hidden-total-rows').value;
            document.getElementById('totalrows').value = totalCount;
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
