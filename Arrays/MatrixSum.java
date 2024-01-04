package Arrays;

import java.util.Scanner;

public class MatrixSum {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.print("Enter the m and n : ");
        m=sc.nextInt();
        n=sc.nextInt();
        int arr[][] = new int[m][n];
        int arr1[][] = new int[m][n];
        int arr2[][] = new int[m][n];

        System.out.println("Enter the matrix A : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
                
            }
        }

        System.out.println("Enter the matrix B : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();
                
            }
        }

        System.out.println("The Sum of Matrixs is ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            
               arr2[i][j]=arr[i][j] + arr1[i][j];
               System.out.print(arr2[i][j]+"\t"); 
            }
            System.out.println();
        }
    }
}
