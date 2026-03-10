import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int num, temp, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();
        temp = num;

        while(num != 0){
            int r = num % 10;
            sum = sum + (r * r * r);
            num = num / 10;
        }

        if(sum == temp){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}