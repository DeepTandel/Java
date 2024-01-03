package Looping;
import java.util.*;
public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count=0,rem;
        double m=0.0;
        System.out.print("Enter the number : ");
        num=sc.nextInt();
        int temp=num;
        int tem=num;

        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);
        
        while(temp>0){
            rem=temp%10;
            m=m+(Math.pow(rem,count));
            temp=temp/10;
        }
        
        System.out.println(m);

        if(m==tem){
            System.out.println("Amstrong Number");
        }
        else{
            System.out.println("Not Amstrong");
        }
    }
}
