package src.OOPS;

import java.util.Scanner;

public class Lab27 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name");
        String name=sc.next();


        Person1 nm=new Person1("Preeti");
        nm.printdetails();


        Person1 nm1=new Person1("Neeti");
        System.out.println("Enter second name");
        nm1.printdetails();

    }
}
