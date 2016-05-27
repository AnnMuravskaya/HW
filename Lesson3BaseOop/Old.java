package Lesson3BaseOop;

import java.util.Set;

/**
 * Created by Lenovo on 27.05.2016.
 */
public class Old extends Person implements IPerson {
    @Override
    public double getAge(int date) {
        return 2016-date;
    }

    public double pension(double coef){
        double pension =1500*coef ;
    return pension;}


    public String toString(){
        return "Pension is "+pension(1.3)+" per month and the age is "+ getAge(1932)+" years";
    }


    @Override
    public String getFavouriteMeal() {//QUESTIOOON!
        return "milk, "+"apples, "+"tomatoes";
    }

    @Override
    public String country(String county) {
        return county;
    }

    public static void main(String [] args){
        Old old = new Old();
        old.setMale("woman");
        old.setName("Zilda");
        old.setWeight(70.3);
        old.setTall(1.58);
        System.out.println("This old "+old.getMale()+" is called "+old.getName()+" which lives in "+old.country("Germany"));
        System.out.println(old.getName()+"'s favourite meal are: "+old.getFavouriteMeal());
        System.out.println(old.getName()+"'s callories per day are "+old.callories(1500,1700,1000));
        System.out.println(old.toString());

    }
}
