package src;

import java.util.Scanner;

public class Lab17 {
    public static void main(String[] args) {
        //print input for marks of five subjects
        Scanner sc =new Scanner(System.in);
        float marks[]=new float[5];
        System.out.println("Print marks of first subject");
       marks[0]= sc.nextFloat();
        System.out.println("Print marks of second subject");
        marks[1]= sc.nextFloat();
        System.out.println("Print marks of third subject");
        marks[2]= sc.nextFloat();
        System.out.println("Print marks of fourth subject");
        marks[3]= sc.nextFloat();
        System.out.println("Print marks of fifth  subject");
        marks[4]= sc.nextFloat();

        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]<60)
                System.out.println("you are fail" + marks[i]);
            System.out.println(marks[i]);
        }
        //if (marks<60){
      //      System.out.println("Fail");
      //  }else
     //       System.out.println("Pass");
    }
}
