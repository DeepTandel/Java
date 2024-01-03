package Looping;
import java.util.*;
public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {100, 80, 90, 50};
        int num=4;
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+"\t");
        }

        System.out.println("");
            for(int j=num;j<=num;j--){
                if(arr[j-1]>arr[j]){
                    System.out.print(1+"\t");
                }
                else{
                    System.out.print(2+"\t");
                }
            }


            
        
    }    
}
