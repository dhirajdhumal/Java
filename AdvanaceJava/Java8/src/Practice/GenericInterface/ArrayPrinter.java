package Practice.GenericInterface;

public interface ArrayPrinter<T> {
    void displayArray(T t);

    public static void main(String[] args) {
        ArrayPrinter<int[]> a = (c)->{
            for(int b:c){
                System.out.println(b);
            }
        };
        a.displayArray(new int[] {14,45,68});

        ArrayPrinter<String[]> a1 = (c)->{
            for(String b:c){
                System.out.println(b);
            }
        };
        a1.displayArray(new String[] {"Jay","Adesh"});

        ArrayPrinter<double[]> a2 = (c)->{
            for(double b:c){
                System.out.println(b);
            }
        };
        a2.displayArray(new double[] {14.235,45.879,68.496});


    }
}
