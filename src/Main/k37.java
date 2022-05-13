package Main;
import java.util.*;

public class k37 {
    public static void main(String[] args) {
        int[] a={10,20,30,10};
        System.out.println("Original Array: "+Arrays.toString(a));
        int res=0;
        int cc=0;
        int bc=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==10)
            {
                cc++;
            }
            if(a[i]==20)
            {
                bc++;
            }
        }
        System.out.println(String.valueOf(cc>bc));
    }
}
