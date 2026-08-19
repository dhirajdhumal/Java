package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;

public class CreateTable {

    public static void main(String[] args) {
        // int id = 1;
        // String name = "Jay";
        // float marks = 99.99f;

        Student s1 = new Student();
        s1.setId(8);
        s1.setName("Vedant");
        s1.setMarks(56.78f);

        Student s2 = new Student();
        s2.setId(9);
        s2.setName("Sakshi");
        s2.setMarks(85.50f);

        Student s3 = new Student();
        s3.setId(10);
        s3.setName("Rohan");
        s3.setMarks(78.25f);

        Student s4 = new Student();
        s4.setId(11);
        s4.setName("Priya");
        s4.setMarks(92.00f);

        Student s5 = new Student();
        s5.setId(12);
        s5.setName("Aishwarya");
        s5.setMarks(88.75f);

        Student s6 = new Student();
        s6.setId(13);
        s6.setName("Ritika");
        s6.setMarks(95.25f);


        // ArrayList<Student> student = new ArrayList<>();
        // student.add(s1);
        // student.add(s2);
        // student.add(s3);
        // student.add(s4);
        // student.add(s5);
        // student.add(s6);

        //Shortcut for ArrayList
        List<Student> student = Arrays.asList(s1,s2,s3,s4,s5,s6);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/18aug", "root", "Jay@9322");
            Statement st = con.createStatement();

            // Create Table 
            // st.execute("CREATE TABLE employee(id INT, name VARCHAR(50), salary FLOAT)");
            // System.out.println("Table Created Successfully");

            // Insert Data using Hardcoding
            // st.execute("INSERT INTO student VALUES(2, 'Jay', 100)");
            // st.execute("INSERT INTO student VALUES(3, 'kausalya', 97),(4,'Adesh',98)");

            // Insert Data using Instance Variables
            // st.execute("INSERT INTO student VALUES(" + id + ", '" + name + "', " + marks + ")");

            // Insert single Data using Encapsulation Getter Setter 
            // st.execute("INSERT INTO student VALUES(" + s1.getId() + ", '" + s1.getName() + "', " + s1.getMarks() + ")");

            // Insert multiple Data at a time using ArrayList
            // for (Student ss : student) {
            //     st.execute("INSERT INTO student VALUES(" + ss.getId() + ", '" + ss.getName() + "', " + ss.getMarks() + ")");
            // }

            // Update Data using Hardcoding
            //st.execute("UPDATE student set name='Pradip' WHERE id=7");
            // st.execute("UPDATE student set name='Ishwari', marks=98 where id=9");

            // Delete Data using Hardcoding
            // st.execute("DELETE FROM student WHERE id=8");   
            
            // Select Data using Hardcoding
            ResultSet rs = st.executeQuery("SELECT * FROM student");
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                float marks = rs.getFloat("marks");

                System.out.println(id);
                System.out.println(name);
                System.out.println(marks);

                System.out.println("-------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
