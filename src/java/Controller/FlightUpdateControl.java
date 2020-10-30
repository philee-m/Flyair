/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.CategoryDao;
import Dao.GenericDao;
import Domain.Category;
import Domain.Flight;
import Domain.FlightBookingStatus;
import Domain.FlightCategory;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "FlightUpdateControl", urlPatterns = {"/FlightUpdateControl"})
public class FlightUpdateControl extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long flightid = (Long) request.getSession().getAttribute("flightid");
        GenericDao generic = new GenericDao();
        Flight flight = (Flight) generic.findBYId(new Flight(), flightid);
        List<FlightCategory> categorylist = CategoryDao.getInstance().SearchByFlightId(flightid);
        System.out.println("cat name is:"+categorylist.size());
        for(FlightCategory cat:categorylist){
            System.out.println("cat name is:"+cat.getCategory().toString());
        }

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
        
        generic.update(flight);
        int rows = Integer.parseInt(request.getParameter("catrows"));
        int i=1;
        for(FlightCategory cat:categorylist){
            cat.setFlight(flight);
            cat.setCategory(Category.valueOf(request.getParameter("catname" + i)));
            cat.setCategorySeats(Integer.parseInt(request.getParameter("catseats" + i)));
            cat.setCategoryPrice(Double.parseDouble(request.getParameter("catprice" + i)));
            generic.update(cat);
            i++;
        }
//        for (int i = 1; i <= rows; i++) {
//            flightcategory.setFlight(flight);
//            flightcategory.setCategory(Category.valueOf(request.getParameter("catname" + i)));
//            flightcategory.setCategorySeats(Integer.parseInt(request.getParameter("catseats" + i)));
//            flightcategory.setCategoryPrice(Double.parseDouble(request.getParameter("catprice" + i)));
//            generic.create(flightcategory);
//        }


        response.sendRedirect("Dashboard.jsp");

    }

}
