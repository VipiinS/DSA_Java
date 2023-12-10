package OOPS.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("elec start");
    }

    @Override
    public void stop() {
        System.out.println("elec stop");

    }

    @Override
    public void acc() {
        System.out.println("elec acc");

    }
}
