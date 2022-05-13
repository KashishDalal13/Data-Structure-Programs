package Main;

import java.util.Arrays;

public class k40 {
    public static void main(String[] args) {
        int[] a = {11, 30, 13, 10, 45, 20, 33, 53};
        int result = 0;
        System.out.println("Original Array: "+ Arrays.toString(a));
        int l = 0;
        while(a[l] != 10)
            l++;
        int[] b = new int[l];
        for(int i = 0;i<l; i++)
            b[i] = a[i];
        System.out.println("New Array: "+Arrays.toString(b));
    }
    }
