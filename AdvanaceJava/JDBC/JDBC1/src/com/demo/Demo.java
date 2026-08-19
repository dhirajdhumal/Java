package com.demo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Demo {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Jay@9322");

            Statement st = con.createStatement();

            st.execute("CREATE DATABASE 18aug");

            System.out.println("Database Created");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
