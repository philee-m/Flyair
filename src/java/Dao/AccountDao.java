/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Domain.Account;
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
    public static AccountDao accountDao = null;
    public static synchronized AccountDao getInstance(){
        if(accountDao==null){
            accountDao=new AccountDao();
        }
        return accountDao;
    }
    public Account SearchByOperatorId(Long a){
        session=sf.openSession();
        String hql="FROM Account WHERE operator_id = '"+a+"'";
        Query query=session.createQuery(hql);
        Account account =  (Account) query.uniqueResult();
        session.close();
        return account;
    }
}
