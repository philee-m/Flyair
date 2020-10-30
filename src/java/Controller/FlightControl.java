/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.CategoryDao;
import Dao.FlightDao;
import Dao.GenericDao;
import Domain.Category;
import Domain.FlightBookingStatus;
import Domain.Flight;
import Domain.FlightCategory;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Philip
 */
@WebServlet(name = "FlightControl", urlPatterns = {"/FlightControl"})
public class FlightControl extends HttpServlet {

    RequestDispatcher dispatcher = null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String takeoff = request.getParameter("takeoffPlace");
        String destination = request.getParameter("destinationPlace");
        Date departuredate = Date.valueOf(request.getParameter("departureDate"));
        String flightclass = request.getParameter("class");

        
        List<Flight> flightlist = FlightDao.getInstance().SearchFlight(takeoff, destination, departuredate);
        List<FlightCategory> categorylist = new ArrayList<>();
        for(Flight f:flightlist){
            FlightCategory category = (FlightCategory) CategoryDao.getInstance().SearchSingleByFlightId(f.getId(), flightclass);
            categorylist.add(category);
        }
        request.setAttribute("flightlist", flightlist);
        request.setAttribute("categorylist", categorylist);
        

        dispatcher = request.getRequestDispatcher("FlightResult.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        GenericDao generic = new GenericDao();
        String action = request.getParameter("action");
        Flight flight = new Flight();
        FlightCategory flightcategory = new FlightCategory();
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
        flight.setFlightStatus(FlightBookingStatus.BOOKING);
        generic.create(flight);
        int rows = Integer.parseInt(request.getParameter("catrows"));
        for (int i = 1; i <= rows; i++) {
            flightcategory.setFlight(flight);
            flightcategory.setCategory(Category.valueOf(request.getParameter("catname" + i)));
            flightcategory.setCategorySeats(Integer.parseInt(request.getParameter("catseats" + i)));
            flightcategory.setCategoryPrice(Double.parseDouble(request.getParameter("catprice" + i)));
            generic.create(flightcategory);
        }
        response.sendRedirect("Dashboard.jsp");

    }

}
