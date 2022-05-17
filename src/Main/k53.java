package Main;
import java.util.*;
public class k53 {
    public static int findIndex(int[] arr,int t)
    {
            if(arr==null)
            {
                return -1;
            }
            int len=arr.length;
            int i=0;
            while(i<len)
            {
                if(arr[i]==t)
                {
                    return i;
                }
                else
                {
                    i=i+1;
                }
            }
            return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
            System.out.println("Index position of 20 is: "
                    + findIndex(arr,20));
        }
    }

