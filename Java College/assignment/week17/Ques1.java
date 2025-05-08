package assignment.week17;
import java.util.ArrayList;
import java.util.Iterator;

public class Ques1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        ArrayList<String> names = new ArrayList<>();
        names.add("Munal");
        names.add("Namita");
        names.add("Gaurab");
        names.add("Aayush");
        names.add("Sagar");
        names.add("Raga");

        Iterator<Integer> numIterator = numbers.iterator();
        while(numIterator.hasNext()) 
        {
            int num = numIterator.next();
            System.out.println(num);
        }
        
        Iterator<String> strIterator = names.iterator();
        while(strIterator.hasNext())
        {
            String str = strIterator.next();
            System.out.println(str);

            if(str.equals("Gaurab"))
            {
                strIterator.remove();
            }
        }

        for(int number: numbers)
        {
            System.out.println(number);
        }
        
        for(String name: names)
        {
            System.out.println(name);
        }

        //clearing the numbers
        numbers.clear();


        //printing size of both arraylist
        System.out.println("The size of Number is: " + numbers.size());
        System.out.println("The size of Name is: " + names.size());

        //getting 3rd & 5th names
        if(names.size() > 2)
        {
            System.out.println("The third element of name: " + names.get(2));
        }
        if(names.size() > 4)
        {
            System.out.println("The fifth elements of name: " + names.get(4));
        }
        
    }
}

