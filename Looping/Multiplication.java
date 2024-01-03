package Looping;
import java.util.*;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,mul=1,rem;
        System.out.print("Enter the Number : ");
        num = sc.nextInt();

        while(num>0){
            rem = num%10;
            mul = mul * rem;
            num=num/10;
            

        }
        System.out.print("Multiplication of Number : "+mul);
    }
}
