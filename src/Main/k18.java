package Main;

import java.util.Arrays;

public class k18 {
    public static void main(String[] args) {
        int[] a={20,30,40};
        System.out.println("Original Array : " + Arrays.toString(a));
        int max=a[0];
        if(a[1]>=max)
            max=a[2];
         System.out.println("Largest value is "+max);
    }
}
