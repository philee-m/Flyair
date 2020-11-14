/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Domain.Flight;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Philip
 */
public class FlightDao {
      SessionFactory sf=HibernateUtil.getSessionFactory(); 
    Session session=null;
    
    public List<Flight> getFlight(int a,int b) {
        session = sf.openSession();
        String sql = "FROM Flight";
        Query query = session.createQuery(sql);
        List results = query.list();
        session.close();
        return results;
    }
    public int getNumberOfRows() {
        session = sf.openSession();
        String sql = "SELECT COUNT(id) FROM Flight";
        Query query = session.createQuery(sql);
        int numOfRows = (int) (long) query.uniqueResult();
        session.close();
        return numOfRows;
    }
    
    public List<Flight> SearchFlight(String from,String to,Date d){
        session = sf.openSession();
        String hql="FROM Flight WHERE takeoffPlace = '"+from+"' and destinationPlace = '"+to+"' and departureDate = '"+d+"'";
        Query query = session.createQuery(hql);
        List results = query.list();
        session.close();
        return results;
        
    }
}
