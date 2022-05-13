package Main;

import java.util.Scanner;

public class countofstring {
    public static void main(String[] args) {
        int cc=0;
        int ss=0;
        int dd=0;
        int other=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++) {
            if (Character.isLetter(a.charAt(i))) {
                cc++;
            }
            if (Character.isSpaceChar(a.charAt(i))) {
                ss++;
            }
            if (Character.isDigit(a.charAt(i))) {
                dd++;
            } else {
                other++;
            }
        }
            System.out.println("The letters are "+cc);
            System.out.println("The spaces are "+ss);
            System.out.println("The digits are "+dd);
            System.out.println("The others are "+other);

    }
}
