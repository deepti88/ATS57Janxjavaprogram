package src.OOPS.Staticmethod;

public class Staticdemo {
    static {
        System.out.println("SIB");
    }
    {
        System.out.println("IIB");
    }
    int a=10;
    static int b =20;

    void m1(){
        System.out.println(b);
        System.out.println(a);
        System.out.println("m1");

    }
    static void m2(){
        System.out.println(b);
    }
}
