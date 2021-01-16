package com.planneruz.servlet;

import com.planneruz.entity.Car;
import com.planneruz.servlet.model.User_String;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/usertest")
public class UserTest extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        crud(writer);
    }

    public void crud(PrintWriter writer) {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        create(writer, session);
        // read(writer, session);

        //update(writer, session);
        // read(writer, session);

        //delete(writer, session);
        //read(writer, session);

        session.close();
    }

    private void delete(PrintWriter writer, Session session) {
        writer.println("Deleting mondeo record...");
        Car mondeo = (Car) session.get(Car.class, "mondeo");

        session.beginTransaction();
        session.delete(mondeo);
        session.getTransaction().commit();
    }

    private void update(PrintWriter writer, Session session) {
        writer.println("Updating mustang price...");
        Car mustang = (Car) session.get(Car.class, "mustang");
        mustang.setModel("mustang");
        mustang.setPrice("£35,250.00");

        session.beginTransaction();
        session.saveOrUpdate(mustang);
        session.getTransaction().commit();
    }

    private void create(PrintWriter writer, Session session) {
        writer.println("Creating user records...");
        User_String mateusz = new User_String();
        mateusz.setName("Mateusz");
        mateusz.setLastName("Znojek");
        mateusz.setPassword("abcd123");
        mateusz.setEmail("siema@eniu.pl");
        mateusz.setField("Gierki kakuterowe");
        mateusz.setGroupa("INF");
        mateusz.setSecondGroup("B");

        session.beginTransaction();
        session.save(mateusz);
        session.getTransaction().commit();
    }

    private void read(PrintWriter writer, Session session) {
        Query q = session.createQuery("select _car from Car _car");

        List cars = q.list();
        ArrayList<Car> carsArrayList = new ArrayList();
        carsArrayList.addAll(cars);

        writer.println("Reading car records...");
        writer.printf("%-30.30s  %-30.30s%n", "Model", "Price");
        for (Car c : carsArrayList) {
            writer.printf("%-30.30s  %-30.30s%n", c.getModel(), c.getPrice());
        }
    }
}

