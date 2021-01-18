package com.planneruz.database.dao;

import com.planneruz.database.model.NotUser;
import com.planneruz.database.model.StudentGroup;
import com.planneruz.database.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

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

    public boolean validate(String email, String password) {

        Transaction transaction = null;
        NotUser user = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            user = (NotUser) session.createQuery("FROM NotUser U WHERE U.email = :email").setParameter("email", email).uniqueResult();

            if (user != null && user.getPassword().equals(password)) {
                return true;
            }
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return false;
    }

    public void saveUser(NotUser user) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(user);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public StudentGroup getGroupById(Long id) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        StudentGroup group = (StudentGroup) session.get(StudentGroup.class, id);
        session.getTransaction().commit();
        sessionFactory.close();
        return group;

    }

    public StudentGroup getGroup(String groupCode, String subGroup) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();


        StudentGroup group = (StudentGroup) session.createQuery("FROM StudentGroup S WHERE S.name = :name AND S.subgroup = :subGroup")
                .setParameter("name", groupCode)
                .setParameter("subGroup", subGroup).uniqueResult();
        session.getTransaction().commit();
        sessionFactory.close();
        return group;

    }
}
