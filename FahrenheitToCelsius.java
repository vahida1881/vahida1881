import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String []args){
        float cel,fah;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit:");
        fah=sc.nextFloat();
        cel=(fah-32)*5/9;
        System.out.println("Temperature in Celsius:"+cel);
        sc.close();
    }
}