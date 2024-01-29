package src.OOPS.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Lab44 {
    public static void main(String[] args) {
        List<String> courselist=new ArrayList<>();
        courselist.add("Python");
        courselist.add("Selenium");
        courselist.add("ATB5x");
        courselist.add("MTB");
        List numberlist=new ArrayList<>();
        numberlist.add(100);
        numberlist.add(200);
        numberlist.add(109);
        numberlist.add(300);
        numberlist.add(400);
        courselist.addAll(numberlist);

        System.out.println(courselist);
        Iterator iterator= courselist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
