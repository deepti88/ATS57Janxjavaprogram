package src.OOPS.Wrapper;

public class Lab36 {
    public static void main(String[] args) {
        int a=10;
        Integer a2=Integer.valueOf(a);
        //wrapper class is used in collection framework
        //Collection framework  ->class->hate primitive data
        Character ch='a';
        //unboxing character obj to primitives conservatipn
        char a3=ch;
        System.out.println(Integer.valueOf("55"));
        System.out.println(Integer.max(45,87));
        System.out.println(Integer.min(65,90));
        System.out.println(Integer.MAX_VALUE);
        double d=9.8;
        String st2=String.valueOf(d);
       // Integer i=Integer.valueOf(d);
    }
}
