package src.OOPS.polymorphism.overridding;

public class RC {
    public static void main(String[] args) {
        dog d=new dog();
        d.bark();

        hound p=new hound();
        p.bark();
        dog f=new hound();//dynamic dispatch or runner time polymor
        f.bark();
     //   hound o=new dog();
           //     o.bark();

    }
}
