import java.util.Collections;

/**
 * Created by Lenovo on 22.05.2016.
 */
public class hello {
    public static void numeric(){
        int i = 123;
        int a = i%10;
        int b = (i/10)%10;
        int c = (i/100)%10;
        System.out.println("Answer(numeric): "+(a+b+c));
    }
    public static void round(double a){
        if ((a-(int)a)<0.5){
            System.out.println("Answer(round): "+(int)a);
        }else System.out.println("Answer(round): "+(int)a+1);

    }
    public static void numericNatural(int i) {
        int b = i/10;
        int a = i%10;
        System.out.println("Answer(numericNatural): "+(a+b));
    }
    public static void division(int i, int j){

    }
    public static void MRand(){
        double a = Math.random()*6-3;
        System.out.println("Random number from [-3;3) = "+a);
    }
    public static void Mrand2(int i){
        double a = Math.random()*2*i-i;
        System.out.println("Random number from ["+(-i)+";"+i+"] = "+a);
    }
    public static void cosinus() {
        int a = 40, b = 45, c = 60;
        double aRad = a*Math.PI/180;
        double bRad = b*Math.PI/180;
        double cRad = c*Math.PI/180;
        System.out.println("cos("+a+")="+Math.cos(aRad));
        System.out.println("cos("+b+")="+Math.cos(bRad));
        System.out.println("cos("+c+")="+Math.cos(cRad));
    }
    public static void triangle( double a, double  b){
        System.out.println( "Triangle square =  "+(a*b/2));
        double c = Math.sqrt(a*a+b*b);
        double p=a+b+c;
        System.out.println( "Triangle perimeter =  "+p);
    }
    public static void main(String args[]) {
        numeric();
        round(10.5);
        numericNatural(54);
        MRand();
        Mrand2(5);
        cosinus();
        triangle(5,3);
        System.out.println("-----------------Hello from the other side!-----------------");
    }




}