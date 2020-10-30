/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Domain.Account;
import Domain.Operator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Philip
 */
public class OperatorDao {
    SessionFactory sf=HibernateUtil.getSessionFactory(); 
    Session session=null;
    public static GenericDao genericDao = null;
    public static GenericDao getInstance(){
        if(genericDao==null){
            genericDao=new GenericDao();
        }
        return genericDao;
    }
    
    public String createOperator(Operator o, Account a ){
        session = sf.openSession();
        session.beginTransaction();
        session.save(o);
        session.save(a);
        session.getTransaction().commit();
        session.close();
        return "success";
    }
    
    public Account checkAccount(String username){
        session = sf.openSession();
        String sql = "FROM Account WHERE username = '"+username+"'";
        Query q = session.createQuery(sql);
        Account acc  =(Account) q.uniqueResult();
        session.close();
        return acc;
    }
    
}
