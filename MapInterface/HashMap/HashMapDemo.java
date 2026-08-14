package MapInterface.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

    public static void main(String args[]) {
        //K and V is a generics inside that bracket
        //K means Key and V means value

        HashMap<String, String> data = new HashMap<>();
        data.put("dhiraj", "name");
        data.put("male", "gender");
        data.put("female", "gender");
        data.put("jay", "Dhiraj");

        data.put("dhumal", "dhumal");//it used to add key value pair in the hashmap.
        data.putAll(data); //it used to add all the key value pair in the hashmap.
        System.out.println("Size of the HashMap: " + data.size());//it is used to get the size of the hashmap. 
        // it will only unique key value pair. 
        // if we add duplicate key it will not be added in the hashmap.
        System.out.println("Keys in the HashMap: " + data.keySet());//it will return all the keys in the hashmap.
        System.out.println("Values in the HashMap: " + data.values());//it will return all the values in the hashmap.
        // data.clear();//it will remove all the key value pair from the hashmap.
        System.out.println("Is the HashMap empty? " + data.isEmpty());//it will return true if the hashmap is empty otherwise it will return false.    
        System.out.println("Value for key 'dhiraj': " + data.get("dhiraj"));//it will return the value associated with the key.
        System.out.println("Removed value for key 'dhiraj': " + data.remove("dhiraj"));//it will remove the key value pair from the hashmap.
        System.out.println("Replaced value for key 'Jay': " + data.replace("Jay", "Dhumal"));//it will replace the value associated with the key.
        System.out.println("Does the HashMap contain key 'dhiraj'? " + data.containsKey("dhiraj"));//it will return true if the key is present in the hashmap otherwise it will return false.
        System.out.println("Does the HashMap contain value 'gender'? " + data.containsValue("gender"));//it will return true if the value is present in the hashmap otherwise it will return false.

        //way to iterate through the hashmap using entrySet() method.
        Set<Entry<String, String>> entries = data.entrySet();//it is method entrySet() which is used to get the set of key value pairs in the hashmap.
        for(Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

 