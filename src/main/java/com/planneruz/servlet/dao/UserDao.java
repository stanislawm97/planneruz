package com.planneruz.servlet.dao;


import com.planneruz.servlet.model.User_String;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    public int registerUser(User_String user) throws ClassNotFoundException {

        String INSERT_USERS_SQL = "INSERT INTO User " +
                " (FIRST_NAME, LAST_NAME, GROUP_ID, SECOND_GROUP_ID, FIELD, PASSWORD) VALUES" +
                " (?, ?, ?, ?, ?, ?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection("ec2-52-48-65-240.eu-west-1.compute.amazonaws.com", "wzoavfeotagcwe", "f2dca08aa1b1c8f855f0050618dcd3ac9cf7289b14d561f76d71e0fff4807b61")) {

            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getLastName());
            preparedStatement.setString(3, user.getGroupa());
            preparedStatement.setString(4, user.getSecondGroup());
            preparedStatement.setString(5, user.getField());
            preparedStatement.setString(6, user.getPassword());

            System.out.println(preparedStatement);

            result = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return result;

    }
}
