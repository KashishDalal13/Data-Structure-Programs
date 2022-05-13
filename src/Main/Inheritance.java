package Main;
import java.util.*;
class A
{
    int i;
    void getdata1()
    {
        Scanner dis=new Scanner(System.in);
        System.out.println("Enter no. 1");
       i=dis.nextInt();
    }
}
class B extends A {
    int j;
    void getdata() {
    Scanner dis = new Scanner(System.in);
    System.out.println("Enter no. 2");
     j  = dis.nextInt();
}
void display()
{
    int res=i*j;
    System.out.println("The multiplication is " +res);
}
}
public class Inheritance {
    public static void main(String[] args) {
        B obj=new B();
        obj.getdata1();
        obj.getdata();
        obj.display();
    }
}
