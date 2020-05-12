/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Model.Client;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utility.NewHibernateUtil;

/**
 *
 * @author Lionel
 */
public class ClientDao {
    public void saveClient(Client cl){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(cl);
        trans.commit();
        session.close();
    }
    public void updateClient(Client cl){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.update(cl);
        trans.commit();
        session.close();
    } 
    public void deleteClient(Client cl){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.delete(cl);
        trans.commit();
        session.close();
    } 
}
