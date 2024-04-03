import java.util.Scanner;

public class matrixsymmetric  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for first Matrix:");
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int matrix[][] = new int[rows][cols];

        System.out.println("\nEnter elements of  Matrix : ");
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
            matrix[i][j] = sc.nextInt();
        boolean  isSymmetric=true;
        if(rows != cols){
           isSymmetric = false;
        }
        else{
        for(int i=1;i<rows;i++){
            for(int j=0;j<i;j++){
                if(matrix[i][j]!=matrix[j][i]){
                    isSymmetric=false;
                    break;
                }
            }
        }
        }
    
        if (isSymmetric == true){
            System.out.println("The given matrix is symmetric.");
        }
        else{
            System.out.println("The given matrix is not symmetric.");
        }
        sc.close();
        
    }
}