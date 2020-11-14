/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.AccountDao;
import Dao.CategoryDao;
import Dao.GenericDao;
import Dao.OperatorDao;
import Domain.Account;
import Domain.AccountStatus;
import Domain.Category;
import Domain.Flight;
import Domain.FlightBookingStatus;
import Domain.FlightCategory;
import Domain.Gender;
import Domain.Operator;
import Domain.Post;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Philip
 */
@WebServlet(name = "UpdateControl", urlPatterns = {"/UpdateControl"})
public class UpdateControl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        GenericDao generic = new GenericDao();
        OperatorDao operatorDao = new OperatorDao();
        String action =  request.getParameter("action");
        System.out.println("action is : "+action);
        switch (action) {
            case "updateflight":
                System.out.println("in update flight");
                Long flightid = (Long) request.getSession().getAttribute("flightid");
                System.out.println("the id is :"+flightid);

                Flight flight = (Flight) generic.findBYId(new Flight(), flightid);
//                List<FlightCategory> categorylist = CategoryDao.getInstance().SearchByFlightId(flightid);

                request.getSession().removeAttribute("flightid");
                flight.setAirline(request.getParameter("airline"));
                flight.setTakeoffPlace(request.getParameter("takeoffPlace"));
                flight.setTakeoffAirport(request.getParameter("takeoffAirport"));
                flight.setDestinationPlace(request.getParameter("destinationPlace"));
                flight.setDestinationAirport(request.getParameter("destinationAirport"));
                flight.setDepartureDate(Date.valueOf(request.getParameter("departureDate")));
                SimpleDateFormat sdftime = new SimpleDateFormat("hh:mm");
                try {
                    flight.setDepartureTime(sdftime.parse(request.getParameter("departureTime")));
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
                flight.setJourneyHrs(Double.parseDouble(request.getParameter("journeyHrs")));
                flight.setFlightStatus(FlightBookingStatus.valueOf(request.getParameter("action")));

                generic.update(flight);
                int rows = Integer.parseInt(request.getParameter("catrows"));
                int i = 1;
                for (FlightCategory cat : categorylist) {
                    cat.setFlight(flight);
                    cat.setCategory(Category.valueOf(request.getParameter("catname" + i)));
                    cat.setCategorySeats(Integer.parseInt(request.getParameter("catseats" + i)));
                    cat.setCategoryPrice(Double.parseDouble(request.getParameter("catprice" + i)));
                    generic.update(cat);
                    i++;
                }
                response.sendRedirect("Dashboard.jsp");
                break;

            case "updateoperator":
                
                break;
            default:
                System.out.println("no action specified");
              
        }
        

    }

}
