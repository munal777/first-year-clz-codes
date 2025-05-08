package assignment.week17;

public class Bus {
    private String numberPlate;
    private String color;
    private String route;
    private String customerName;
    private boolean availableStatus;
    private int rate;

    public Bus(String numberPlate, String color, String route, String customerName,
     boolean availableStatus, int rate) {
        this.numberPlate = numberPlate;
        this.color = color;
        this.route = route;
        this.customerName = customerName;
        this.availableStatus = availableStatus;
        this.rate = rate;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public boolean isAvailableStatus() {
        return availableStatus;
    }

    public void setAvailableStatus(boolean availableStatus) {
        this.availableStatus = availableStatus;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Number Plate: "+ numberPlate+"\nBus color: "+ color+"\nCustomer name: "+customerName+
        "\nAvailable Status: "+availableStatus+"\nBus fare rate: "+rate;
    }

}
