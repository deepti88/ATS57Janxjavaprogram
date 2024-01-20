package src.OOPS.Assignment;

public class RunnerClass {
    public static void main(String[] args) {
        ATB[] students = new ATB[10];//// Creating an array of ATB students
        // Adding students to the array
        students[0] = new ATB("John Doe", 23, 77, 123-456-7890);
        students[1] = new ATB("Jane Smith", 46, 90, 987-654-3210);
        students[2] = new ATB("Bob Johnson", 89, 70, 555-123-4567);
        students[3] = new ATB("Boby on", 89, 75, 555-923-4567);
        students[4] = new ATB("Tonny Joh", 9, 73, 555-123-0007);
        students[5] = new ATB("Prince Jon", 99, 79, 555-3-4567);
        students[6] = new ATB("Yen Json", 59, 59, 555-123-4567);
        students[7] = new ATB("Bonny Johnson", 80, 71, 985-123-4567);
        students[8] = new ATB("rob Joson", 39, 10, 555-123-4567);
        students[9] = new ATB("kobby ohnson", 19, 20, 655-123-4567);
        for (ATB student : students) {
            System.out.println(student.toString());
        }

        ATBChild[] childList = new ATBChild[1];
        childList[0] = new ATBChild("John Doe", 23, 77, 123-456-7890);

        for (ATB student : childList) {
            System.out.println(student.toString());
        }


    }
}
