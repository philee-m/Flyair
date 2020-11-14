/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Domain.FlightCategory;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Philip
 */
public class CategoryDao {
    SessionFactory sf=HibernateUtil.getSessionFactory(); 
    Session session=null;
    
    
    public FlightCategory SearchSingleByFlightId(Long a, String b){
        session=sf.openSession();
        String hql="FROM FlightCategory WHERE flight_id = '"+a+"' and category='"+b+"'";
        Query query=session.createQuery(hql);
        FlightCategory category =  (FlightCategory) query.uniqueResult();
        session.close();
        return category;
    }
    
    public FlightCategory SearchSingleByCategoryId(Long a){
        session=sf.openSession();
        String hql="FROM FlightCategory WHERE id = '"+a+"'";
        Query query=session.createQuery(hql);
        FlightCategory category =  (FlightCategory) query.uniqueResult();
        session.close();
        return category;
    }
    
    public List<FlightCategory> SearchByFlightId(Long a){
        session=sf.openSession();
        String hql="FROM FlightCategory WHERE flight_id = '"+a+"'";
        Query query=session.createQuery(hql);
        List<FlightCategory> categorylist =  query.list();
        session.close();
        return categorylist;
    }
}
