package Main;

import java.util.Arrays;

public class k21 {
    public static void main(String[] args) {
        String res=" ";
        int[] a={1,-2,4};
        int[] b={5,2,7};
        System.out.println(" Array1: "+ Arrays.toString(a));
        System.out.println(" Array2: "+ Arrays.toString(b));
        for(int i=0;i<a.length;i++)
        {
            int num1=a[i];
            int num2=b[i];
            res+=Integer.toString(num1*num2)+" ";
        }
        System.out.println("The result is "+res);
    }
}
