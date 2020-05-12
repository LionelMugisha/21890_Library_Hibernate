/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Operation;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utility.NewHibernateUtil;

/**
 *
 * @author Lionel
 */
public class OperationDao {
            public void saveOperation(Operation opert){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(opert);
        trans.commit();
        session.close();
    } 
}
