package Lesson3BaseOop;

/**
 * Created by Lenovo on 27.05.2016.
 */
public class Child extends Person implements IPerson{


    @Override
    public double getAge(int date) {
        return 2016 - date;
    }

    @Override
    public String getFavouriteMeal() {
        return "milk, "+"candies";
    }

    public String toString(){
        return getClass().getName()+"'s callories per day are "+ callories(2500,1300,800);
    }

    @Override
    public String country(String county) {
        return county;
    }

    public static void main (String [] args) {
        Child child = new Child();
        child.setName("Bobby");
        child.setMale("man");
        child.setWeight(45.2);
        child.setTall(.4);
        System.out.println("Tsis little "+child.male+" is called "+child.name);
        System.out.println(child.name+" is "+ child.getAge(2010)+" years old and lives in "+child.country("USA"));
        System.out.println(child.getName()+"'s favourite meal are: "+child.getFavouriteMeal());
        System.out.println(child.toString());
    }




}
