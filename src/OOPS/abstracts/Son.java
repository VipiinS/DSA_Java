package OOPS.abstracts;

public class Son extends Parent {
    int number = 1;
    int age = 133;

    @Override
    String career() {
        return "son's career";
    }

    @Override
    String partner() {
        return"son's partner";
    }
}
