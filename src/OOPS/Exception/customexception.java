package src.OOPS.Exception;

public class customexception extends Exception{
    customexception(String msg){
        super(msg);
        System.out.println("if i got thi,custom exception");
    }

}
