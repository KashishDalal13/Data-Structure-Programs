package Main;
import java.util.*;

public class TraversalOfHashTable
{
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("vishal", 10);
        ht.put("sachin", 30);
        ht.put("vaibhav", 20);

        for (Map.Entry<String, Integer> e : ht.entrySet())
        {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}

