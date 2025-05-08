
public class Dog extends Animal {

    private String breed;
    private String vaccinationDate;

    public Dog(String petId, String name, String owner, String breed, String vaccinationDate) {
        super(petId, name, owner);
        this.breed = breed;
        this.vaccinationDate = vaccinationDate;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getVaccinationDate() {
        return vaccinationDate;
    }

    public void vaccinateDog(String vaccinationDate) {
        this.vaccinationDate = vaccinationDate;
    }

    public void display() {
        super.display();
        System.out.println("Breed is: " + getBreed());
        System.out.println("Vaccination date is: " + getVaccinationDate());
    }

    public void makeSound() {
        System.out.println("Bhow Bhow");
    }

}
