package OOPS.inheritances;

public class Child extends Parent{
    int age = 2;

    Child(int age){
        this.age = age;
    }
    Child(){
        this.age= 3;
    }


    public void hello(){
        System.out.println("hello from child");
    }

    public void hiChild(){
        System.out.println("hi from child");
    }
}
