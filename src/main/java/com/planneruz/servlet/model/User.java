package com.planneruz.servlet.model;

public class User {

    private String name;
    private String lastName;
    private String password;
    private String email;
    private String field;
    private String group;
    private String secondGroup;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String secondName) {
        this.lastName = secondName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSecondGroup() {
        return secondGroup;
    }

    public void setSecondGroup(String secondGroup) {
        this.secondGroup = secondGroup;
    }
}
