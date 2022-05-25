package Main;

import java.util.*;

public class HashMap {
    public static void main(String[] args) {
        Map<Integer,String> h1=new java.util.HashMap<>();

            h1.put(1, "one");
            h1.put(2, "two");
            h1.put(3, "three");

            Hashtable<Integer, String> ht2
                    = new Hashtable<Integer, String>(h1);

            // Print mappings to the console

            System.out.println("Mappings of ht2 : " + ht2);
        }
    }

