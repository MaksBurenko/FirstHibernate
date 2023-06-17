package com.itvdn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal(1,"Iriska",1, true);

    }

    SessionFactory factory = new Configuration()
            .configure()
            .buildSessionFactory();

    Session session = factory.openSession();

    session.beginTransaction();
    session.save(animal);
    session.getTrasaction().commit();
    session.close;


}
