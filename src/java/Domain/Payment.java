/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Philip
 */
@Entity
@SequenceGenerator(name="paymentseq", sequenceName = "paymentseq", initialValue = 1,allocationSize = 1)
public class Payment {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="paymentseq")
    private long id;
    
    private long cardNumber;
    private String cardHolderName;
    @Temporal(TemporalType.DATE)
    private Date expiryDate;
    private int securityCode;
    
    @OneToOne
    private Passenger passenger;
    @OneToOne
    private Flight flight;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }
    
    public static Payment payment;
    public static synchronized Payment getInstance(){
        if(payment==null){
            payment=new Payment();
        }
        return payment;
    }
}
