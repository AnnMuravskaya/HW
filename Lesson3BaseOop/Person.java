package Lesson3BaseOop;

/**
 * Created by Lenovo on 27.05.2016.
 */
public abstract class Person {
    public String name;
    protected String male;
    protected double weight;
    protected double tall;


    public double callories(double morn, double din, double sup) {
        double callories = morn * 0.2 + din * 0.3 + sup * 0.5;
     return  callories ;}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }
}
