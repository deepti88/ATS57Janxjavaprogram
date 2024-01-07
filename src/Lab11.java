package src;

public class Lab11 {
    public static void main(String[] args) {

        //Logical operator---!==-not equal to
       // OR operator---||--if both true-true
       // if one true=true----if both false-thn false


        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(false||false);

        //And &&
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);

        int a=15;
        boolean b = !(a>11&&a<10);
        System.out.println(b);

        int a1=15;
        boolean b1 = !(a1>12||a1<10);
        System.out.println(b1);
    }
    }


