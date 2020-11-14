/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Domain.ClientAccount;
import Domain.OperatorAccount;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Philip
 */
public class AccountDao {
    SessionFactory sf=HibernateUtil.getSessionFactory(); 
    Session session=null;
    
    public OperatorAccount SearchByOperatorId(Long a){
        session=sf.openSession();
        String hql="FROM OperatorAccount WHERE operator_id = '"+a+"'";
        Query query=session.createQuery(hql);
        OperatorAccount operatorAccount = (OperatorAccount) query.uniqueResult();
        session.close();
        return operatorAccount;
    }
    
    public ClientAccount SearchByPassengerId(Long a){
        session=sf.openSession();
        String hql="FROM ClientAccount WHERE operator_id = '"+a+"'";
        Query query=session.createQuery(hql);
        ClientAccount clientAccount =  (ClientAccount) query.uniqueResult();
        session.close();
        return clientAccount;
    }
}
