package Arrays;

import java.util.Scanner;

public class SwapingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of the array : ");
        int n =sc.nextInt();
        int arr[] = new int[n];
        int temp;

        for(int i=0;i<n;i++){
            System.out.print("Enter the element "+i+" : ");
            arr[i]=sc.nextInt();
        }

        for(int i =0, j=arr.length-1;i<j;i++,j--){
            temp=arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
