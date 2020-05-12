/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utility.NewHibernateUtil;

/**
 *
 * @author Lionel
 */
public class BookDao {
    public void saveBook(Book bk){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(bk);
        trans.commit();
        session.close();
    }
    public void updateBook(Book bk){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.update(bk);
        trans.commit();
        session.close();
    } 
    public void deleteBook(Book bk){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.delete(bk);
        trans.commit();
        session.close();
    } 
}
