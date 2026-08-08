package strings;

public class Equal{
    public static void main(String[] args) {
      
        // // == 
        // String s1 = "Dhiraj";  // same memory address in scp
        // String s2 = "Dhiraj";  // same memory address in scp

        // String s3 = "Jay";  //different memory address in scp
        // String s4 = "Adesh";  //diffrent memory address in scp

        // //it will check the memory address of both String in scp
        // System.out.println(s1==s2);  //true
        // System.out.println(s3==s4);  //false


        // //.equals
        // String s1 = new String("Dhiraj"); //same content
        // String s2 = new String("Dhiraj"); //same content

        // String s3 = "Dhiraj"; //same ccontent but different memory add as compare to s4
        // String s4 = new String("Dhiraj"); // same content but different memory add as compare to s3

        // // it will check the content of both Strings
        // System.out.println(s1.equals(s2)); // true because content is same 
        // System.out.println(s3.equals(s4)); // true because content is same 
        // System.out.println(s3==s4); // false because memory address is different 


        // //.length() it returns the length of string and it counts white spaces also
        // String name = "Dhiraj Dhumal";
        // System.out.println(name.length()); // it gives 13


        // //.indexOf() it returns the first occurrence of the specified character.
        // //.lastIndexOf() it return the last occurrence of the specified character.
        // String name = "Dhiraj Dhumal";
        // System.out.println(name.indexOf('a')); //it returns 4
        // System.out.println(name.lastIndexOf('a')); //it returns 11

        
        // //.charAt() it return character of specified index
        // String name = "Dhiraj";
        // System.out.println(name.charAt(1)); //it returns h


        // //.equals() it returns true if both strings are equal otherwise it returns false
        // //.equalsIgnoreCase() it returns true if both strings are equal ignoring case otherwise it returns false
        // String name1 = "Dhiraj";
        // System.out.println(name1.equals("Dhiraj")); // it returns true
        // System.out.println(name1.equals("dhiraj")); // it returns false because it is case sensitive
        // System.out.println(name1.equalsIgnoreCase("dhiraj")); // it returns true because it ignores case


        // //.concat() it is used to join two strings
        // String name1 = "Dhiraj";
        // System.out.println(name1.concat(" Dhumal")); // it returns Dhiraj Dhumal


        // //.toUpperCase() it converts all characters of string to upper case
        // //.toLowerCase() it converts all characters of string to lower case
        // String name2 = "Dhiraj";
        // System.out.println(name2.toUpperCase()); // it returns DHIRAJ
        // System.out.println(name2.toLowerCase()); // it returns dhiraj


        // //.startsWith() it returns true if string starts with specified prefix otherwise it returns false
        // //.endsWith() it returns true if string ends with specified suffix otherwise it returns false
        // String name3 = "Dhiraj";
        // System.out.println(name3.startsWith("Dhi")); // it returns true
        // System.out.println(name3.endsWith("j")); // it returns true


        // //.isEmpty() it returns true if string is empty otherwise it returns false
        // //.isBlank() it returns true if string is empty or contains only white spaces otherwise it returns false
        // String name4 = "";
        // System.out.println(name4.isEmpty()); // it returns true
        // System.out.println(name4.isBlank()); // it returns true
        // String name5 = " ";
        // System.out.println(name5.isEmpty()); // it returns false because it contains a space character
        // System.out.println(name5.isBlank()); // it returns true because it contains only a space character



        // //.trim() it removes white spaces from both ends of string
        // String name6 = "  Dhiraj  ";
        // System.out.println(name6.trim()); // it returns Dhiraj without white spaces from both ends


        // //.copareTo() it compares two strings using ASCII values and returns an integer value. If the first string is lexicographically less than the second string, it returns a negative integer. If the first string is lexicographically greater than the second string, it returns a positive integer. If both strings are equal, it returns 0.
        // String name7 = "dhiraj";
        // String name8 = "Dhiraj";
        // System.out.println(name7.compareTo(name8)); // it returns 32 because ASCII value of 'd' is 100 and ASCII value of 'D' is 68 and 100-68=32
        // System.out.println(name8.compareTo(name7)); // it returns -32 because ASCII value
        // //.compareToIgnoreCase() it compares two strings ignoring case and returns an integer value. If the first string is lexicographically less than the second string, it returns a negative integer. If the first string is lexicographically greater than the second string, it returns a positive integer. If both strings are equal, it returns 0.
        // String name9 = "dhiraj";
        // String name10 = "Dhiraj";
        // System.out.println(name9.compareToIgnoreCase(name10)); // it returns 0 because ASCII values are same when case is ignored


        // //.toCharArray() it converts string to character array
        // String name11 = "Dhiraj";
        // char[] charArray = name11.toCharArray();
        // for (char c : charArray) {
        //     System.out.println(c); // it returns D h i r a j
        // }


        // //.valueOf() it is used to convert any data type to string
        // int num = 10;
        // String str = String.valueOf(num);
        // boolean isString = true;
        // String str2 = String.valueOf(isString);
        // System.out.println(str); // it returns "10" as string
        // System.out.println(str2); // it returns "true" as string
        // System.out.println(str2.length()); // it returns 4



    }
}