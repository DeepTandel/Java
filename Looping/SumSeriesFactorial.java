package Looping;
import java.util.*;
public class SumSeriesFactorial {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        double sum=1;
        double fact=1;
        System.out.print("Enter the number : ");
        n=sc.nextInt();

        for(double i=1;i<=n;i++){
            fact = fact * i;
            
            sum=sum+(Math.pow(n,i)/fact);
        }
        System.out.println("The sum of the "+n+" is "+sum);

    }
}
