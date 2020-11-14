<%-- 
    Document   : Tickets
    Created on : Nov 14, 2020, 5:36:39 PM
    Author     : Philip
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Tickets</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:300,400,600">
        <link href="https://fonts.googleapis.com/css2?family=Nova+Round&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/fonts/ionicons.min.css">
        <link rel="stylesheet" href="assets/css/lightslider.css">
        <link rel="stylesheet" href="assets/css/styles.css">
    </head>
    <body>
        <%
            
//            if (session.getAttribute("user") == "null") {
//                response.sendRedirect("Login.jsp");
//            }



        %>
        <header>
            <nav class="navbar navbar-dark navbar-expand-md">
                <div class="container-fluid"><a class="navbar-brand" href="#"> </a><button data-toggle="collapse"
                                                                                           class="navbar-toggler" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span
                            class="navbar-toggler-icon"></span></button>
                    <div class="collapse navbar-collapse" id="navcol-1">
                        <ul class="nav navbar-nav mx-auto">
                            <li class="nav-item" role="presentation"><a class="nav-link active" href="index.html">Home</a>
                            </li>
                            <li class="nav-item" role="presentation"><a class="nav-link" href="Local-Content.html">About Us</a></li>
                            <li class="nav-item" role="presentation"><a class="nav-link"
                                                                        href="International-content.html">Contact</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>
        <div class="welcome">
            <%
                int i = 0;
                for (Flight flight : flightlist) {
            %>
            <div class="flight-result">
                <div class="image">
                    <img src="assets/img/<%=flight.getAirline()%>.jpg" alt="">
                </div>
                <div class="flight-details">
                    <div class="airline">
                        DEPARTURE - <%=flight.getAirline()%>
                    </div>

                    <div class="timing">
                        <div>
                            <h5><%=flight.getAirline()%></h5>
                            <h5><%=flight.getTakeoffPlace()%>(<%=flight.getTakeoffAirport()%>})</h5>
                        </div>
                        <div>
                            <%=flight.getJourneyHrs()%>Hours <img src="assets/img/planetakeoff.png" alt="" width="30">
                        </div>
                        <div>
                            <h5><%=flight.getDestinationPlace()%>(<%=flight.getDestinationAirport()%>)</h5>
                        </div>
                    </div>

                    <div class="prices">
                        <div>
                            <p>Only <%=categorylist.get(i).getCategorySeats()%> tickets left</p>
                        </div>
                        <div class="price">
                            <div>
                                <h3>$<%=categorylist.get(i).getCategoryPrice()%></h3>
                            </div>
                            <a href="Passenger.jsp?id=<%=categorylist.get(i).getId()%>" class="btn btn-success">select</a>
                        </div>                        
                    </div>

                </div>

            </div>
            <% i++;
                }%>
        </div>
    </body>
</html>
