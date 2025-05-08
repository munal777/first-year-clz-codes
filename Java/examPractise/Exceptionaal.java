package examPractise;

public class Exceptionaal {
    int x= 10;
    
    public static void main(String[] args) {
        // try
        // {
        //     int i, sum;
        //     sum = 10;
        //     for (i = -1; i< 3; ++i)
        //     {
        //         sum = (sum/i);
        //     }
        //     // System.out.println("munsl"+ " "+ 1/0);
        // }
        // catch (Exception e)
        // {
        //     System.out.println(e);
        // }
        Exceptionaal x = new Exceptionaal();
        System.out.println(x.x);

        try
        {
            int num = Integer.parseInt("Jivan");
        }
        finally
        {
            System.out.println("mei tho aagaya");
        }
}

}
