import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String []args){
        float cel,fah;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature in celsius:");
        cel=sc.nextFloat();
        fah=(cel*9/5)+32;
        System.out.println("Temperature in Fahrenheit:"+fah);
        sc.close();
    
}
}