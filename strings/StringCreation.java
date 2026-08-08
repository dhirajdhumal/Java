package strings;

public class StringCreation {

    public static void main(String[] args) {

        // //String is also called Character array
        // char c[] = {'A', 'B', 'C', 'D'};
        // String s = new String(c);
        // System.out.println(s);

        // //String creation Ways 
        // //1)String Literals
        // String state = "Maharashtra";  //String is immutable
        // System.out.println(state);
        // state.concat("ShiivajiMaharaj");
        // System.out.println(state); //String is not changed 

        // //2)Using new Keyword
        // String s1 = new String("Dhiraj");  //String Class is immutable
        // System.out.println(s1);
        // s1.concat("Jay");
        // System.out.println(s1); //String is not changed

        // //3)Using StringBuilder Class
        // StringBuilder sb = new StringBuilder("Jay");  //StringBuilder is a Mutable Class.
        // System.out.println(sb);
        // sb.append("Dhiraj");
        // System.out.println(sb); // Here String Change
        
        // //4)Using StringBuffer Class
        // StringBuffer sf = new StringBuffer("Adesh");  //StringBuffer is also Mutable Class.
        // System.out.println(sf);
        // sf.append(" jay");
        // System.out.println(sf); // here string change
    }
}
