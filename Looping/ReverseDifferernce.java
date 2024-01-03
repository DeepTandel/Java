package Looping;

import java.util.Scanner;

public class ReverseDifferernce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the Number : ");
        n=sc.nextInt();
        int sum=n;
        System.out.print(n+"\t");
        for(int i=1;i<=n/2;i++){
             sum = sum - 2;
            System.out.print(sum+"\t");
        }
    }
}
