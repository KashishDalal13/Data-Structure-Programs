package Main;
import java.util.*;
public class k48 {
    public static void main(String[] args) {
        Scanner dis=new Scanner(System.in);
        System.out.println("Enter number");
        int num=dis.nextInt();
        int n=num;
        long ctr=0;
        while(num!=0)
        {
            ctr+=num/5;
            num/=5;
        }
        System.out.printf("Number of trailing zeros of the factorial %d is %d ",n,ctr);
    }
}
