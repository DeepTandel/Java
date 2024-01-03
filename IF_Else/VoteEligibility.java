import java.util.Scanner;
public class VoteEligibility {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        age=sc.nextInt();
        if(age>=18){
            System.out.println("Elgible for voting.");
        }
        else{
            System.out.println("Not Elgible for voting.");
        }
    }
}
