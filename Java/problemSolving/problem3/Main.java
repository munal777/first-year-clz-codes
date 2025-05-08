package problemSolving.problem3;


import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("charger", 250.0, 5);
        Product product2 = new Product("Headphones", 500.0, 3);
        Product product3 = new Product("Mouse", 300.0, 8);
        Product product4 = new Product("Keyboard", 1000.0, 2);
        Product product5 = new Product("Monitor", 5000.0, 1);

        ArrayList<Product> item = new ArrayList<>();
        item.add(product1);
        item.add(product2);
        item.add(product3);
        item.add(product4);
        item.add(product5);

        for(Product product: item)
        {
            System.out.println(product);
            System.out.println();
        }

        System.out.println();
        System.out.println("Result after removing keyboard: ");
        Iterator<Product> it = item.iterator();
        while (it.hasNext())
        {
            Product items = it.next();
            if(items.getName().equals("Keyboard"))
            {
                it.remove();
            }
        }

        
        Iterator<Product> show = item.iterator();
        while(show.hasNext())
        {
            System.out.println(show.next()); 
            System.out.println();
        }

    }
}
