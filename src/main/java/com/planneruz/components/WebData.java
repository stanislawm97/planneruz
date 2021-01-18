package com.planneruz.components;

import java.util.List;

public class WebData {
    String date;
    String dayOfTheWeek;
    String group;
    String from;
    String to;
    String name;
    String tag;
    String lecturer;

    WebData(String date, String dayOfTheWeek, String group, String from, String to, String name, String tag, String lecturer) {
        this.date = date;
        this.dayOfTheWeek = dayOfTheWeek;
        this.group = group;
        this.from = from;
        this.to = to;
        this.name = name;
        this.tag = tag;
        this.lecturer = lecturer;
    }

    WebData(List<String> list) {
        date = list.get(0);
        dayOfTheWeek = list.get(1);
        group = list.get(2);
        from = list.get(3);
        to = list.get(4);
        name = list.get(5);
        tag = list.get(6);
        lecturer = list.get(7);
    }

    public String getDate() {
        return date;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public String getGroup() {
        return group;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

    public String getLecturer() {
        return lecturer;
    }

    @Override
    public String toString() {
        return "WebData{" +
                "date='" + date + '\'' +
                ", dayOfTheWeek='" + dayOfTheWeek + '\'' +
                ", group='" + group + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", name='" + name + '\'' +
                ", tag='" + tag + '\'' +
                ", lecturer='" + lecturer + '\'' +
                "}\n";
    }
}
