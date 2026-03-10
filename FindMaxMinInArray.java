import java.util.Scanner;
public class FindMaxMinInArray {
    public static void main(String[] args){
        int max,min;
        int A[]=new int[5];
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the elements:");
        for(int i=0;i<A.length;i++){
             A[i]= obj.nextInt();
        }
        max=A[0];
        min=A[0];
        for(int i=1;i<A.length;i++){
            if(max<A[i]){
                max=A[i];
            }
            if(min>A[i]){
                min=A[i];
            }
        }
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);
        obj.close();
    }}