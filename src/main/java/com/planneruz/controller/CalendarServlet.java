package com.planneruz.controller;

import com.planneruz.database.dao.StudentDao;
import com.planneruz.database.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "calendar_servlet", urlPatterns = "/")
public class CalendarServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Object id = session.getAttribute("id");

        if (session.getAttribute("id") != null && request.getParameter("studentGroup") == null) {
            StudentDao studentDao = new StudentDao();
            Student student = studentDao.getStudentById(Long.valueOf(String.valueOf(id)));
            response.sendRedirect("/planneruz/?studentGroup=" + student.getGroup().getName());
        } else {
            request.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
