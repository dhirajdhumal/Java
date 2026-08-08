package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTxtFIle {
    public static void main(String[] args) {
//        File file = new File("C:\\Users\\Dhiraj\\Documents\\Full Stack - Java\\Java\\ExceptionHandlingFileHandling\\src\\main\\java\\filehandling\\student.java");

//        int a=10, b=20;
//        int numbers[] = {10,20,5,46,5,22,6,2,22,2,33,2221,2,22,1,1,22211};
//        String names[] = {"Dhiraj", "Jay", "Aadesh"};
//        Student s1 = new Student();
//        s1.setId(3);
//        s1.setName("Adesh");
//        s1.setAddress("Lingdeo");
//        try{
//            FileWriter fw = new FileWriter("C:\\Users\\Dhiraj\\Documents\\Full Stack - Java\\Java\\ExceptionHandlingFileHandling\\src\\main\\java\\filehandling\\student.txt",true);
//            fw.write(" \nI know advanced java");
//            fw.write("\n Addition = " + (a+b) );

//            for(int i=0; i<names.length; i++){
//                fw.write("\nArray names are: " + names[i]);
//            }

//            fw.write("\n================");
//            fw.write("\nId: " + s1.getId());
//            fw.write("\nName: " + s1.getName());
//            fw.write("\nAddress: " + s1.getAddress());

//            fw.flush();
//            System.out.println("Data Added in File");
//
//        }catch (IOException i){
//            System.out.println(i.getMessage());
//        }

        // Recommended Way to write code for the Security.
        FileWriter fw = null;
        try{
         fw = new FileWriter("C:\\Users\\Dhiraj\\Documents\\Full Stack - Java\\Java\\ExceptionHandlingFileHandling\\src\\main\\java\\filehandling\\student.txt");

//         for(int i=1; i<=100; i++){
//////             fw.write("\nNumbers : " + i );  //it will convert int to ASCII value
//////             fw.write(Integer.toString(i)+ "  \n ");  // using wrapper class
////             fw.write("value: " + i + " ");
////         }
        fw.write("Dhiraj Dhumal");

            fw.flush();
            System.out.println("Data Successfully Created");
        } catch (IOException i) {
            i.printStackTrace();
        } finally { // Finally is a block which is used to close the resoruces like FileWriter
            try{
                fw.close();
            }catch (IOException i){
                i.printStackTrace();
            }
        }

    }
}
