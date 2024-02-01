package src.OOPS.collectionframework;

import java.util.Comparator;

public class CollageStudent implements Comparable<CollageStudent> {
    public CollageStudent(String name, Integer age, Integer id, long phonenumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }


    @Override
    public String toString() {
        return "CollageStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", phonenumber=" + phonenumber +
                '}';
    }

    private String name;
    private Integer age;
    private Integer id;

    private long phonenumber;

    @Override
    public int compareTo(CollageStudent o) {
        return 0;
    }

//    @Override
//    public int compareTo(CollageStudent o) {
//        return Integer.compare(this.id,o.id);
//    }
}

    class dsc implements Comparator<CollageStudent>{

        @Override
        public int compare(CollageStudent o1, CollageStudent o2) {
            return Integer.compare(o2.getId(), o1.getId());        }
    }
//
//
//
//    class sortbyage implements Comparator<CollageStudent>{
//
//        @Override
//        public int compare(CollageStudent o1, CollageStudent o2) {
//            return Integer.compare(o2.getAge(), o1.getAge());       }
//    }
//


//@Override
//public int compareTo(CollageStudent o) {
//    return String
//}

//{
//        @Override
//        public int compare(CollageStudent o1, CollageStudent o2) {
//            return Integer.compare(o2.getAge(), o1.getAge());
//          }
//        }
class sortbynameDSC implements Comparator<CollageStudent>
{



        @Override
        public int compare(CollageStudent o1, CollageStudent o2)
        {
            return o1.getName().compareTo(o2.getName());        }
    }





