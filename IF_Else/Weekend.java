import java.util.Scanner;
public class Weekend {
    public static void main(String[] args) {
        String ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day : ");
        ch= sc.next();

        if((ch.equals("Saturday"))||(ch.equals("Sunday"))){
            System.out.println("The Day is Weekend.");
        }
        else{
            System.out.println("The Day is not Weekend.");
        }
    }
}
