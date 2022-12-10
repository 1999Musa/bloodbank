package com.example.projectbloodbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbmsConnection {
    Connection con;
    String dbname="bloodms";
    String username="root";
    String password="";
    public Connection dbmsConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/"+dbname,username,password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}

/*
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
public Connection connection;
    public  Connection getConnection(){


        String dbName="tutorial";
        String userName="root";
        String password="";

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

        connection= DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,userName,password);


        } catch (Exception e) {
            e.printStackTrace();
        }


        return connection;
    }

}
* */