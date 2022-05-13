package Main;

import java.util.Scanner;

public class K1 {
    public static void main(String[] args) {
        Scanner dis=new Scanner(System.in);
        System.out.println("Enter No1");
        int a=dis.nextInt();
        System.out.println("Enter No2");
        int b=dis.nextInt();
        if(a>b)
        {
            System.out.println(a);
        }
        if(a<b)
        {
            System.out.println(b);
        }
        if(a == b)
        {
            System.out.println("0");
        }
        if(a%6==0 && b%6==0)
        {
            if(a<b)
            {
                System.out.println(a);
            }
            if(b<a)
            {
                System.out.println(b);
            }
        }
    }
    }
