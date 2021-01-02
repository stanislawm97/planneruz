package com.planneruz.helpers;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/read-from-web")
public class ReadFromWebServlet extends HttpServlet {

    private static final int TIMEOUT_IN_MS = 5000;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("ISO-8859-2");
        PrintWriter writer = response.getWriter();
        URL informatyka = new URL("http://www.plan.uz.zgora.pl/grupy_plan.php?pId_Obiekt=22649");
        URL filologiaAngielska = new URL("http://www.plan.uz.zgora.pl/grupy_plan.php?pId_Obiekt=22550");
        Document doc = Jsoup.parse(informatyka, TIMEOUT_IN_MS);
        ArrayList<WebData> data = new ArrayList<>();

        Elements divClass = doc.getElementsByClass("tab-pane fade");
        Elements tbody = divClass.first().getElementsByTag("tbody");
        Elements tables = tbody.first().getElementsByTag("tr");
        for (Element tr : tables) {
            Elements td = tr.getElementsByTag("td");
            ArrayList<String> infos = new ArrayList<>();
            for (Element info : td) {
                infos.add(info.text());
            }
            //if (infos.isEmpty()) continue;
            if (infos.size() < 8) continue;

            data.add(new WebData(infos));
        }

        ArrayList<WebDataJsonClass> webDataJsonClasses = new ArrayList<>();
        for (WebData webData : data) {
            String id = String.valueOf(data.indexOf(webData));
            String title = webData.tag + " - " + webData.name + "   " + webData.lecturer;

            DateTimeZone timeZone = DateTimeZone.forID("Europe/Warsaw");
            DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm").withZone(timeZone);

            DateTime start = formatter.parseDateTime(webData.date + " " + webData.from);
            DateTime end = formatter.parseDateTime(webData.date + " " + webData.to);


            webDataJsonClasses.add(new WebDataJsonClass(id, title, start.toString(), end.toString()));

        }

        Jsonb jsonb = JsonbBuilder.create();
        String result = jsonb.toJson(webDataJsonClasses);

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : result.toCharArray()) {
            switch (c) {
                case 'ą':
                    stringBuilder.append('a');
                    break;
                case 'ć':
                    stringBuilder.append('c');
                    break;
                case 'ę':
                    stringBuilder.append('e');
                    break;
                case 'ł':
                    stringBuilder.append('l');
                    break;
                case 'ń':
                    stringBuilder.append('n');
                    break;
                case 'ó':
                    stringBuilder.append('o');
                    break;
                case 'ś':
                    stringBuilder.append('s');
                    break;
                case 'ź':
                case 'ż':
                    stringBuilder.append('z');
                    break;
                case 'Ą':
                    stringBuilder.append('A');
                    break;
                case 'Ć':
                    stringBuilder.append('C');
                    break;
                case 'Ę':
                    stringBuilder.append('E');
                    break;
                case 'Ł':
                    stringBuilder.append('L');
                    break;
                case 'Ń':
                    stringBuilder.append('N');
                    break;
                case 'Ó':
                    stringBuilder.append('O');
                    break;
                case 'Ś':
                    stringBuilder.append('S');
                    break;
                case 'Ź':
                case 'Ż':
                    stringBuilder.append('Z');
                    break;
                default:
                    stringBuilder.append(c);
                    break;
            }
        }
        String newResult = stringBuilder.toString();

        writer.println(newResult);
    }
}
