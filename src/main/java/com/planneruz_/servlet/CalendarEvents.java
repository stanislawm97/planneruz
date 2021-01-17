package com.planneruz_.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

@WebServlet(urlPatterns = "/get-calendar-events")
public class CalendarEvents extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("json/events.json");
        Scanner odczyt = new Scanner(inputStream);

        while (odczyt.hasNextLine()) {
            String line = odczyt.nextLine();
            writer.println(line);
        }
    }
}
