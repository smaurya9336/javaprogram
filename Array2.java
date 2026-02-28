import java.util.*;

public class Array2{
    public static void main(String[]  args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int col = scanner.nextInt();
        
        int[][] matrix = new int[row][col];
        
        System.out.println("\nEnter the elements of the array: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j]= scanner.nextInt();
            }
        }
        System.out.println("\nThe matrix is : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        
    }
}