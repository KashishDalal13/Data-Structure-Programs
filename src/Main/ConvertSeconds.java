package Main;

import java.util.Scanner;

public class ConvertSeconds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Seconds : ");
        int seconds = in.nextInt();
        int a=seconds%60;
        int b=seconds/60;
        int c=b%60;
        b=b/60;
        System.out.println(b+" : "+c+" : "+a);
    }
}
