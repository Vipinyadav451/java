public class Vehicles {
    String Brand;
    String model;
    int year;

    public Vehicles(String Brand, String model, int year) {
        this.Brand = Brand;
        this.model = model;
        this.year = year;
    }

    void displayinfo() {
        System.out.println("Brand : " + Brand);
        System.out.println("model : " + model);
        System.out.println("year : " + year);
    }

    void startengine() {
        System.out.println("the vehicle engine is starting.......");
    }

    // derived class (child) inheritance from vehicle

    class Car extends Vehicles {
        int numberofdoors;// child spesfic attribute

        public Car(String Brand, String model, int year, int numberofdoors) {
            super(Brand, model, year);
            this.numberofdoors = numberofdoors;
        }

        void drive() {
            System.out.println(model + "car is driving");
        }

        void displayinfo() {
            super.displayinfo();
            System.out.println("Doors" + numberofdoors);
        }

        public static void main(String[] args) {
            Car c1 = new Car("toyota", "fortuner", 2022, 4);
            c1.startengine();
            c1.displayinfo();
            c1.drive();
        }
    }
}
