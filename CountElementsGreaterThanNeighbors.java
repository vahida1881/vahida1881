import java.util.Scanner;

public class CountElementsGreaterThanNeighbors {
     public static void main(String[] args){
         int count=0;
        int A[]=new int[5];
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the elements:");
        for(int i=0;i<A.length;i++){
             A[i]= obj.nextInt();
        }
        for(int i=1;i<A.length-1;i++){
            if(A[i]>A[i-1] && A[i]>A[i+1]){
                count++;
            }
        }
        System.out.println("Elements greater than both neighbors:"+count);
        obj.close();
     }
}
