package fileHandling.CRUD;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student {

    static void createFile() {
        try {
            File f = new File("C:\\Users\\Dhiraj\\Documents\\Full Stack - Java\\Java\\ExceptionHandling-FileHandling\\filehandling\\CRUD\\Teacher.txt");
            f.createNewFile();
            System.out.println("File Created Successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readFile() {
        try {
            FileReader fr = new FileReader("C:\\Users\\Dhiraj\\Documents\\Full Stack - Java\\Java\\ExceptionHandling-FileHandling\\filehandling\\CRUD\\Student.txt");
            int data = fr.read();
            System.out.println("Ascii Number Of First Letter Of File: " + data);
            System.out.println("File readed Successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void writeFile() {

        try {
            FileWriter fw = new FileWriter("C:\\Users\\Dhiraj\\Documents\\Full Stack - Java\\Java\\ExceptionHandling-FileHandling\\filehandling\\CRUD\\Teacher.txt", true);
            fw.write("\nAdesh Babasaheb Dhumal");
            fw.flush();
            System.out.println("File Updated Successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void deleteFile() {
        try {
            File file =  new File("C:\\Users\\Dhiraj\\Documents\\Full Stack - Java\\Java\\ExceptionHandling-FileHandling\\filehandling\\CRUD\\Teacher.txt");
            file.delete();
        } finally{
            System.out.println("File delete/deleted successfully");
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("-------------Operations------------");
        System.out.println("1.Create a new File");
        System.out.println("2.Read Existing File");
        System.out.println("3.Write into Existing File");
        System.out.println("4.Delete File/Files");

        System.out.print("Choose Operation which you to perform: ");
        Scanner sc = new Scanner(System.in);

        int operation = sc.nextInt();

        switch (operation) {
            case 1:
                s.createFile();
                break;

            case 2:
                s.readFile();
                break;

            case 3:
                s.writeFile();
                break;

            case 4:
                s.deleteFile();
                break;
            default:
                System.out.println("Invalid Operation Or Wrong Input Choosen");
                break;
        }
    }
}
