import java.util.*;

public class Array1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n= sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+ n+" integer values: ");
        for(int i=0;i< n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The array is: ");
        for(int i=0;i< n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}