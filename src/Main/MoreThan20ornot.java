package Main;

import java.util.Scanner;

public class MoreThan20ornot {
    public static void main(String[] args) {
      Scanner dis=new Scanner(System.in);
      System.out.println("Enter No1");
      int a=dis.nextInt();
        System.out.println("Enter No2");
        int b=dis.nextInt();
        System.out.println("Enter No3");
        int c=dis.nextInt();
        if ((a - b) >= 20 || (b - c) >= 20 || (c - a) >=20)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
    }
