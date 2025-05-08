package problemSolving.problem4;



import java.util.ArrayList;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Munal","Np01", 50000.0);
        Employee employee2 = new Employee("Numa","Np02", 45000.0);
        Employee employee3 = new Employee("Namita","Np03", 30000.0);
        Employee employee4 = new Employee("Himali","Np04", 50000.0);
        Employee employee5 = new Employee("Suresh","Np05", 12000.0);
        Employee employee6 = new Employee("Debit","Np06", 15000.0);

        ArrayList<Employee> staffInfo = new ArrayList<>();
        staffInfo.add(employee1);
        staffInfo.add(employee2);
        staffInfo.add(employee3);
        staffInfo.add(employee4);
        staffInfo.add(employee5);
        staffInfo.add(employee6);

        String targetId = "Np03";
        Iterator<Employee> riseSalary = staffInfo.iterator();
        while (riseSalary.hasNext()) {
            Employee emp = riseSalary.next();
            if(emp.getId().equals(targetId))
            {
                emp.setSalary(emp.getSalary() * 1.10);
                break;
            }
        }

        Iterator<Employee> removeEmp = staffInfo.iterator();
        while (removeEmp.hasNext()) {
            Employee delete = removeEmp.next();

            if(delete.getId().equals("Np04"))
            {
                removeEmp.remove();
            }
        }

        Iterator<Employee> employees = staffInfo.iterator();
        while (employees.hasNext()) {
            System.out.println(employees.next());
            System.out.println();
        }

        for(Employee i: staffInfo)
        {
            System.out.println(i);
        }
    }
}
