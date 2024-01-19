package src.OOPS.Exception;

public class Lab39 {
    public static void main(String[] args) {
        try {
            String sh=args[0];//---String--137 is string
            int x=Integer.parseInt(sh);//String to primitive--137 int
            int a=10/x;
            System.out.println(x);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("error");
        }
        System.out.println("End of program");
    }
}
