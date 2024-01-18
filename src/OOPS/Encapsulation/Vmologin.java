package src.OOPS.Encapsulation;

public class Vmologin {
    private String Username;
    private String Password;

    public Vmologin(String username, String password)
    {
        this.Username = username;
        this.Password = password;
    }
    Boolean isLoggedIn(String username, String Password) {
        if (this.Username.toLowerCase().equals(username) && this.Password.toLowerCase().equals(Password)) {
            System.out.println("LoggedIN");
            return true;
        } else {
            System.out.println("Loginfailed");
            return false;
        }
    }
    }


