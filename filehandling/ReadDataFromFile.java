package fileHandling;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {
    public static void main(String[] args) {
        //Read Data from file
        try {
FileReader fr = new FileReader("C:\\Users\\Dhiraj\\Documents\\Full Stack - Java\\Java\\ExceptionHandling-FileHandling\\Student.txt");

//            int i = fr.read();
//            System.out.println(i);

            //while loop because we dont know now how many characters in the file
            int data;
            while ((data = fr.read()) != -1){
                System.out.println(data);
            }

            System.out.println("Data Successfully Readed");
        } catch (IOException i) {
            i.printStackTrace();
        } finally { // Finally is a block which is used to close the resoruces like FileWriter

        }
    }
}
