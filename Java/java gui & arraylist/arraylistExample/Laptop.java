package arraylistExample;

import java.util.ArrayList;
import java.util.Iterator;

public class Laptop {
    private ArrayList<Computer> computers;

    public Laptop() {
        this.computers = new ArrayList<>();
    }

    //creating addcomputer method to add new computers
    public void addComputer(Computer computer)
    {
        computers.add(computer);
    }

    //method to remove a computer by index number with message
    public void removeComputer(int index)
    {
        if( index >= 0 && index < computers.size())
        {
            Computer com = computers.get(index);
            computers.remove(index);
            System.out.println("Computer with having details: "+ com + " is been removed.");
        }
        else
        {
            System.out.println("Invild index !!");
        }
    }

    //method to book a computer
    public void bookComputer(int index)
    {
        if( index >= 0 && index < computers.size())
        {
            Computer com = computers.get(index);
            System.out.println(com);
        }
        else
        {
            System.out.println("Invild index !!");
        }
    }

    // display method to display all the description
    public void display()
    {
        if(computers.isEmpty())
        {
            System.out.println("There is no computer");
        }
        else
        {
            Iterator<Computer> list = computers.iterator();
            while (list.hasNext()) {
                System.out.println(list.next());
            }
        }
    }

    // creating method to display the type of computer price above 85000
    public void comPriceAbove()
    {
        for(Computer list: computers)
        {
            if(list.getRate() > 85000)
            {
                System.out.println(list);
            }
        }
    }

    //method to display the computer color having silver or white
    public void  computerColor()
    {
    Iterator<Computer> color = computers.iterator();
    while (color.hasNext()) {
        Computer com = color.next();
        if(com.getColor().equals("Silver") || com.getColor().equals("White"))
        {
            System.out.println(com);
        }
    }
    }

    //method to display the laptop having color black and price below 85000
    public void searchComputer()
    {
        for(Computer src: computers)
        {
            if(src.getColor().equals("Black") && src.getRate() < 85000)
            {
                System.out.println(src);
            }
        }
    }
    public static void main(String[] args) {
        Computer com1 = new Computer("Asus",50000,"Gray");
        Computer com2 = new Computer("Apple",120000,"Silver");
        Computer com3 = new Computer("Dell",90000,"White");
        Computer com4 = new Computer("HP",82000,"Black");
        
        Laptop laptop = new Laptop();

        laptop.addComputer(com1);
        laptop.addComputer(com2);
        laptop.addComputer(com3);
        laptop.addComputer(com4);

        System.out.println("The computer to be removed: ");
        laptop.removeComputer(0);

        System.out.println("\nThe list of Laptop: ");
        laptop.display();

        System.out.println("\nThe detils of booked laptop: ");
        laptop.bookComputer(2);

        System.out.println("\nThe price of laptop which is above 85000: ");
        laptop.comPriceAbove();

        System.out.println("\nThe list of laptop having color silver & red: ");
        laptop.computerColor();

        System.out.println("\nThe list of laptop which color is black and price below 85000: ");
        laptop.searchComputer();
    }
}
