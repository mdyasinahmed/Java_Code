package pkg1;
/**
 *
 * @author YASIN
 */
public class Car {
    // Instance variables
    private String brand;
    private String model;
    private int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method
    public void startEngine() {
        System.out.println("The car's engine is starting.");
    }
}

