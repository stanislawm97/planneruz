package com.planneruz.database.dao;

import com.planneruz.database.model.StudentGroup;
import com.planneruz.database.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentGroupDao {

    public StudentGroupDao() {

    }

    public List<StudentGroup> getAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<StudentGroup> studentGroupList = (List<StudentGroup>) session.createQuery("FROM StudentGroup").list();
        session.getTransaction().commit();
        sessionFactory.close();
        return studentGroupList;
    }
}
