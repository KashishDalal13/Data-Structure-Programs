package Main;

import java.util.Hashtable;

public class HashTableUsingInitialCapacity {
    public static void main(String[] args) {
        Hashtable<Integer,String> h1=new Hashtable<>(4);
        Hashtable<Integer,String> h2=new Hashtable<>(2);
        h1.put(1,"One");
        h1.put(2,"Two");
        h1.put(3,"Three");
        h1.put(7,"Seven");
        h1.put(8,"Eight");
        h2.put(4,"Four");
        h2.put(5,"Five");
        h2.put(6,"Six");
        System.out.println("Mappings of h1 : "+h1);
        System.out.println("Mappings of h2 : "+h2);
    }
}
