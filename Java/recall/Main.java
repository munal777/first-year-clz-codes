package recall;

class Name {

    private String name;
    private String surname;
    static int age= 18;
    String address = "Dharan";

    Name(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    void FullName() {
        System.out.println(this.name+" "+this.surname);
    }

    static void firtName(String fullname) {
        System.out.println(fullname);
    }

}


class SubName extends Name {
    public SubName(String name, String surname) {
        super(name, surname);
    }

    void random() {
        System.out.println(super.address);
        System.out.println(address);
        setName("munal");
        System.out.println(getName());
    }
}


public class Main {
    public static void main(String[] args) {
        Name obj = new Name("raga", "sir");
        SubName subobj = new SubName("kera", "khau");
        
        obj.FullName();
        subobj.FullName();
        subobj.random();

        Name.firtName("munal poudel");
        System.out.println(Name.age);
    }
    
}