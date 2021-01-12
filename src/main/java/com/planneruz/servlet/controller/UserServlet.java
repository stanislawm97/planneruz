package com.planneruz.servlet.controller;

import com.planneruz.servlet.dao.UserDao;
import com.planneruz.servlet.model.User_String;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "/register")
public class UserServlet extends HttpServlet {

    private UserDao userDao = new UserDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String field = request.getParameter("field");
        String group = request.getParameter("group");
        String secondGroup = request.getParameter("secondGroup");

        User_String user = new User_String();

        user.setName(name);
        user.setLastName(lastName);
        user.setPassword(password);
        user.setEmail(email);
        user.setField(field);
        user.setGroup(group);
        user.setSecondGroup(secondGroup);

        try {
            userDao.registerUser(user);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        response.sendRedirect("");
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/login/login.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("view/login/register.jsp");
        dispatcher.forward(request, response);

    }
}
