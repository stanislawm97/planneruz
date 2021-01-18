package com.planneruz.controller;

import com.planneruz.database.dao.NotUserDAO;
import com.planneruz.database.model.NotUser;
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

    private NotUserDAO notUserDao;

    @Override
    public void init() throws ServletException {
        notUserDao = new NotUserDAO();
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        register(request, response);
    }

    private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String firstName = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("login");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        String groupCode = request.getParameter("groupCode");
        String subGroup = request.getParameter("subGroup");

        StudentGroup group = notUserDao.getGroup(groupCode, subGroup);

        NotUser user = new NotUser();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setLogin(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setGroup(group);
        notUserDao.saveUser(user);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/login.jsp");
        dispatcher.forward(request, response);
    }
}
