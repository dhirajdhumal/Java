import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Student{
    public static void main(String[] args) {

        // //Using Object Class We can store different/multiple type of data
        // ArrayList<Object> al = new ArrayList<>();
        // al.add(100);
        // al.add("Dhiraj");
        // al.add(true);
        // al.add(20.6);
        // System.out.println(al);  

        // //Integer Type of Data
        // ArrayList<Integer> al = new ArrayList<>();
        // al.add(100);
        // al.add(200);
        // al.add(300);
        // al.add(400);
        // System.out.println(al);    

        // // String Type of data
        // ArrayList<String> al = new ArrayList<>();
        // al.add("Dhiraj");
        // al.add("Jay");
        // al.add("Adesh");
        // al.add("Suyash");
        // System.out.println(al);

        // // Float Type of data
        // ArrayList<Float> al = new ArrayList<>();
        // al.add(10.6F);
        // al.add(10.6F);
        // al.add(15.9F);
        // al.add(154.3F);
        // System.out.println(al);

        // // Character Type of data
        // ArrayList<Character> al = new ArrayList<>();
        // al.add('J');
        // al.add('a');
        // al.add('y');
        // System.out.println(al);

        // // Boolean Type of data
        // ArrayList<Boolean> al = new ArrayList<>();
        // al.add(true);
        // al.add(false);
        // System.out.println(al);

        // //It Follows Insertion order and Strict indexing order
        // ArrayList<Integer> al = new ArrayList<>();
        // al.add(0,100);
        // al.add(1,200);
        // al.add(2,300);
        // al.add(3,400);
        // System.out.println(al); //it returns [100, 200, 300, 400]

        // //Arraylist can contain duplicates also
        // ArrayList<Integer> al = new ArrayList<>();
        // al.add(100);
        // al.add(200);
        // al.add(300);
        // al.add(400);
        // al.add(200);
        // System.out.println(al); //it returns [100, 200, 300, 400, 200] 

        // //ArrayList can store any number of null values
        // ArrayList<Integer> al = new ArrayList<>();
        // al.add(100);
        // al.add(200);
        // al.add(300);
        // al.add(null);
        // al.add(null);
        // System.out.println(al); //it returns [100, 200, 300, null, null] 

        // //Methods in Arraylist
        // ArrayList<String> al = new ArrayList<>();
        // al.add("Dhiraj");
        // al.add("Jay");
        // al.add("Adesh");
        // al.add("Aniket");
        // al.add("Aniket");
        // al.add("Vedant");
        // al.add("Akshay");

        // ArrayList<String> al2 = new ArrayList<>();
        // al2.add("Vivek");
        // al2.add("Ok");
        // al2.add("Done");

        // System.out.println(al);
        // System.out.println(al.size()); //it return size of arraylist      
        // System.out.println(al.get(3)); //it return the specified indexing value
        // System.out.println(al.set(5, "Akshay")); //it updates the specified indexing value and returns the old value
        // System.out.println(al.remove(4)); //it removes the specified indexing value and returns the removed value
        // System.out.println(al.remove("Aniket")); //it removes the specified value and returns true if it is present in the arraylist otherwise it returns false
        // System.out.println(al.isEmpty()); //it returns true if the arraylist is empty otherwise it returns false
        // //al.clear(); //it clears the arraylist
        // System.out.println(al.contains("Dhiraj")); //it returns true if the specified value is present in the arraylist otherwise it returns false
        // System.out.println(al.indexOf("Akshay")); //it returns the index of the first occurrence of the specified value
        // System.out.println(al.lastIndexOf("Akshay")); //it returns the index of the last occurrence of the specified value
        // System.out.println(al.reversed()); //it returns the reversed arraylist
        // System.out.println(al); //it returns the updated arraylist

        // al.addAll(al2); //it adds the specified arraylist to the end of the current arraylist
        // System.out.println(al); //it returns the updated arraylist

        //Iteration in Arraylist
        ArrayList<String> al = new ArrayList<>();
        al.add("Dhiraj");
        al.add("Jay");
        al.add("Adesh");
        al.add("Suyash");
     
        // //1) Using for loop
        // for(int i=0; i<al.size(); i++){
        //     System.out.println(al.get(i));
        // }

        // //2) Using for-each loop
        // for(String s: al){
        //     System.out.println(s);
        // }

        //3) iterator() method
        //we can use in whole collection framework like list, set, map etc
        //ieterator can iterate in only forward direction
        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //4) listIterator() method
        //it can be used only in list interface
        //listIterator can iterate in both forward and backward direction
        ListIterator<String> itr1 = al.listIterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        System.out.println("==============");

        while(itr1.hasPrevious()){
            System.out.println(itr1.previous());
        }
    }
}