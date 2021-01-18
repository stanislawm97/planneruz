package com.planneruz.controller;

import com.planneruz.database.dao.StudentDao;
import com.planneruz.database.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "login_servlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    private StudentDao studentDao;

    @Override
    public void init() throws ServletException {
        studentDao = new StudentDao();

        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        if (session.getAttribute("id") != null) {
            session.removeAttribute("id");
            response.sendRedirect("/planneruz/");
        } else {
            request.getRequestDispatcher("/WEB-INF/view/login/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            authenticate(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void authenticate(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (studentDao.validate(email, password)) {
            Student student = studentDao.getStudentByEmail(email);
            HttpSession session = request.getSession();

            session.setAttribute("id", student.getId());
            session.setAttribute("login", student.getLogin());
            session.setAttribute("group", student.getGroup());
            session.setAttribute("first_name", student.getFirstName());
            session.setAttribute("last_name", student.getLastName());

            response.sendRedirect("/planneruz/");
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/login/login_failed.jsp");
            dispatcher.forward(request, response);
        }
    }
}
