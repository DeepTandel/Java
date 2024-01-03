package Looping;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int num;
        int fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num=sc.nextInt();

        while(num>0){
            
            fact = fact * num;
            num--;
        }
        System.out.println("Factorial of the Number is "+fact);
    }
}
