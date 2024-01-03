import java.util.Scanner;
public class PostiveNegativeZero {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        num = sc.nextInt();

        if (num>0){
            System.out.println("Number is Positive");
        }
        else if(num<0){
            System.out.println("Number is Negative");
        }
        else if(num==0){
            System.out.println("Number is zero");
        }
    }
}