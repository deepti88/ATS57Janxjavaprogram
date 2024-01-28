package src.OOPS.collectionframework;

import java.util.List;

public class Lab42 {
    public static void main(String[] args) {
        //not use in this way
        List fruits=List.of("orange","Apple","grapes","Mango","Anaar");
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.get(3));
        System.out.println(fruits.indexOf("orange"));
        System.out.println(fruits.isEmpty());
       //    System.out.println(fruits.get(7));
    }
}
