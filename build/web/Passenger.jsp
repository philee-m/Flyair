<%-- 
    Document   : Passenger
    Created on : Oct 28, 2020, 4:49:25 PM
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
        <title>Book Flight</title>
    </head>

    <body>
        <%
            Long id = Long.parseLong(request.getParameter("id"));
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

        <div class="passenger-details">
            <h3>Passenger</h3>
            <form action="TicketControl" method="POST">
                <div class="inputs">

                    <div class="inputbox">
                        <label for="">First Name</label>
                        <input type="text" name="firstname" required>
                    </div>
                    <div class="inputbox">
                        <label for="">Last Name</label>
                        <input type="text" name="lastname" required>
                    </div>
                    <div class="inputbox">
                        <label for="">Date Of Birth</label>
                        <input type="date" name="dateofbirth" required>
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
                </div>
                <h3>Contact Details</h3>
                <div class="inputs">
                    <div class="inputbox">
                        <label for="">Email</label>
                        <input type="email" name="email" required>
                    </div>
                    <div class="inputbox">
                        <label for="">Country</label>
                        <input type="text" name="country" required>
                    </div>
                    <div class="inputbox">
                        <label for="">City</label>
                        <input type="text" name="city" required>
                    </div>
                    <div class="inputbox">
                        <label for="">street</label>
                        <input type="text" name="address" required>
                    </div>
                    <div class="inputbox">
                        <label for="">Phone Number</label>
                        <input type="text" name="phonenumber" required>
                    </div>

                </div>
                <h3>Account Details</h3>
                <p>This will help you in case you want to view your tickets or cancel tickets.</p>
                <div class="inputs">
                    <div class="inputbox">
                        <label for="">Username</label>
                        <input type="username" name="username" required>
                    </div>
                    <div class="inputbox">
                        <label for="">Password</label>
                        <input type="password" name="password" required>
                    </div>
                </div>
                <input type="number" name="id" hidden value="<%=id%>">
                <button type="submit" class="admin-btn">Buy Ticket</button>
            </form>

        </div>




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
                        </ul>
                    </div>
                </div>
                <div>
                    <div>
                        <ul>
                            <li><a href="">Terms</a></li>
                            <li><a href="">Privacy policy and cookie policy Us</a></li>
                            <li><a href="">Contact us</a></li>
                            <li><a href="">Featured Flights</a></li>
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
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="assets/js/lightslider.js"></script>
        <script src="assets/js/script.js"></script>

    </body>
</html>
