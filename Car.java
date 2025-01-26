public class Car {

    // Attributes
    private String make;  // Car manufacturer
    private String model; // Car model

    // No-argument constructor
    public Car() {
        this.make = "Generic Make";
        this.model = "Generic Model";
    }

    // Parameterized constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // GETTERS
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    // SETTERS
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Display car details
    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
    }
}