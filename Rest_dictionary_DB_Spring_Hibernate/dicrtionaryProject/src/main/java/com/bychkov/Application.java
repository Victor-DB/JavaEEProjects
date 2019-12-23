package com.bychkov;

import com.bychkov.entity.Words;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.management.Query;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.getTransaction().begin();
        List<Words> list = (List<Words>) session.createQuery("FROM Words").list();



        //INSERT to DB:
       // List<Words> list = session.createQuery("INSERT INTO words (wordEn , wordRu) VALUES").list();
        //RREAD from DB:
        //List<Words> list = (List<Words>) session.createQuery("SELECT wordRu FROM words where wordEn = universe").list();
        //Query query = (Query) session.createQuery("INSERT INTO Words (wordEn , wordRu) VALUES  ");




        for (Words t : list){
            System.out.println(t.getWordEn());
        }
        session.getTransaction().commit();
    }
}
