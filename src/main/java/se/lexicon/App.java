package se.lexicon;

import se.lexicon.data.VendingMachine;
import se.lexicon.data.VendingMachineImpl;
import se.lexicon.model.Drink;
import se.lexicon.model.Fruit;
import se.lexicon.model.Product;
import se.lexicon.model.Snacks;

public class App {
    
    public static void main(String[] args) {
        
        Product[] products = {
                new Drink(1, "Pepsi MAX", true, 15),
                new Drink(2, "Fanta", false, 5),
                new Fruit(3, "Apple", "Green", 10),
                new Fruit(4, "Banana", "Yellow with brown spots", 10),
                new Snacks(5, "10-pack of Mars", 100),
                new Snacks(6, "\"The GOLDEN Nougat\"", 500),
        };
        
        VendingMachine vendingMachine = new VendingMachineImpl(products);
        
        for (String item : vendingMachine.getProducts()) {
            System.out.println(item);
            System.out.println(" ");
        }
        
        vendingMachine.addCurrency(20);
        Product choice = vendingMachine.request(1);
        System.out.println(choice.use());
        System.out.println("Balance: " + vendingMachine.getBalance());
    }
}
