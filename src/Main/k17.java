package Main;

import java.util.Arrays;

public class k17 {
    public static void main(String[] args) {
        int[] a={10,20,30};
        System.out.println("Original Array: "+ Arrays.toString(a));
        int[] b={a[1],a[2],a[0]};
        System.out.println("Rotated Array: "+Arrays.toString(b));
    }
}
