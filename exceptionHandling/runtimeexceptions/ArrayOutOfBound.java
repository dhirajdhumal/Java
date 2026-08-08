package exceptionHandling.runtimeexceptions;

public class ArrayOutOfBound {
    public static void main(String[] args) {

        try{
            int arr[] = new int[5];
            arr[0] = 10;
            arr[1] = 20;
            arr[6] = 100;
        }catch(ArrayIndexOutOfBoundsException | NegativeArraySizeException a){
            a.printStackTrace();
        }
        System.out.println("Dhiraj Dhumal");
    }
}
