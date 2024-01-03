package Looping;
import java.util.*;
public class SumSeries {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        double sum=1;
        System.out.print("Enter the number : ");
        n=sc.nextInt();

        for(double i=1;i<=n;i++){
            sum=sum+(Math.pow(n,i)/i);
        }
        System.out.println("The sum of the "+n+" is "+sum);

    }
}
