package Practice.UserDefineInterface;

public interface PrintArray<T> {
    void displayArray(T t);

    public static void main(String[] args) {
        PrintArray<int[]> a = (i)->{
            for(int k:i){
                System.out.println("Array Element: " + k);
            }
        };

        a.displayArray(new int[] {1,2,3,4});
    }
}
