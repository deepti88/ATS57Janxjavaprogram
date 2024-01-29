package src.OOPS.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab48 {
    public static void main(String[] args) {
        Student s1=new Student("cysa",8);
        Student s2=new Student("pysa",7);
        Student s3=new Student("kysa",2);
        Student s4=new Student("nysa",1);
        List <Student>student=new ArrayList<>();
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);
        //Collections.sort(student);
       // Collections.sort(student,new SortbyidAsc());
        //Collections.sort(student,new SortbyidAsc());
        Collections.sort(student,new SortbynameAsc());

        System.out.println(student);

    }
}
