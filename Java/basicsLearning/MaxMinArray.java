package basicsLearning;

public class MaxMinArray {
    public static void main(String[] args)
    {
        int[] num={33,32,12,45,233,13,14};
        int max= 233;
        for(int element: num)
        {
            if (element<max)
            {
                max=element;
            }
        }
        System.out.println("the Maximum num is "+max+".");
    }
}
