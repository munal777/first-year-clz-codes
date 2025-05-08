package workshop.week16;

public class Bus extends Vehicle{
    
    @Override
    public void wheel()
    {
        System.out.println("Bus must have 6 wheel");
    }
}

class MainBus
{
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.door();
        bus.wheel();
    }
}
