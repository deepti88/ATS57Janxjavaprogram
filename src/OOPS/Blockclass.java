package src.OOPS;

import jdk.dynalink.beans.StaticClass;

import java.sql.SQLOutput;

public class Blockclass {
    {
        System.out.println("I am IIB");//instance intialize block
    }



Blockclass(){
        System.out.println("I am DC");

    }
    static {
        System.out.println("I am SIB");//Statice intialize block--Will run only once
    }


    }


