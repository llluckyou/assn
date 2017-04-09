package com.assn.test;

import com.assn.entity.AssnActivityJoinEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.annotation.Resource;
import java.sql.Timestamp;


/**
 * Created by Administrator on 2017/4/5.
 */
public class AddDataTester {
    @Resource
    static SessionFactory sessionFactory;
    public static void main(String[] args) {

        Session session = sessionFactory.openSession();

        //creating transaction object
        Transaction t = session.beginTransaction();

        AssnActivityJoinEntity e = new AssnActivityJoinEntity();
        e.setActivityId(1);
        e.setUserId(1);
        e.setApplyTime(new Timestamp(System.currentTimeMillis()));

        session.persist(e);

        t.commit();
        session.close();

        System.out.println("successfully saved");

    }
}
