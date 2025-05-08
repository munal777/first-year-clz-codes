package basicsLearning;

public class LoopPattern {
    public static void main(String[] args)
    {
     for (int i=0; i<=4; i++)
     {
        for (int j=4; j>i; j--)
        {
            System.out.print(" ");
        }
        for (int k=0; k<=i; k++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
     }   
    }    
}
