package Main;
import java.util.*;
public class calc {
    public static void main(String[] args) {
        Scanner dis=new Scanner(System.in);
        System.out.println("Enter x1");
        double x1=dis.nextDouble();
        System.out.println("Enter y1");
        double y1=dis.nextDouble();
        System.out.println("Enter x2");
        double x2=dis.nextDouble();
        System.out.println("Enter y2");
        double y2=dis.nextDouble();
        double r=6371.01;
        double res=(r*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2)));
        System.out.println("The distane is"+res);
    }
}
