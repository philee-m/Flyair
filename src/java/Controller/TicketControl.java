/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.CategoryDao;
import Dao.GenericDao;
import Domain.Contact;
import Domain.FlightCategory;
import Domain.IdentificationType;
import Domain.Passenger;
import Domain.Ticket;
import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Philip
 */
@WebServlet(name = "TicketControl", urlPatterns = {"/TicketControl"})
public class TicketControl extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        GenericDao generic = new GenericDao();
        String action = request.getParameter("action");
        Passenger passenger = new Passenger();
        Long id = Long.parseLong(request.getParameter("id"));

        FlightCategory category = CategoryDao.getInstance().SearchSingleByCategoryId(id);
        Ticket ticket = new Ticket();
        Contact contact = new Contact();
        FlightCategory flightcategory = new FlightCategory();

        try {
            passenger.setFirstname(request.getParameter("firstname"));
            passenger.setLastname(request.getParameter("lastname"));
            passenger.setIdentificatioType(IdentificationType.valueOf(request.getParameter("identificationtype")));
            passenger.setIdNumber(Long.parseLong(request.getParameter("idnumber")));
            passenger.setDateOfBirth(Date.valueOf(request.getParameter("dateofbirth")));
            passenger.setNationality(request.getParameter("nationality"));
            generic.create(passenger);

            contact.setEmail(request.getParameter("email"));
            contact.setCountry(request.getParameter("country"));
            contact.setCity(request.getParameter("city"));
            contact.setAddress(request.getParameter("address"));
            contact.setPhoneNumber(request.getParameter("phonenumber"));

            contact.setPassenger(passenger);

            generic.create(contact);

            ticket.setCategory(category);
            ticket.setPassenger(passenger);
            ticket.setPrice(category.getCategoryPrice());
            java.util.Date date = new java.util.Date();
            Timestamp ts = new Timestamp(date.getTime());
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            ticket.setBoughton(Timestamp.valueOf(formatter.format(ts)));

            generic.create(ticket);

            category.setCategorySeats(category.getCategorySeats() - 1);
            generic.update(category);

            response.sendRedirect("Homepage.jsp");
        } catch (Exception e) {
            System.out.println("Error is: " + e.getCause());
            System.out.println("Error is: " + e.getMessage());

        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        switch (action) {
            
            case "getPassengerTickets":
                String 
                break;
            
            case "getAllTickets":
                
                break;
            
            default:
                
                break;
        }

    }

}
