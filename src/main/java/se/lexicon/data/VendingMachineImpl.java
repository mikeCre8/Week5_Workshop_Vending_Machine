package se.lexicon.data;

import se.lexicon.model.Product;

public class VendingMachineImpl implements VendingMachine {
    
    // Fields
    public static final int[] VALID_CURRENCIES = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
    private final Product[] products;
    public int depositPool;
    
    // Constructors
    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }
    
    // Methods
    @Override
    public void addCurrency(int amount) {
        for (int validCurrency : VALID_CURRENCIES) {
            if (validCurrency == amount) {
                depositPool += amount;
            }
        }
    }
    
    @Override
    public int getBalance() {
        return depositPool;
    }
    
    @Override
    public Product request(int id) {
        for (Product product : products) {
            if (product.getID() == id) {
                if (product.getPrice() <= depositPool) {
                    depositPool = (int) (depositPool - product.getPrice());
                    return product;
                } else {
                    throw new RuntimeException("Product " + product.getProductName() + " is too expensive for ye!");
                }
            }
        }
        throw new RuntimeException("Product id: " + id + " not found!");
    }
    
    @Override
    public int endSession() {
        int amount = depositPool;
        depositPool = 0;
        return amount;
    }
    
    @Override
    public String getDescription(int id) {
        String notFound = "Product id: " + id + " not found!";
        for (Product product : products) {
            if (product.getID() == id) {
                return product.examine().concat(" price: " + product.getPrice());
            }
        }
        return notFound;
    }
    
    @Override
    public String[] getProducts() {
        String[] productToString = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            productToString[i] = products[i].examine().concat(" price: " + products[i].getPrice());
        }
        return productToString;
    }
}
