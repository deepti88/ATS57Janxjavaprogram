package src.OOPS;

public class Programming {
    String author;
    int version;
    Programming(){
        System.out.println("DC");
    }
Programming(String author,int version){
        this.author=author;
        this.version=version;

    }
void patientdetail(){
    System.out.println("programming--->"+this.author+this.version);
}
}
