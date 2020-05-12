/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Bookcategory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utility.NewHibernateUtil;

/**
 *
 * @author Lionel
 */
public class BookCategoryDao {
    public void saveCat(Bookcategory bc){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(bc);
        trans.commit();
        session.close();
    }
    
    public void updateCat(Bookcategory bc){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.update(bc);
        trans.commit();
        session.close();
    } 
    public void deleteCat(Bookcategory bc){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.delete(bc);
        trans.commit();
        session.close();
    } 
}
