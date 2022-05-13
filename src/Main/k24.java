package Main;
import java.util.*;
public class k24 {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner dis=new Scanner(System.in);
        int n=dis.nextInt();
        while(n != 1)
        {
            if(n%2==0)
            {
                n=n/2;
            }
            else
            {
               n = (n*3+1)/2;
            }
        }
        System.out.println("Value of n = "+n);
    }
}
