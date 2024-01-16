package src.OOPS.Encapsulation;

public class Vmologin {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    public String getPassword() {
        return Password;
    }

    private String Password;

    public Vmologin(String username, String password) {
        this.username = username;
        this.Password = password;
    }

    Boolean isLoggedIn(String username, String Password) {
        if (this.username.toLowerCase().equals(username) && this.Password.toLowerCase().equals(Password)) {
            System.out.println("LoggedIN");
            return true;
        } else {
            System.out.println("Loginfailed");
            return false;
        }

    }
}
