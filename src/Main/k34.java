package Main;
import java.util.*;
public class k34 {
    public static void main(String[] args) {
        int[] a = {10, 20, 10, 50, 20, 13, 50};
        boolean test = false;
        int res=0;
        int x = 10;

        for(int i = 0; i < a.length - 1; i++)
        {
            if(a[i] == x && a[i+1] == x)
            {
                System.out.println( String.valueOf(true));
                res = 1 ;
            }

            if(i <= a.length - 3 && a[i] == x && a[i+2] == x)
            {
                System.out.println( String.valueOf(true));
                res = 1 ;
            }
        }

        if (res==0)
        {
            System.out.println( String.valueOf(false));
        }

    }
    }

