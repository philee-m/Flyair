/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Philip
 */
@Entity
@SequenceGenerator(name="ticketseq", sequenceName = "ticketseq", initialValue = 1,allocationSize = 1)
public class Ticket {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ticketseq")
    private long id;
    
    @ManyToOne
    private Passenger passenger;
    
    @OneToOne
    private FlightCategory category;
    
    private double price;
    
    private Timestamp boughton;
    
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public FlightCategory getCategory() {
        return category;
    }

    public void setCategory(FlightCategory category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Timestamp getBoughton() {
        return boughton;
    }

    public void setBoughton(Timestamp boughton) {
        this.boughton = boughton;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }  
    
    public static Ticket ticket;
    public static synchronized Ticket getInstance(){
        if(ticket==null){
            ticket=new Ticket();
        }
        return ticket;
    }
}
