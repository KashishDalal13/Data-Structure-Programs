package Main;

import java.util.HashMap;
import java.util.*;

public class HashTableRemove {
    public static void main(String[] args) {
        Map<Integer,String> h1=new HashMap<>();
        h1.put(1, "one");
        h1.put(2, "two");
        h1.put(3, "three");
        System.out.println("Initial : " + h1);
        h1.remove(2);
        System.out.println("Updated : " + h1);
    }
}
