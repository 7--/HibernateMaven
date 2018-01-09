package com.phil.rego.driver;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.phil.rego.beans.Chocolate;
import com.phil.rego.util.HibernateUtil;

public class Driver {

    public static void main(String[] args) {
        init();

    }

    static void init() {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        Chocolate kitkat = new Chocolate("KitKat");
        session.save(kitkat);
    }
}
