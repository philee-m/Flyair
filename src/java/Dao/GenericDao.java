/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Philip
 */
public class GenericDao {
    SessionFactory sf=HibernateUtil.getSessionFactory(); 
    Session session=null;
    
    public String create(Object o){
        session = sf.openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        session.close();
        return "success";
    }
    
    public String update(Object o){
        session = sf.openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        session.close();
        return "success";
    }
    
    public String delete(Object o){
        session = sf.openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        session.close();
        return "success";
    }
    
    public Object findBYId(Object o, Long id){
        session = sf.openSession();
        Object ob = session.get(o.getClass(), id);
        session.close();
        return ob;
    }
    
    public List findAll(Object o){
        session = sf.openSession();
        List<Object> li=(List<Object>) session.createCriteria(o.getClass()).list();
        session.close();
        return li;
    }
    
}
