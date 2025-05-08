package basicsLearning;

public class AverageArray {
    public static void main(String[] args)
    {
      /*   double[] marks={100,90,86,77,54,80};
        double sum=0;
        for (int i=0; i<marks.length; i++)
        {
            sum += marks[i];

        }
        double avg=sum/marks.length;
        System.out.println("The average num of physics marks option by Total Stuudent= " +avg);
        */
        int[][] matrix1={{1,2,3},{7,8,9}};
        int[][] matrix2={{4,5,6},{10,11,12}};
        int[][] matrix={{0,0,0},{0,0,0}};
        for (int i=0;i<matrix1.length; i++)
        {
            for (int j=0; j<matrix1[i].length; j++)
            {
                matrix[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
           
        }
    }
}
