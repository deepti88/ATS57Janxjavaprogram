package src.OOPS.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab46sort {
    public static void main(String[] args) {
        List <Integer> mymarks=new ArrayList<>();
        mymarks.add(27);
        mymarks.add(25);
        mymarks.add(29);
        mymarks.add(30);
        Collections.sort(mymarks);
        System.out.println(mymarks);

    }}

