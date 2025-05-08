package practise;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListExample {
    private ArrayList<String> students;
    private String names;
    public arrayListExample()
    {
        this.students = new ArrayList<>();
    }
    public arrayListExample(String names)
    {
        this.names = names;
    }

    public void addStudent(String st)
    {
        students.add(st);
    }
    public void display()
    {
        for(String nam: students)
        {
            System.out.println(nam);
        }
    }
    public static void main(String[] args) {

        arrayListExample arraylist = new arrayListExample();
        arrayListExample arraylistVariable = new arrayListExample("munal");

        arraylist.addStudent(arraylistVariable.names);


        arraylist.display();









        ArrayList<String> name = new ArrayList<>();

        name.add("Munal");
        name.add("Numa");
        name.add("Suresh");
        name.add(1,"Raga"); //add in the index 1 without replacing the current element that will will be shift to index 2
        name.set(0, "Stuti"); //set replace the index 0 as stuti

        Iterator<String> list = name.iterator();
        while (list.hasNext()) {
            String nam = list.next();
            if(nam.equals("Numa"))
            {
                list.remove();
            }
        }


        // for(String names: name)    //-----while removing and adding elements in arraylist by using for-each loop then it will throws concurrentModificationExException in thread "main" java.util.ConcurrentModificationExceptiontion
        // {
        //     if(names.equals("Stuti"))
        //     {
        //         name.add(0,"Munal");
        //     }
        // }

        for(int i=0; i<name.size(); i++)
        {
            if(i == 0)
            {
                name.add(0,"Munal");
            }
            System.out.println(i);
        }

        System.out.println(name);
        // name.remove(3); // remove suresh which is in index 3



        // System.out.println(name);
        // System.out.println(name.size());
        // System.out.println(name.get(1));

        // ArrayList name2 = (ArrayList)name.clone();
        // name2.add(0,"Munal");

        // Collections.sort(name2);

        // System.out.println(name2);

        // name.clear();
        // System.out.println(name);
        // System.out.println(name.isEmpty());
    }
}
