package Main;

public class k33 {
    public static void main(String[] args) {
        int[] a={10,30,50,20,70};
        boolean test=false;
        int res=0;
        int x=10;
        int y=20;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==x)
            {
                test=true;
            }
            if(test && a[i]==y)
            {
                System.out.println( String.valueOf(true));
                res = 1;
            }
        }
        if(res==0)
        {
            System.out.println( String.valueOf(false));
        }
    }
    }
