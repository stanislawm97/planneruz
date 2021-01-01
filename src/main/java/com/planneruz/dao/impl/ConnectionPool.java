package com.planneruz.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {
    private static ConnectionPool instance = null;
    /**
     * Connection instance
     */
    private Connection connection = getConnection();

    private ConnectionPool() {
        //private constructor
    }

    public static ConnectionPool getInstance() {
        if (instance == null)
            instance = new ConnectionPool();
        return instance;
    }

    Connection getConnection() {

        try {
            Class.forName("org.postgresql.Driver").newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e1) {
            e1.printStackTrace();
        }

        String username = "wzoavfeotagcwe";
        String password = "f2dca08aa1b1c8f855f0050618dcd3ac9cf7289b14d561f76d71e0fff4807b61";
        String dbUrl = "jdbc:postgresql://" + "ec2-52-48-65-240.eu-west-1.compute.amazonaws.com:5432"
                + "/dsevdq9jdk2nv?sslmode=require";
        try {
            return DriverManager.getConnection(dbUrl, username, password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return connection;
    }
}
