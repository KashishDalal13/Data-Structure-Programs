package Main;

import java.util.Scanner;

public class DivisiblebyAnyNo {
    public static void main(String[] args) {
        int cc=0;
        Scanner dis = new Scanner(System.in);
        System.out.println("Enter no");
        int a=dis.nextInt();
        for(int i=5;i<=20;i++)
        {
            System.out.println(i);
            if(i%a == 0)
            {
                cc++;
            }
        }
        System.out.println("The Total number Divisible is "+cc);
    }
}
