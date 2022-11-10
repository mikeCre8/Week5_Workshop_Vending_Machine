package se.lexicon.model;

public class Snacks implements Product {
    
    // Fields
    private final int id;
    private double price;
    private String snackType;
    
    // Constructors
    public Snacks(int id, String snackType, double price) {
        this.id = id;
        this.price = price;
        this.snackType = snackType;
    }
    
    // Methods
    @Override
    public String examine() {
        return " id: " + id + ", Candy: " + snackType;
    }
    
    @Override
    public String use() {
        return "The " + snackType + "...is... AWSOME!";
    }
    
    @Override
    public String getProductName() {
        return snackType;
    }
    
    @Override
    public void setProductName(String productName) {
        this.snackType = productName;
    }
    
    @Override
    public int getID() {
        return id;
    }
    
    @Override
    public double getPrice() {
        return price;
    }
    
    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
