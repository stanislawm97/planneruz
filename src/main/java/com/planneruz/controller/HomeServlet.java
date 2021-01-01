package com.planneruz.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class HomeServlet
 */
public class HomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public HomeServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        if (path.equals("/")) {
            List<Article> articles = articleDao.getAllArticles();
            request.setAttribute("title", "Title of our application");
            request.setAttribute("articles", articles);
            request.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(request, response);
        } else if (path.equals("/welcome")) {
            request.getRequestDispatcher("/WEB-INF/view/welcome.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
