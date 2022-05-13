import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner dis = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = dis.nextInt();
        int s = dis.nextInt();
        double res = (n * (s * s))/(4*Math.tan(Math.PI/n));
        System.out.println("Polygon is " +res );
    }
    }

