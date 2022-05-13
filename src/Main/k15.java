package Main;

import java.util.Arrays;

public class k15 {
        public static void main(String[] args) {
            int[] a={50,-20,0};
            int[] b={5,-50,10};
            System.out.println("Array1 :"+Arrays.toString(a));
            System.out.println("Array2 :"+Arrays.toString(b));
            int[] new_array={a[0],b[b.length-1]};
            System.out.println("New Array :"+Arrays.toString(new_array) );
        }
}
