import java.util.Scanner;

public class matrixaddition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for first Matrix:");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int matrix1[][] = new int[rows][cols];
        int matrix2[][] = new int[rows][cols];
        int sum[][] = new int[rows][cols];

        System.out.println("Enter the elements in first Matrix:");
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
            matrix1[i][j] = sc.nextInt();
        
        System.out.println("Enter the elements in second Matrix:");
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
            matrix2[i][j] = sc.nextInt();
        
        
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
           sum[i][j]=matrix1[i][j]+matrix2[i][j]; 
        
        System.out.println("\nThe Sum of two Matrices is : ");
           for(int i=0;i<rows;i++)
           {
               for(int j=0;j<cols;j++)
                    System.out.print(sum[i][j] + " ");
               System.out.println();
           }
           sc.close();
    }
}

    

