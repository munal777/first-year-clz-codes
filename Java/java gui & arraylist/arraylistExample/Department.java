package arraylistExample;


public class Department {
    private String name;
    private String phone;
    private int numOfEmp;
    
    public Department(String name, String phone, int numOfEmp) {
        this.name = name;
        this.phone = phone;
        this.numOfEmp = numOfEmp;
    }
    public String getName() {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getNumOfEmp() {
        return numOfEmp;
    }
    public void setNumOfEmp(int numOfEmp) {
        this.numOfEmp = numOfEmp;
    }

    @Override
    public String toString() {
        return "Department Name: "+getName()+"\n"+"Department Num: "+getPhone()+
        "\n"+"Num of Employee: "+getNumOfEmp();
    }  
}
