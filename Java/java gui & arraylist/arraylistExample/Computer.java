package arraylistExample;

public class Computer {
    private String brandname;
    private double rate;
    private String color;

    public Computer(String brandname, double rate, String color) {
        this.brandname = brandname;
        this.rate = rate;
        this.color = color;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public double getRate() {
        return rate;
    }


    public void setRate(double rate) {
        this.rate = rate;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return brandname + ", " + rate + ", " + color;
    }
}
