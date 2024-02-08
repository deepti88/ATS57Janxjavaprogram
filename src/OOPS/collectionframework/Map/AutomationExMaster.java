package src.OOPS.collectionframework.Map;

import java.util.*;

public class AutomationExMaster {
    public static void main(String[] args) {
        Student stu1=new Student(1,"deepti","deep@gm.com",8097979);
        Student stu2=new Student(2,"peepti","peep@gm.com",8797979);
        Student stu3=new Student(3,"reepti","reep@gm.com",8797079);
        Student stu4=new Student(4,"neepti","neep@gm.com",8707979);
        Student stu5=new Student(5,"teepti","teep@gm.com",8797970);
        List<Student> stud1=new ArrayList<>();//B1
        stud1.add(stu1);
        stud1.add(stu2);
        stud1.add(stu3);

        List<Student> stud2=new ArrayList<>();//B2
        stud2.add(stu4);
        stud2.add(stu5);

        Map<String,List<Student>>ttaATBbatches1= new TreeMap<String,List<Student>>();//key value pair
        ttaATBbatches1.put("ATB1",stud1);
       ttaATBbatches1.put("ATB2",stud2);


        Map<String,List<Student>>ttaMTBbatches2= new TreeMap<String,List<Student>>();//key value pair
        ttaMTBbatches2.put("MTB1",stud1);
        ttaMTBbatches2.put("MTB2",stud2);
        Map<String, Map<String,List<Student>>>ttaCourses=new HashMap<>();
        ttaCourses.put("Automation",ttaATBbatches1);
        ttaCourses.put("Manual",ttaMTBbatches2);

Set <String> coursename=ttaCourses.keySet();
        System.out.println(coursename);

        char ch='A';
        for(String cname:coursename){
            System.out.println(ch++ +"Courses:" +cname);
            Map<String,List<Student>>BatchMap=ttaCourses.get(cname);
            Set<String> batchids=BatchMap.keySet();

            for(String batchid:batchids){
                List<Student>studentList=BatchMap.get(batchid);
                System.out.println();
                System.out.println("Student of"+ batchid+"Total:"+studentList.size());
                System.out.println("===================");
                int count=1;
                for (Student mystu:studentList){
                    System.out.println(count++ +"."+mystu);
                }

            }
        }


        // System.out.println(stud);


    }
}
class Student{
    public Student(Integer id, String name, String email, long phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    private Integer id;
    private String name;
    private String email;
    private long phone;
    //these are instance variable within the class

    @Override
    public String toString() {
       // Integer a=10 ----local variable within the function
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }

    Student(){
        System.out.println("I m Default constructor");
    }

}