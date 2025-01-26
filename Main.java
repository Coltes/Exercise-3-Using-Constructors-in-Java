public class Main {
    public static void main(String[] args) {

        // Create a Car object using the no-argument constructor
        Car car1 = new Car();
        System.out.println("Details of car created using no-argument constructor:");
        car1.displayDetails();

        // Modify attributes using setters
        car1.setMake("Subaru");
        car1.setModel("WRX");
        System.out.println("Updated details of car1 after using setters:");
        car1.displayDetails();

        // Create a Car object using the parameterized constructor
        Car car2 = new Car("BMW", "M4");
        System.out.println("Details of car2 created using parameterized constructor:");
        car2.displayDetails();
    }
}