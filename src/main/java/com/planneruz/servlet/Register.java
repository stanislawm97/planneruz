package com.planneruz.servlet;

import com.planneruz.model.NotUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/registerr")
public class Register extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/view/register.jsp").forward(request, response);

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer = response.getWriter();


        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        writer.println("Creating user records...");
        NotUser user = new NotUser();
        user.setId((long) 1);
        user.setFirstName(name);
        user.setLastName(lastName);
        user.setPassword(password);
        user.setEmail(email);
        user.setLogin(name + "_" + lastName);


        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();

        session.close();

        // crud(writer);

        doGet(request, response);
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

    private void create(PrintWriter writer, Session session) {
        writer.println("Creating user records...");
        NotUser user = new NotUser();
        user.setId((long) 1);
        user.setFirstName("name");
        user.setLastName("Małysz");
        user.setPassword("abcd123");
        user.setEmail("adam@malysz.pl");
        user.setLogin("malysz");


        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }

}

