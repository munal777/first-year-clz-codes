package arraylistExample;

import java.util.ArrayList;
import java.util.Iterator;

public class BusCompany {
    private ArrayList<Bus> sagarmathaYatayat;

    public BusCompany()
    {
        this.sagarmathaYatayat = new ArrayList<>();
    }

    public void addBus(Bus buses)
    {
        sagarmathaYatayat.add(buses);
    }

    public void removeBus(Bus bus)
    {
        Iterator<Bus> remove = sagarmathaYatayat.iterator();
        while (remove.hasNext()) {
            Bus del = remove.next();
            if(del.equals(bus))
            {
                remove.remove();
                System.out.println(del);
            }
        }
    }

    public void display()
    {
        for(Bus list: sagarmathaYatayat)
        {
            System.out.println(list);
            System.out.println();
        }
    }

    public void busFare()
    {
        for(Bus list: sagarmathaYatayat)
        {
            if(list.getRate() > 600)
            {
                System.out.println(list);
            }
        }
    }

    public void busColor()
    {
        Iterator<Bus> list = sagarmathaYatayat.iterator();
        while (list.hasNext()) {
            Bus color = list.next();
            if(color.getColor().equals("Red") || color.getColor().equals("Blue"))
            {
                System.out.println("\n"+color);
            }
        }
    }

    public static void main(String[] args) {
        BusCompany sagarmathayatayat = new BusCompany();

        Bus bus1 = new Bus("np010", "Green", "Birtamode", "Munal", true, 600);
        Bus bus2 = new Bus("np190", "Green", "Dharan", "Namita", true, 400);
        Bus bus3 = new Bus("np920", "Red", "Itahari", "Numa", false, 800);
        Bus bus4 = new Bus("np777", "Yellow", "Biratnagar", "Debit", true, 450);
        Bus bus5 = new Bus("np572", "Blue", "Birtamode", "Bob", false, 100);

        sagarmathayatayat.addBus(bus1);
        sagarmathayatayat.addBus(bus2);
        sagarmathayatayat.addBus(bus3);
        sagarmathayatayat.addBus(bus4);
        sagarmathayatayat.addBus(bus5);
        

        System.out.println("\nThe list of bus having fare more then 600: ");
        sagarmathayatayat.busFare();

        System.out.println("\nBus having Blue or Red color: ");
        sagarmathayatayat.busColor();

        System.out.println("\nBus with having these details has been removed: ");
        sagarmathayatayat.removeBus(bus3);

        System.out.println("\nThe descrption of all buses: ");
        sagarmathayatayat.display();
    }
}
