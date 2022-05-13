package Main;
import java.util.*;
public class k29 {
    public static void main(String[] args) {
        int[] a={10,25,30};
        int ev=0;
        int od=0;
        System.out.println("Original Array: "+Arrays.toString(a));
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                ev++;
            }
            else {
                od++;
            }
        }
        System.out.println("Even : "+ev);
        System.out.println("odd : "+od);
    }
}
