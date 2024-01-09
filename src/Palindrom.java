package src;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a string,I will check  palindrom number");
        String user_input = Scanner.next();
        boolean result=ispalindrome(user_input);
        if(result){
            System.out.println("Palindrom");
        } else
        {System.out.println("not Palindrom");

        }
    }

    private static boolean ispalindrome(String userInput) {
        String original_str=userInput;
        StringBuilder sb=new StringBuilder(userInput);
        String reverse_string=sb.reverse().toString();


        return original_str.equalsIgnoreCase(reverse_string);
    }
}
