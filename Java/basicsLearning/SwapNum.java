package basicsLearning;

public class SwapNum
{
    static void decToBinary(int n)
    {
        int[] binaryNum = new int[1000];
        int i=0;
        while (n > 0)
        {
            binaryNum[i] = n % 2;
            n = n/2;
            i++;
        }
        for (int j= i-1; j >=0; j--)
        {
            System.out.println(binaryNum[j]);
        }
    }
    public static void main(String[] args) 
    {
        int n=9;
        System.out.println("decimal: " + n);
        System.out.print("Binary: ");
        decToBinary(n);
    }
}