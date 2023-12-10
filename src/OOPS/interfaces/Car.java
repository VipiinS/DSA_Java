package OOPS.interfaces;

public class Car implements Brake,Engine,Media{

    int cost = 100000;
    @Override
    public void brake() {
        System.out.println("normal car brake");
    }

    @Override
    public void start() {
        System.out.println("normal engine car start");

    }

    @Override
    public void stop() {
        System.out.println("normal engine car stop");

    }

    @Override
    public void acc() {
        System.out.println("normal car acc");
    }


}
