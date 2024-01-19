package src.OOPS.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab40 {
    public static void main(String[] args) {
        String name=null;
        name.trim();//if JVM knows abt it,checked exception

        try {
            FileInputStream f=new FileInputStream("deep.txt");
        } catch (FileNotFoundException e) {

        }

    }
}
