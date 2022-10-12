package java8Practice;

import java.util.HashMap;

public class Hash_Map_Demo {
    public static void main(String[] args) {
        //creating an empty hashMap
        HashMap<Integer,String> hash_map = new HashMap<Integer,String>();
        hash_map.put(10,"Geeks");
        hash_map.put(15,"4");
        hash_map.put(20,"Geeks");
        hash_map.put(25,"Welcome");
        hash_map.put(30,"You");

        //Displaying the hashmap

        System.out.println("Initial Mapping are:"+ hash_map);

        
    }
}
