package basicsLearning;

public class ArrayProblem {
    public static void main(String[] args)
    {
        /* 
        //problem no.1 from code with Harry video #29
        float[] marks={80f,70.5f,60f,39f,62.5f};
        float sum=0;
        for(float element:marks)
        {
            sum += element;
        }
        System.out.println("The sum of 5 float Num is: "+sum);
        
        //Ques no. 2
        int[] mark={50,60,74,20};
        int num=74;
        boolean cheakArray=false;
        for (int element:mark)
        {
            if(element==num)
            {
                cheakArray=true; break;
            }
        }
        if(cheakArray)
        {
            System.out.println("The Value is present in Array");
        }
        else
        {
            System.out.println("The Value is not present in Array");
        }*/
        int[] num={9,78,23,1,5,7,20};
        boolean isSorted=true;
        for(int i=0; i<num.length-1; i++)
        {
            if(num[i]> num[i+1])
            {
                isSorted= false; break;
            }
        }
        if(isSorted)
        {
            System.out.println("The array is sorted");
        }
        else
        {
            System.out.println("The array is not sorted");
        }

    }
    
}
