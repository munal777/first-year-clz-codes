package arraylistExample;

import java.util.ArrayList;
import java.util.Iterator;

public class MainDep {

    public static void main(String[] args) {
        Department department1 = new Department("Student Service", "9876543210", 5);
        Department department2 = new Department("BBA Academics", "9876543211", 8);
        Department department3 = new Department("IT Academics", "9876543212", 20);

        ArrayList<Department> list = new ArrayList<>();
        list.add(department1);
        list.add(department2);
        list.add(department3);

        for(Department print: list)
        {
            System.out.println(print);
            System.out.println();
        }

        for(Department i: list)
        {
            if(i.getName().equals("BBA Academics"))
            {
                i.setNumOfEmp(10);
                break;
            }
        }

        //to remove the student service from the list by using iterator mathod
        Iterator<Department> toRemove = list.iterator();
        while (toRemove.hasNext()) {
            Department it = toRemove.next();
            if(it.getName().equals("Student Service"))
            {
                toRemove.remove();
            }
        }


        //Adding new department in the arraylist and using add index to add it before it academics
        Department department4 = new Department("It Support","9876543213",4);
        for(Department drtList: list)
        {
            if(drtList.getName().equals("IT Academics"))
            {
                int index = list.indexOf(drtList);
                list.add(index,department4);
                break;
            }
        }
       
        //changing Bba academics to vairab technology
        for(Department changeName: list)
        {
            if(changeName.getName().equals("BBA Academics"))
            {
                changeName.setName("Vairab Technology");
                break;
            }
            
        }

        //replacing IT academics info with IT support with foreach loop
        for(Department i: list)
        {
            if(i.getName().equals("IT Academics"))
            {
                i.setPhone(department4.getPhone());
                i.setNumOfEmp(department4.getNumOfEmp());
                break;
            }
        }
        
        System.out.println("Final output: ");
        for(Department i: list)
        {
            System.out.println(i);
            System.out.println();
        }
    }
}
