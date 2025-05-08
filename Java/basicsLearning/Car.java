package basicsLearning;


public class Car {
    private String carCompany;
    private String carName;
    private int carModel;

    public Car(String carCompany, String carName, int carModel)
    {
        this.carCompany = carCompany;
        this.carName = carName;
        this.carModel = carModel;
    }

    //creating constructor for java copy object
    public Car(Car x)
    {
        this.copy(x);
    }


    public String getCarCompany() {
        return carCompany;
    }



    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }



    public String getCarName() {
        return carName;
    }



    public void setCarName(String carName) {
        this.carName = carName;
    }



    public int getCarModel() {
        return carModel;
    }



    public void setCarModel(int carModel) {
        this.carModel = carModel;
    }

    //for java copy object
    public void copy(Car x)
    {
        this.setCarCompany(x.getCarCompany());
        this.setCarName(x.getCarName());
        this.setCarModel(x.getCarModel());
    }


    // public String toString()
    // {
    //     return carCompany +"\n"+ carName +"\n" + carModel ;
    // }
}
