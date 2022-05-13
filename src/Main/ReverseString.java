package Main;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String a=sc.nextLine();
        for(int i=a.length()-1;i>=0;i--)
        {
            System.out.println(a.charAt(i));
        }
    }
}
