package Main;

public class k28 {
    public static void main(String[] args) {
        long starttime=System.nanoTime();
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
        long estimatedtime=System.nanoTime()-starttime;
        System.out.println("The estimated time is "+estimatedtime);
    }
}
