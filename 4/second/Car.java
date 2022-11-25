package second;
import java.awt.*;
public class Car
{
    private static final int base_year = 1800;
    private static final Color base_color = Color.BLACK;
    private String model;
    private String brand;
    private int year;
    private float price;
    private Color color;
    private int quantity;
    Car()
    {
        model = "";
        brand = "";
        year = base_year;
        price = 0f;
        color = base_color;
        quantity = 0;
    }
    Car(String model, String brand, int year, float price, Color color, int quantity)
    {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }
    public String getModel() {
        return model;
    }
    public String getBrand() {
        return brand;
    }
    public int getYear() {
        return year;
    }
    public float getPrice() {
        return price;
    }
    public Color getColor() {
        return color;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void delivery()
    {
        this.quantity += 1;
    }
    public void delivery(int quantity)
    {
        this.quantity += quantity;
    }
    public void sell()
    {
        this.quantity -= 1;
    }
    public void sell(int quantity)
    {
        this.quantity -= quantity;
    }
    public String toString()
    {
        return "Model: " + model + ", " +
            "Brand: " + brand + ", " +
            "Year: " + year + ", " +
            "Price: " + price + ", " +
            "Color: " + color.toString() + ", " +
            "Quantity: " + quantity;
    }
}