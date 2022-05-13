package Main;

import java.util.Scanner;

public class k2 {
    public static void main(String[] args) {
        Scanner dis=new Scanner(System.in);
        System.out.println("Enter No1");
        int a=dis.nextInt();
        System.out.println("Enter No2");
        int b=dis.nextInt();
        if(a<25 || b>75)
        {
            System.out.println("False");
        }
        else {
            int x = a % 10;
            int y = b % 10;
            a /= 10;
            b /= 10;
            System.out.println("True");
        }
    }
    }
