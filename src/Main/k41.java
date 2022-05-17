package Main;
import java.util.*;
public class k41 {
    public static void main(String[] args) {
       int[] a = {11, 15, 13, 10, 45, 20, 11, 15};
        System.out.println("Original Array: "+Arrays.toString(a));
        int res=0;
        int l=2;
        int start=0;
        int end=a.length-2;
        for(;l>0;l--)
        {
            if (a[start] != a[end])
                res = 1;
            else
            {
               start++;
               end++;
            }
        }
        if(res==1)
        {
            System.out.println(String.valueOf(false));
        }
        else
        {
            System.out.println(String.valueOf(true));
        }
    }
}
