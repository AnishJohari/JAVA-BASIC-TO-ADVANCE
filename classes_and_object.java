public class classes_and_object {
    public static class Car{
        String model, color;
        short year;
        void startEngine(){
            System.out.println("The " + color + " " + model + " is starting.");
        }
        void displayInfo(){
            System.out.println("COLOR : "+color);
            System.out.println("MODEL : "+model);
            System.out.println("YEAR : "+year);
        }

    }
    public static void main(String args[]){
        Car car1 = new Car();
        car1.color = "Red";
        car1.model = "Honda City";
        car1.year = 2022;

        // Creating second object
        Car car2 = new Car();
        car2.color = "Blue";
        car2.model = "Toyota Corolla";
        car2.year = 2021;

        // Using methods
        car1.startEngine();
        car1.displayInfo();

        System.out.println();

        car2.startEngine();
        car2.displayInfo();
    }
}

