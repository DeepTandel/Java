package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;

        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Enter the element "+i+" : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0,j=arr.length-1; i<arr.length; i++,j--){
            System.out.print(arr[j]+"\t");
        }
        
    }
}
