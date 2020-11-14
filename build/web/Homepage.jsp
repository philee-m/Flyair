<%-- 
    Document   : Homepage
    Created on : Oct 28, 2020, 1:49:54 PM
    Author     : Philip
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:300,400,600">
        <link href="https://fonts.googleapis.com/css2?family=Nova+Round&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/fonts/ionicons.min.css">
        <link rel="stylesheet" href="assets/css/lightslider.css">
        <link rel="stylesheet" href="assets/css/styles.css">
        <!-- <link rel="stylesheet" href="style.css"> -->
        <title>Flyair Homepage</title>
    </head>

    <body>
        <header>
            <nav class="navbar navbar-dark navbar-expand-md">
                <div class="container-fluid"><a class="navbar-brand" href="#"> </a><button data-toggle="collapse"
                                                                                           class="navbar-toggler" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span
                            class="navbar-toggler-icon"></span></button>
                    <div class="collapse navbar-collapse" id="navcol-1">
                        <ul class="nav navbar-nav mx-auto">
                            <li class="nav-item" role="presentation"><a class="nav-link active" href="index.html">Home</a></li>
                            <li class="nav-item" role="presentation"><a class="nav-link" href="Local-Content.html">About Us</a></li>
                            <li class="nav-item" role="presentation"><a class="nav-link" href="International-content.html">Contact Us</a></li>
                        </ul>
                        <ul class="nav navbar-nav mx-auto">
                            <li class="nav-item" role="presentation"><a class="nav-link active" href="index.html">My Tickets</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>

        <section class="welcome">
            <div class="centered">
                <h2>Search Flight</h2>
                <form action="FlightControl" method="GET">
                    <div class="inputs">

                        <div class="inputbox">
                            <label for="">Depart From?</label>
                            <input type="text" name="takeoffPlace">
                        </div>
                        <div class="inputbox">
                            <label for="">Depart To?</label>
                            <input type="text" name="destinationPlace">
                        </div>
                        <div class="inputbox">
                            <label for="">Departure Date</label>
                            <input type="date" name="departureDate">
                        </div>

                        <div class="inputbox">
                            <label for="">Class</label>
                            <select name="class">
                                <option value="ECONOMY">ECONOMY</option>
                                <option value="PREMIUM_ECONOMY">PREMIUM_ECONOMY</option>
                                <option value="BUSINESS_CLASS">BUSINESS_CLASS</option>
                                <option value="FIRST_CLASS">FIRST_CLASS</option>
                            </select>
                        </div>

                    </div>
                    <button type="submit" class="admin-btn">search</button>
                </form>
            </div>
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
