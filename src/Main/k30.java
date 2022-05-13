package Main;

import java.util.Arrays;

public class k30 {
    public static void main(String[] args) {
        int[] a={10,10,34,5,20,20};
        System.out.println("Original Array: "+ Arrays.toString(a));
        boolean found1010=false;
        boolean found2020=false;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==10 && a[i+1]==10)
            {
                found1010=true;
            }
            else if(a[i]==20 && a[i+1]==20)
            {
                found2020=true;
            }
        }
        System.out.println(found1010!=found2020);
    }
}
