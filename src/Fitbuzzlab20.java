package src;

public class Fitbuzzlab20
        {
            public static void main(String[] args) {
                //print number rom 1-100
                //for mpy of 3 print number fizz i%3=0

                //for mpy of 5 print buzz i%5=0
                //for both print fizzbuzz i%3=0&&i%5
                //Both condition will always come first in any code

                for(int i=1;i<=100;i++)
                if(i%3==0&&i%5==0)
                {
                    System.out.println("Fizzbuzz");
                }
                else if(i%3==0)
                {
                    System.out.println("Fizz");
                }
                else if (i%5==0)
                {
                    System.out.println("buzz");
                }
                    else {
                    System.out.println(i);
                }


                System.out.println("EOP");
            }
}
