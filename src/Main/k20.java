package Main;

import java.util.Arrays;

public class k20 {
    public static void main(String[] args) {
        int[] a = {20, 30, 90, 50, 67};
        System.out.println("Original Array: "+ Arrays.toString(a));
        int c=a[0];
        a[0]=a[a.length-1];
        a[a.length-1]=c;
        System.out.println("New array after swaping the first and last elements: "+Arrays.toString(a));
    }
}
