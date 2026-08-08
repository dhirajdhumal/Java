package fileHandling;

import java.io.File;

public class CreateMultipleFiles {

    public static void main(String[] args) {
        for(int i=1; i<=100; i++) {


            File file = new File("C:\\Users\\Dhiraj\\Documents\\Full Stack - Java\\Java\\ExceptionHandlingFileHandling\\src\\main\\java\\fileHandling\\employee'"+i+"'.txt");

//            try {
            //delete multiple files
            file.delete();
            System.out.println("deleted");
            //create multiple files
//                if (file.createNewFile()) {
//                    System.out.println("File Created");
//                } else {
//                    System.out.println("File already Exists");
//                }
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
        }
    }
}
