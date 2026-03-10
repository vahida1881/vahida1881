import java.util.Scanner;
public class CountDigitsInNumber{
    public static void main(String []args){
        int num,temp,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        num=sc.nextInt();
        while(num!=0){
            temp=num%10;
            count++;
            num=num/10;
        }
        System.out.println("Count:"+count);
        sc.close();
    }
}