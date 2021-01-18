package com.planneruz.controller;

import com.planneruz.database.dao.NotUserDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "login_servlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    private NotUserDAO loginDao;

    @Override
    public void init() throws ServletException {
        loginDao = new NotUserDAO();

        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
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
        String mail = request.getParameter("email");
        String password = request.getParameter("password");

        if (loginDao.validate(mail, password)) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/failedLogin.jsp");
            dispatcher.forward(request, response);
        }
    }
}
