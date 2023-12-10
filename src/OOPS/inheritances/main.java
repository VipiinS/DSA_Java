package OOPS.inheritances;

public class main {
    public static void main(String[] args) {
        Child child = new Child();
        child.hello();
        System.out.println(child.age);
        child.hiChild();
        Parent parent = new Parent();
        System.out.println(parent.age);
        parent.hello();


        Parent PC = new Child();
        PC.hello();
        System.out.println(PC.age);
    }
}
