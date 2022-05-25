package Main;

import java.util.Hashtable;
import java.util.Map;
import java.util.Enumeration;
public class ChangingElementsInHashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> h1 = new Hashtable<>(4);
        h1.put(1, "One");
        h1.put(2, "Two");
        h1.put(3, "Three");
        System.out.println("Mappings of h1 : " + h1);
        h1.put(2, "For");
        System.out.println("Changed h1 : " + h1);
        System.out.println("---------------------------------------------------------------------------------");

        Hashtable<Integer, String> h2 = new Hashtable<>(4);
        h2.put(1, "One");
        h2.put(2, "Two");
        h2.put(3, "Three");
        System.out.println("Mappings of h2 : " + h2);
        h2.clear();
        System.out.println("Updated " + h2);
        System.out.println("---------------------------------------------------------------------------------");

        Hashtable<Integer, String> h3 = new Hashtable<>(3);
        h3.put(1, "One");
        h3.put(2, "Two");
        h3.put(3, "Three");
        System.out.println("Mappings of h3 : " + h3);
        System.out.println("Clone table " + h3.clone());
        System.out.println("---------------------------------------------------------------------------------");

        Map<String, Integer> h4 = new Hashtable<>();
        h4.put("Pen", 10);
        h4.put("Cloth", 20);
        h4.put("Book", 24);
        System.out.println("Mappings of h4 : " + h4.toString());
        h4.compute("Pen", (key, val) -> val + 15);
        h4.compute("Book", (key, val) -> val - 10);
        System.out.println("New HashTable " + h4);
        System.out.println("---------------------------------------------------------------------------------");

        Map<Integer, String> h5 = new Hashtable<>();
        h5.put(10, "Pen");
        h5.put(20, "Cloth");
        h5.put(30, "Book");
        System.out.println("Mappings of h5 : " + h5.toString());
        h5.compute(20, (key, val) -> val.substring(0, 3) + "$");
        System.out.println("New HashTable " + h5);
        System.out.println("---------------------------------------------------------------------------------");

        Map<String, Integer> h6 = new Hashtable<>();
        h6.put("key1", 10000);
        h6.put("key2", 55000);
        h6.put("key3", 44300);
        h6.put("key4", 53200);
        System.out.println("HashMap: " + h6.toString());
        h6.computeIfAbsent("key5", k -> 2000 + 3000);
        h6.computeIfAbsent("key6", k -> 20 * 300);
        System.out.println("New " + h6);
        System.out.println("---------------------------------------------------------------------------------");

        Map<Integer, String> h7 = new Hashtable<>();
        h7.put(1, "hy");
        h7.put(2, "I");
        h7.put(3, "am");
        System.out.println("HashMap: " + h7.toString());
        h7.computeIfAbsent(4, k -> "Kashish");
        System.out.println("New " + h7);
        System.out.println("---------------------------------------------------------------------------------");

        Hashtable<Integer, String> hash_table = new Hashtable<Integer, String>();
        hash_table.put(10, "Geeks");
        hash_table.put(15, "4");
        hash_table.put(20, "Geeks");
        hash_table.put(25, "Welcomes");
        hash_table.put(30, "You");
        System.out.println("The Table is: " + hash_table);
        Enumeration enu = hash_table.elements();
        System.out.println("The enumeration of values are:");
        while (enu.hasMoreElements())
        {
            System.out.println(enu.nextElement());
        }
        System.out.println("---------------------------------------------------------------------------------");


    }
}
