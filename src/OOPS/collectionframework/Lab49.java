package src.OOPS.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab49 {
    public static void main(String[] args) {
        CollageStudent student1=new CollageStudent("deepika",31,5,876568);
        CollageStudent student2=new CollageStudent("seepika",35,7,871568);

        CollageStudent student3=new CollageStudent("oeepika",20,23,8700568);

        CollageStudent student4=new CollageStudent("leepika",24,67,844568);

        CollageStudent student5=new CollageStudent("eepika",28,73,873468);
        //System.out.println(student2);

        List<CollageStudent>students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

       //Collections.sort(students,new sortbyidAsc());
      //  Collections.sort(students,new dsc());
        Collections.sort(students,new sortbynameDSC());


        System.out.println(students);



    }


}
