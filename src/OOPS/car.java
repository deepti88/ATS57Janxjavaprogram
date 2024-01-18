package src.OOPS;

public class car implements Engine,Break{
    void start(){
        System.out.println("car started");
        startengine();
        Break();

    };

    @Override
    public void startengine() {
        System.out.println("Engine started");
    }

    @Override
    public void Break() {
        System.out.println("Break is working fine");
    }
}
