package src.OOPS.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab45 {
    public static void main(String[] args) {
        List<String> ccourselist = new ArrayList<>();
        ccourselist.add("Python");
        ccourselist.add("Selenium");
        ccourselist.add("ATB5x");
        ccourselist.add("MTB");

        ListIterator lt = ccourselist.listIterator();
        while (lt.hasNext()) {
            System.out.println(lt.next());
        }
//dnt modify the item when using iterator--no delete no add

            ListIterator lt2 = ccourselist.listIterator(ccourselist.size());
            while (lt2.hasPrevious()) {
                System.out.println(lt2.previous());
            }
        }
    }
