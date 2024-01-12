package src.OOPS;

public class Bank {
    String bankname;
    int balance;
    Bank(){
        bankname="Sbi";
        balance=10000;
        System.out.println("I am default");

    }
    Bank(String bname){
this.bankname=bname;
        System.out.println("Parmeterize");
    }
    void printdetails(){
        System.out.println(bankname);
        System.out.println(balance);
    }


}
