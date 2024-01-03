package Looping;
import java.util.*;
public class Count {
    public static void main(String[] args) {
        int count=0,num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num=sc.nextInt();

        while (num>0) {
            num = num/10;
            count++;
        }
        System.out.println("The count of number is "+count);
    }
}
