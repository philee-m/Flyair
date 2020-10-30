/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;



/**
 *
 * @author Philip
 */
@Entity
@SequenceGenerator(name="categoryseq", sequenceName = "categoryseq", initialValue = 1,allocationSize = 1)
public class FlightCategory implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="categoryseq")
    private long id;
    
    @ManyToOne
    private Flight flight;
    
    @Enumerated(EnumType.STRING)
    private Category category;
    
    private int categorySeats;
    
    private double categoryPrice;
    
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getCategorySeats() {
        return categorySeats;
    }

    public void setCategorySeats(int categorySeats) {
        this.categorySeats = categorySeats;
    }

    public double getCategoryPrice() {
        return categoryPrice;
    }

    public void setCategoryPrice(double categoryPrice) {
        this.categoryPrice = categoryPrice;
    }
    
    
}
