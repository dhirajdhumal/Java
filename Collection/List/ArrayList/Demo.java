
import java.util.ArrayList;

class Demo {

    public static void main(String[] args) {

        //Using Getter setter
        // Student2 s1 = new Student2();
        // s1.setId(1);
        // s1.setName("Dhiraj");
        // s1.setAddress("Lingdeo");

        // Student2 s2 = new Student2();
        // s2.setId(2);
        // s2.setName("Jay");
        // s2.setAddress("Palava");

        // Student2 s3 = new Student2();
        // s3.setId(3);
        // s3.setName("Adesh");
        // s3.setAddress("Newasa");

        // Student2 s4 = new Student2();
        // s4.setId(4);
        // s4.setName("Kausalya");
        // s4.setAddress("Palava");

        ArrayList<Student2> al = new ArrayList<>();
        //using getter setter
        // al.add(s1);
        // al.add(s2);
        // al.add(s3);
        // al.add(s4);

        //using Constructor
        al.add(new Student2(1, "Dhiraj", "Pune"));
        al.add(new Student2(2, "Jay", "Pune"));
        al.add(new Student2(3, "Adesh", "Pune"));


        // //Using for loop
        // for(int i=0; i<al.size(); i++){
        //     System.out.println(al.get(i));
        // }
        //Using for each loop
        for (Student2 s : al) {
            //using toStirng
            // System.out.println(s);

            //using toString like mehtod but we have to call it
            System.out.println(s.data());

            //using our own mwthod
            // s.display();

            //using getter
            // System.out.println(s.getId());
            // System.out.println(s.getName());
            // System.out.println(s.getAddress());
            // System.out.println("=====================");

            
        }

        // //Using iterator
        // Iterator<Student2> itr = al.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }
        // //Using list iterator
        // ListIterator<Student2> itr2 = al.listIterator();
        // while(itr2.hasNext()){
        //     System.out.println(itr2.next());
        // }
    }
}
