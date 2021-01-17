package com.planneruz_.servlet;

import com.planneruz_.dao.NotUserDAO;
import com.planneruz_.model.NotUser;
import com.planneruz_.model.StudentGroup;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register")
public class Register extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private NotUserDAO notUserDao;

    public void init() {
        notUserDao = new NotUserDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        register(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/register.jsp").forward(request, response);
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