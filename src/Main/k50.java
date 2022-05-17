package Main;
import java.util.*;
public class k50 {
    public static void main(String[] args) {
        int remainder;
        int reversenum=0;
        Scanner dis=new Scanner(System.in);
        System.out.println("Enter number");
        int num=dis.nextInt();
        int originalnum=num;
        while(num !=0)
        {
            remainder=num%10;
            reversenum=reversenum*10+remainder;
            num=num/10;
        }
        if(originalnum==reversenum)
        {
            System.out.println("Is Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
