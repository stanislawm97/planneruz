package com.planneruz.controller;

import com.planneruz.database.dao.StudentDao;
import com.planneruz.database.model.Password;
import com.planneruz.database.model.Student;
import com.planneruz.database.model.StudentGroup;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "register_servlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {

    private StudentDao studentDao;

    @Override
    public void init() throws ServletException {
        studentDao = new StudentDao();
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/register/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        register(request, response);
    }

    private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String firstName = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("login");
        String email = request.getParameter("email");

        Password password = null;
        String hashedPassword = null;
        try {
            hashedPassword = password.getSaltedHash(request.getParameter("password"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        String groupCode = request.getParameter("groupCode");
        String subGroup = request.getParameter("subGroup");
        StudentGroup group = studentDao.getGroup(groupCode, subGroup);

        Student user = new Student();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setLogin(username);
        user.setPassword(hashedPassword);
        user.setEmail(email);
        user.setGroup(group);
        studentDao.saveUser(user);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/register/register_success.jsp");
        dispatcher.forward(request, response);
    }
}
