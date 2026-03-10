import java.util.Scanner;
public class SumOfEvenDigits{
    public static void main(String []args){
        int num,temp,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        num=sc.nextInt();
        while(num!=0){
            temp=num%10;
            if(temp%2==0){
                sum=sum+temp;
            }
            num=num/10;
        }
        System.out.println("Sum:"+sum);
    sc.close();
    }
}