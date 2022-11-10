package se.lexicon.model;

public class Fruit implements Product {
    
    //Fields
    private final int id;
    private String fruitType;
    private final String color;
    private double price;
    
    // Constructors
    public Fruit(int id, String fruitType, String color, double price) {
        this.id = id;
        this.fruitType = fruitType;
        this.color = color;
        this.price = price;
    }
    
    // Methods
    @Override
    public String examine() {
        return " id: " + id + ", Fruit: " + color + fruitType;
    }
    
    @Override
    public String use() {
        return "The " + fruitType + " tastes refreshing!";
    }
    
    @Override
    public String getProductName() {
        return fruitType;
    }
    
    @Override
    public void setProductName(String productName) {
        this.fruitType = productName;
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
