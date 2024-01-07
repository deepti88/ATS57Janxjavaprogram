package src;

import java.util.Scanner;

public class Lab_function1 {
    public static void main(String[] args) {
        //Return function
        //Argument or parameter
        // Name of the function
        //Access type
        //Return type
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();

        System.out.println("enter second  number");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a-->" + a);
        System.out.println("value of b-->" + b);
    }
}
