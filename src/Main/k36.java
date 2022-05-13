package Main;
import java.util.*;

public class k36 {
    public static void main(String[] args) {
        int[] a = {10, 11, 10, 20, 43, 20, 50};
        int[] b = {10, 13, 11, 20, 44, 30, 50};
        int cc=0;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        for(int i=0;i<a.length;i++)
        {
            if(Math.abs(a[i]-b[i]) <=1 && a[i]!=b[i])
            {
                cc++;
            }
        }
        System.out.println("Number of elements "+cc);
    }
    }
