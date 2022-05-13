package Main;

import java.util.Arrays;

public class k38 {
    public static void main(String[] args) {
        int[] a={10,20,60,49};
        int res=0;
        System.out.println("Original Array: "+ Arrays.toString(a));
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==10 || a[i]==30)
            {
                res=1;
            }
        }
        if (res==1)
            System.out.printf( String.valueOf(true));
        else
            System.out.printf(String.valueOf(false));
    }
    }
