/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Domain.Account;
import Domain.Operator;
import Domain.OperatorAccount;
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
    
    public String createOperator(Operator o, OperatorAccount a ){
        session = sf.openSession();
        session.beginTransaction();
        session.save(o);
        session.save(a);
        session.getTransaction().commit();
        session.close();
        return "success";
    }
    public String updateOperator(Operator o, OperatorAccount a ){
        session = sf.openSession();
        session.beginTransaction();
        session.update(o);
        session.update(a);
        session.getTransaction().commit();
        session.close();
        return "success";
    }
    
    public Account checkAccount(String username){
        session = sf.openSession();
        String sql = "FROM OperatorAccount WHERE username = '"+username+"'";
        Query q = session.createQuery(sql);
        Account acc  =(Account) q.uniqueResult();
        session.close();
        return acc;
    }
    
}
