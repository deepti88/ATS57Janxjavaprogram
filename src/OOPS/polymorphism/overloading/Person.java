package src.OOPS.polymorphism.overloading;

public class Person {
    void speak(String a)
    {
        System.out.println("Call a String");
    }
    void speak(int x)
    {
        System.out.println("Call a Int");
    }
    void speak(double u)
    {
        System.out.println("Call a double");
    }
}
