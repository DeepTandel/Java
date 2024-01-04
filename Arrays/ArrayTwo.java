package Arrays;

import java.util.*;

public class ArrayTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
    
        

        for(int i=0;i<5;i++){
            System.out.print("Enter the element "+i+" : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    

}
