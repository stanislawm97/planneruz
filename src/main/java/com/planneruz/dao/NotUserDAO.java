package com.planneruz.dao;

import com.planneruz.model.NotUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class NotUserDAO {

    public static void main(String[] args) {
        NotUserDAO u = new NotUserDAO();
        NotUser user = u.getStudentById(4L);
        System.out.println(user.getFirstName());

    }

    public NotUser getStudentById(Long id) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        NotUser user = (NotUser) session.get(NotUser.class, id);
        session.getTransaction().commit();
        sessionFactory.close();
        return user;
    }
}
