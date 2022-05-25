package Main;
import java.io.*;
import java.util.*;
public class HashTableAdd {
    public static void main(String[] args) {
        Hashtable<Integer,String> h1=new Hashtable<>();
        Hashtable<Integer,String> h2=new Hashtable<>();
        h1.put(1,"One");
        h1.put(2,"Two");
        h1.put(3,"Three");
        h2.put(4,"Four");
        h2.put(5,"Five");
        h2.put(6,"Six");
        System.out.println("Mappings of ht1 : "+h1);
        System.out.println("Mappings of ht2 : "+h2);
    }
}
