/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Philip
 */
@Entity
@SequenceGenerator(name="flightseq", sequenceName = "flightseq", initialValue = 1,allocationSize = 1)
public class Flight {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="flightseq")
    
    private long id;
    
    private String airline;
    
    private String takeoffPlace;
    
    private String takeoffAirport;
    
    private String destinationPlace;
    
    private String destinationAirport;
   
    @Temporal(TemporalType.DATE)
    private Date departureDate;
    
    @Temporal(TemporalType.TIME)
    private Date departureTime;
    
    private double journeyHrs; 
    
    @Enumerated(EnumType.STRING)
    private FlightBookingStatus flightStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getTakeoffPlace() {
        return takeoffPlace;
    }

    public void setTakeoffPlace(String takeoffPlace) {
        this.takeoffPlace = takeoffPlace;
    }

    public String getTakeoffAirport() {
        return takeoffAirport;
    }

    public void setTakeoffAirport(String takeoffAirport) {
        this.takeoffAirport = takeoffAirport;
    }

    public String getDestinationPlace() {
        return destinationPlace;
    }

    public void setDestinationPlace(String destinationPlace) {
        this.destinationPlace = destinationPlace;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public double getJourneyHrs() {
        return journeyHrs;
    }

    public void setJourneyHrs(double journeyHrs) {
        this.journeyHrs = journeyHrs;
    }

    public FlightBookingStatus getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(FlightBookingStatus flightStatus) {
        this.flightStatus = flightStatus;
    }
    
    
}
