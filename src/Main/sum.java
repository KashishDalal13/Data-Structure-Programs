package Main;
import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no1");
        int a=sc.nextInt();
        System.out.println("Enter no2");
        int b=sc.nextInt();
        System.out.println("Enter no3");
        int c=sc.nextInt();
        int d=a+b;
        if(c == d)
        {
            System.out.println("The result is true");
        }
        else
        {
            System.out.println("The result is false");
        }
    }
}
