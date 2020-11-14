<%-- 
    Document   : FlightResult
    Created on : Oct 28, 2020, 3:12:16 PM
    Author     : Philip
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Domain.FlightCategory"%>
<%@page import="java.util.List"%>
<%@page import="Domain.Flight"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page for flightresult</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:300,400,600">
        <link href="https://fonts.googleapis.com/css2?family=Nova+Round&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/fonts/ionicons.min.css">
        <link rel="stylesheet" href="assets/css/lightslider.css">
        <link rel="stylesheet" href="assets/css/styles.css">
        <!-- <link rel="stylesheet" href="style.css"> -->
        <title>Flight Result Page</title>
    </head>

    <body>
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

        <%
            List<Flight> flightlist = (List<Flight>) request.getAttribute("flightlist");
            List<FlightCategory> categorylist = (List<FlightCategory>) request.getAttribute("categorylist");
            session.setAttribute("flightlist", flightlist);
            session.setAttribute("categorylist", categorylist);

        %>
        <section class="flight-search-results">
            <%                if (flightlist.isEmpty() || categorylist.isEmpty()) {

            %>
            <div id="notfound">
                <div class="notfound">
                    <h2>Oops! Flight Not Found</h2>
                    <p>Sorry but the flight you are looking for can not be found, you can search another convenient flight or try again sometime later</p>
                    <a href="Homepage.jsp" class="btn btn-primary">Search Again</a>
                </div>
            </div>

            <%}%>

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


        </section>

        <footer>
            <section class="footer-top">
                <div>
                    <ul>
                        <li><a href="">create content</a></li>
                        <li><a href="">All programs</a></li>
                        <li><a href="">Lorem ipsum dolor</a></li>
                        <li><a href="">our terms and condition</a></li>
                        <li><a href="">our terms and condition</a></li>
                    </ul>
                </div>
                <div>
                    <div>
                        <ul>
                            <li><a href="">Home</a></li>
                            <li><a href="">About Us</a></li>
                            <li><a href="">Contact us</a></li>
                            <li><a href="">Contact us</a></li>
                        </ul>
                    </div>
                </div>
                <div>
                    <div>
                        <ul>
                            <li><a href="">Terms</a></li>
                            <li><a href="">Privacy policy and cookie policy Us</a></li>
                            <li><a href="">Contact us</a></li>
                            <li><a href="">Featured courses</a></li>
                        </ul>
                    </div>
                </div>

            </section>
            <section class="footer-bottom container">
                <a href="#" class="logo"></a>
                <ul>
                    <li><a href=""><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
                    <li><a href=""><i class="fa fa-youtube-play" aria-hidden="true"></i></a></li>
                    <li><a href=""><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
                    <li><a href=""><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
                    <li><a href=""><i class="fa fa-google" aria-hidden="true"></i></a></li>
                </ul>
            </section>
        </footer>


        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="assets/js/lightslider.js"></script>
        <script src="assets/js/script.js"></script>

    </body>
</html>
