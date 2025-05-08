package examPractise;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrt {
    // ArrayList<String> name;
    public static void main(String[] args) {
        
        // ArrayListPrt name = new ArrayListPrt();  
        // name.name = new ArrayList<>();   //wecan do like this my making instance arraylist

        ArrayList<String> name = new ArrayList<>();
        name = new ArrayList<>();
        name.add("Munal");
        name.add("Namita");
        name.add("Numa");
        name.add(3, "Gaurab");
        name.add("Munal");

        // name.remove(); compile error

        // name.set(5, "Hello"); //set out hunxa set lai
        // System.out.println(name.contains("Monal"));

        System.out.println(name.size());

        System.out.println(name.indexOf("Namita"));

        System.out.println(name.lastIndexOf("Munal")); // this is for if two same element xa vane last ko index dinxa 
        
        // System.out.println(name.remove("Munal"));
        // name.remove(7); // if we try to remove out of range

        // System.out.println(name.get(4));

        System.out.println(name.isEmpty());


        // for(String element: name)
        // {
        //     System.out.println(element);
        // }

        
        Iterator<String> iterator = name.iterator();
        while (iterator.hasNext()) {
            String ele = iterator.next();
            if (ele.equals("Munal"))
            {
                iterator.remove();
            }
            System.out.println(ele); //it will print then only remove so to see accurate rasultprint outsde
            
        }

        System.out.println(name);

        ArrayList<String> num = new ArrayList<>();
        num.add("1");
        num.add("2");


        num.addAll(name);
        System.out.println(num);

        ArrayList<String> num2 = new ArrayList<>(num);
        num2.add(3,"hello");
        num2.remove(5);
        System.out.println(num2);
    }
}
