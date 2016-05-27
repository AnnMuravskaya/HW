package Lesson3BaseOop;

/**
 * Created by Lenovo on 28.05.2016.
 */
public class Adult extends Person implements IPerson {
    @Override
    public double getAge(int date) {
        return 2016 - date;
    }

    @Override
    public String getFavouriteMeal() {
        return "pizza, "+"coffee, "+"COFFE!!!";
    }

    @Override
    public String country(String county) {
        return county;
    }

    public double salary(int houres, double tip){
        double sal = (houres*16.5) + tip;
        return sal;
    }
    public String toString(){
        return "Sallary is "+ salary(150,120.5)+" per month";
    }

    public static void main (String [] args){
        Adult adult = new Adult();
        adult.setName("Mr. Verhivko");
        adult.setMale("man");
        adult.setWeight(100.5);
        adult.setTall(1.82);
        System.out.println("Tsis "+adult.male+" is called "+adult.name);
        System.out.println(adult.name+" is "+ adult.getAge(1985)+" years old and lives in "+adult.country("Ukraine"));
        System.out.println(adult.getName()+"'s favourite meal are: "+adult.getFavouriteMeal());
        System.out.println(adult.toString());
    }

}
