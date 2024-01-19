package src.OOPS.Exception;

public class Lab38 {
    public static void main(String[] args) {
        try {
            String name = null;
            name.trim();
            System.out.println("I m Deepti");
        } catch (Exception e) {
            System.out.println("You are trying trim name null");
        }
        System.out.println("I am End");
    }
}
//Exception--That occur disturbance while executing the program
//Error cannot handle--memory is full
//Error will be always on top line in exception--latest one we have to look during debug