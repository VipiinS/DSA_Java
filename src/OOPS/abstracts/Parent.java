package OOPS.abstracts;

abstract class Parent {
    int age = 12;

    static int number = 9818181;

    //objects of abstract classes cant be created, therefore constructors cant be created for abstract classes
    abstract String career();// abstract classes need to be overridden by the child classes
    abstract String partner();

    static void hello() {

    }
}
