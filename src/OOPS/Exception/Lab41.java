package src.OOPS.Exception;

public class Lab41 {
    public static void main(String[] args) throws customexception {
        Bank jpchase=new Bank("USD",8000);
        Bank hdfc=new Bank("INR",9000);
       // Bank icici=new Bank("INR",5000);
        System.out.println(hdfc.add(jpchase));//custom exxception

    }
}
