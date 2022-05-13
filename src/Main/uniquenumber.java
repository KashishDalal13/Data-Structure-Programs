package Main;

public class uniquenumber {
    public static void main(String[] args) {
        int amt=0;
        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<=4;j++)
            {
                for(int k=0;k<=4;k++)
                {
                    if(k != i && k !=j && i != j)
                    {
                        amt++;
                        System.out.println(i +"" +j +"" +k);
                    }
                }
            }
        }
        System.out.println("The total unique 3 digits number are "+amt);
    }
}
