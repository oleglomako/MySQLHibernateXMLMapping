package com.oleglomako;

import com.oleglomako.entity.User;
import com.oleglomako.persistence.HibernateUtil;
import org.hibernate.Session;

/**
 * Created by oleg on 01.02.17.
 */
public class EnterPoint {
    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        user.setFirstName("Oleg");
        user.setLastName("Lomako");

        session.save(user);
        session.getTransaction().commit();
    }

}
