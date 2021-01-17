package com.planneruz_.servlet;

import com.planneruz_.entity.Car;
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

@WebServlet(urlPatterns = "/test")
public class Test extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        crud(writer);
    }

    public void crud(PrintWriter writer) {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        create(writer, session);
        read(writer, session);

        update(writer, session);
        read(writer, session);

        delete(writer, session);
        read(writer, session);

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
        writer.println("Creating car records...");
        Car mustang = new Car();
        mustang.setModel("maluch");
        mustang.setPrice("£3.00");

        Car mondeo = new Car();
        mondeo.setModel("mondeo");
        mondeo.setPrice("£20,000.00");

        session.beginTransaction();
        session.save(mustang);
        session.save(mondeo);
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
