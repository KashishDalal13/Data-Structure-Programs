package Main;
import java.util.Scanner;
import java.io.File;

public class sizeoffile {

        public static void main(String[] args) {
            System.out.println("/home/students/charset.Main  : " + new File("charset.Main").length() + " bytes");
            System.out.println("/home/students/test.txt : " + new File("charset.txt").length() + " bytes");
        }
    }

