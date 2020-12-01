package db;

import db.user.User;

import java.sql.*;

public class DatabaseUtil {
    Connection myConn = null;
    Statement myStmt = null;
    ResultSet myRs = null;

    public DatabaseUtil() {
        try {
            myConn = DriverManager.getConnection("jdbc:h2:E:\\zProjekty\\JavaEE\\plnr\\planneruz\\database/database");
            myStmt = myConn.createStatement();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DatabaseUtil du = new DatabaseUtil();
        System.out.println(du.getUserByLogin("pawel33"));
    }

    public User getUserByLogin(String login) {
        User usr = new User();
        try {
            myRs = myStmt.executeQuery("SELECT * FROM DATABASE.PUBLIC.\"User\" WHERE DATABASE.PUBLIC.\"User\".LOGIN = '"
                    + login + "'");
            while (myRs.next()) {
                usr.setID(myRs.getLong("ID"));
                usr.setFirstName(myRs.getString("FIRST_NAME"));
                usr.setLastName(myRs.getString("LAST_NAME"));
                usr.setGroupID(myRs.getLong("GROUP_ID"));
                usr.setEmail(myRs.getString("EMAIL"));
                usr.setLogin(myRs.getString("LOGIN"));
                usr.setPassword(myRs.getString("PASSWORD"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return usr;
    }
}
