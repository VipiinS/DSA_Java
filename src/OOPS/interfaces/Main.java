package OOPS.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
////        car.acc();
//        car.brake();
//        System.out.println(car.cost);// from class car

//        Engine car2 = new Car();
//        System.out.println(car2.price);// from interface Engine
//        car.brake();

//        Media carMedia = new Car();
//        carMedia.start();

        NiceCar car = new NiceCar(new ElectricEngine());
        car.start();

    }
}
