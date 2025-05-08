package arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class name {
    
   
    public static void display()
    {
        
        ArrayList<String> name = new ArrayList<>();
        name.add("Munal");
        name.add("Namita");
        name.add("Numa");
        name.add("Gaurab");
        name.set(0,"Solomon");
        name.remove(0);

        // System.out.println(name.contains("Solomon"));
        // System.out.println(name.size());
        // System.out.println(name.get(1));

    //printing it by using for loop
        // for (int i=0; i<name.size(); i++)
        // {
        // System.out.println(name.get(i));
        // }

    //making clone of name 
        // ArrayList name2 = (ArrayList)name.clone();
        // name2.set(1,"Munal");
        // name2.add("Debit");
        // System.out.println(name2);
        // System.out.println(name2.indexOf("Munal"));

        //sort method help to arrange in numerically or alphabetically
        Collections.sort(name);

        

    //printing it by using for-Each loop
        for(String names: name)
        {
            System.out.println(names);
        }
        
    //it will print false because name object is not empty as it is containing already name in it.
        System.out.println(name.isEmpty());
    
    }
    


    public static void main(String[] args) {
        display();
    }
}

