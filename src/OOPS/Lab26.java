package src.OOPS;

public class Lab26 {
    public static void main(String[] args) {
        Bank sbi=new Bank();
        sbi.printdetails();

        Bank hdfc =new Bank("hdfc");
        hdfc.printdetails();

        Bank icici =new Bank("icici");
        icici.printdetails();

        Bank Yesbank =new Bank("Yesbank");
        Yesbank.printdetails();

    }
}
