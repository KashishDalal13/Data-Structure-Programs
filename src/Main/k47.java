package Main;
import java.util.*;
public class k47 {
    public static void main(String[] args) {
        Scanner dis=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=dis.nextInt();
        System.out.println("Enter second number");
        int num2=dis.nextInt();
        while(num2!=0)
        {
            int carry=num1 & num2;
            num1= num1^num2;
            num2=carry<<1;
        }
        System.out.println("The sum is "+num1);
    }
}
