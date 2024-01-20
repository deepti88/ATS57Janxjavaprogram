package src.OOPS.Assignment;

public class ATB {

    private String name;
    private int rollNo;
    private long phone;
    private int age;


    public ATB(String name, int age, int rollNo, long phone) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public long getPhone() {
        return phone;
    }

    public String getPhone(String countryCode) {
        return countryCode +" "+ phone;
    }

    public String toString() {
        return "ATB{" +
                "name='" + name + '\'' +
                ", rollNumber='" + rollNo + '\'' +
                ", phoneNumber='" + phone + '\'' +
                ", age=" + age +
                '}';

    }
    }





//ATB class has a constructor to initialize its attributes, getter methods to access the values,
// and a toString method to provide a string representation of the object.
// The main method demonstrates the creation of an array of ATB students and
// prints their information using the toString method.