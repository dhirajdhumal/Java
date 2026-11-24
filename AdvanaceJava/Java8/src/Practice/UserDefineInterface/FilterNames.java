package Practice.UserDefineInterface;

public interface FilterNames<T> {
    void displayName(T t);

    public static void main(String[] args) {
        FilterNames<String[]> n = (a)->{
            for(String s:a){
                if(s.length() > 5){
                    System.out.println(s);
                }
            }
        };
        n.displayName(new String[] {"Dhiraj","Jay","Adesh","Kausalya"});
    }
}
