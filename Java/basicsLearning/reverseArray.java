package basicsLearning;

public class reverseArray {
    public static void main(String[] args)
    {
        int[] num={1,2,3,4,5,6,7};
        int l=num.length;
        int n=Math.floorDiv(l,2);
        // System.out.println(n);
        int temp;
        for (int i=0; i<n; i++)
        {
            temp=num[i];
            num[i]=num[l-i-1];
            num[l-i-1]=temp;
        }
        for (int element: num)
        {
            System.out.print(element+" ");
        }
    }
}
