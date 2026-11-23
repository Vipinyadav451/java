public class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Brand : " + make);
        System.out.println("Model : " + model);
        System.out.println("year : " + year);
    }

    void drive() {
        System.out.println(model + "car is driving");
    }

    public static void main(String[] args) {
        // object creation
        Car c1 = new Car("toyota", "fortuner", 2022);
        c1.display();
        c1.drive();
    }
}