package Main;
import java.util.*;
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner dis=new Scanner(System.in);
        System.out.println("Enter Number");
        int a=dis.nextInt();
        if(a%2 == 0)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }

    }
}
