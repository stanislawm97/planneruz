package com.planneruz.components;

public class WebDataJsonClass {
    String id;
    String title;
    String start;
    String end;

    @SuppressWarnings("unused")
    public WebDataJsonClass() {
    }

    public WebDataJsonClass(String id, String title, String start, String end) {
        this.id = id;
        this.title = title;
        this.start = start;
        this.end = end;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "WebDataJsonClass{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                "}\n";
    }
}
