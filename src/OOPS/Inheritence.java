package src.OOPS;

public class Inheritence extends Programming {
    String newFeature;

    Inheritence(String newFeature) {
        this.newFeature = newFeature;

    }

    @Override
    void patientdetail() {
        System.out.println("Feature is " + this.newFeature);
        System.out.println("Feature is " + this.author);
    }
}