package se.lexicon.model;

public class Drink implements Product {
    
    // Fields
    private final int id;
    private String drinkName;
    private final boolean temperature;
    private double price;
    
    // Constructors
    public Drink(int id, String drinkName, boolean temperature, double price) {
        this.id = id;
        this.drinkName = drinkName;
        this.temperature = temperature;
        this.price = price;
    }
    
    // Methods
    @Override
    public String examine() {
        return " id: " + id + ", Drink: " + drinkName + ". ";
    }
    
    @Override
    public String use() {
        String description = "You hold the " + drinkName + ". It feels ";
        description += temperature ? "...WARM, urgh!!!" : "cold... Mmmm, nice!";
        return description;
    }
    
    // Getters & Setters
    @Override
    public String getProductName() {
        return drinkName;
    }
    
    @Override
    public void setProductName(String productName) {
        this.drinkName = productName;
    }
    
    @Override
    public int getID() {
        return id;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public boolean isTemperature() {
        return temperature;
    }
}
