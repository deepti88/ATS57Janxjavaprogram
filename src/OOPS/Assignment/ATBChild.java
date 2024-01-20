package src.OOPS.Assignment;

public class ATBChild extends ATB {

    public ATBChild(String name, int age, int rollNo, long phone) {
        super(name, age, rollNo, phone);
    }

    public String toString() {
        return "ATB Child{" +
                "name='" + super.getName() + '\'' +
                ", rollNumber='" + super.getRollNo() + '\'' +
                ", phoneNumber='" + super.getPhone("+91") + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
}
