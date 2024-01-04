package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.print("Enter the m and n : ");
        m=sc.nextInt();
        n=sc.nextInt();
        int arr[][] = new int[m][n];

        System.out.println("Enter the matrix : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
                
            }
        }

        System.out.println("The matrix : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+"\t");
                
            }
            System.out.println();
        }



    }   
}
