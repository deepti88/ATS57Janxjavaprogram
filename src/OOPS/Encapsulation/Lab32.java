package src.OOPS.Encapsulation;

public class Lab32 {
    public static void main(String[] args) {
     Vmologin VM=new Vmologin("admin","admin");
     //admin and admin username and password
        boolean check = VM.isLoggedIn("Usernm","admin11");
        //VM.Password="admin11";
       //// VM.setUsername("Usernm");
       // System.out.println(VM.getPassword());


      //  boolean check2= VM.isLoggedIn("Usernm","admin11");

      //  System.out.println(check2);

    }
}
