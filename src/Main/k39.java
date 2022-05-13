package Main;
import java.util.*;
public class k39 {
    public static void main(String[] args) {
        int[] a = {11, 10, 13, 10, 45, 20, 33, 53};
        int result = 0;
        System.out.println("Original Array: "+Arrays.toString(a));
        int l = a.length - 1;
        while(a[l] != 10)
            l--;
        int[] b = new int[a.length - 1 - l];
        for(int i = l + 1; i < a.length; i++)
            b[i - l - 1] = a[i];
        System.out.println("New Array: "+Arrays.toString(b));
    }
    }

