package basicsLearning;

import java.util.ArrayList;


public class arrayList 
{
    //single dimensional arraylist

    // public static void main(String[] args)
    // {
    //     ArrayList<String> student = new ArrayList<String>();
    //     student.add("Munal");
    //     student.add("Namita");
    //     student.add("Numa");

    //     student.set(0, "Himali");
    //     student.remove(0);
    //     student.clear();

    //     for(int i = 0; i<student.size(); i++)
    //     {
    //         System.out.println(student.get(i));
    //     }
    // }

    //double dimensional arraylist

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> collageStudent = new ArrayList<>();

        ArrayList<String> student = new ArrayList<String>();
        student.add("Munal");
        student.add("Namita");
        student.add("Numa");
         
        ArrayList<String> hobbies = new ArrayList<String>();
        hobbies.add("Dance");
        hobbies.add("football");

        collageStudent.add(student);
        collageStudent.add(hobbies);

        System.out.println(collageStudent.get(1).get(1));
    }

}
