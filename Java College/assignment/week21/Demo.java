package assignment.week21;

public class Demo {
    public static void main(String[] args) {
        try
        {
        //ques 3 
        System.out.println(10/0);
        }

        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
