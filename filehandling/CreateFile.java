package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Dhiraj\\Documents\\Full Stack - Java\\Java\\ExceptionHandlingFileHandling\\src\\main\\java\\filehandling\\text.txt");

        try{
            if(file.createNewFile()){
                System.out.println("Java File Created.");
            }else {
                System.out.println("Java File already Created.");
            }

        }catch (IOException i){
            System.out.println(i.getMessage());
        }

    }
}
