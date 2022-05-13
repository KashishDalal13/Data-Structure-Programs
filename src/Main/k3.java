package Main;

import java.util.Scanner;

public class k3 {
    public static void main(String[] args) {
        Scanner dis=new Scanner(System.in);
        System.out.println("Enter No1");
        int a=dis.nextInt();
        System.out.println("Enter No2");
        int b=dis.nextInt();
        int d=a/b;
        int f=a -(d*b);
        System.out.println(f);
    }
}
