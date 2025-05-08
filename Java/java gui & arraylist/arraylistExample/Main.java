package arraylistExample;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Aayush", "9875726282","L1C10");
        Student student2 = new Student("Nikesh", "9864726282","L1C12");
        Student student3 = new Student("Munal", "9875627282","L1C11");

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        
        for(Student list: studentList)
        {
            if(list.getName().equals("Nikesh"))
            {
                studentList.remove(list);
                break;
            }
        }

        Student student4 = new Student("Aavaya", "9875627282","L1C11");

        for(Student list: studentList)
        {
            if(list.getName().equals("Aayush"))
            {
                int index = studentList.indexOf(list);
                studentList.add(index,student4);
                break;
            }
        }

        for(Student list: studentList)
        {
            if(list.getName().equals("Munal"))
            {
                list.setGroup("L1N2");
            }
        }

        for(Student list: studentList)
        {
            if(list.getName().equals("Aayush"))
            {
                list.setName("Ayush");
            }
        }

        for(Student list: studentList)
        {
            // System.out.println("Name: "+list.getName());
            // System.out.println("Group: "+list.getGroup());
            // System.out.println("Phone: "+list.getPhone());

            System.out.println(list);
            System.out.println();
        }
    

    }
}
