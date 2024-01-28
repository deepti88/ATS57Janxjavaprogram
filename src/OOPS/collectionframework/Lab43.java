package src.OOPS.collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lab43 {
    public static void main(String[] args) {
        List mylist=new ArrayList<>();
        mylist.add("Ahaan");
        mylist.add("Rhaan");
        mylist.add(123);
        mylist.add(true);
        System.out.println(mylist);
        mylist.set(1,"aanvi");
        System.out.println(mylist);
        mylist.remove(true);
        System.out.println(mylist);
        for(Object o:mylist) {
            System.out.println(o);
        }
        }

    }

