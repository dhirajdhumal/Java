package Practice.UserDefineInterface;

public class Print {
    public static void main(String[] args) {
        ReturnString<String, String> s = (i)->{
            return i;
        };
    
        String name = s.displayName("Dhiraj");
        System.out.println(name);
    }
}
