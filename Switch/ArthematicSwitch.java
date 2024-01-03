import java.util.Scanner;
public class ArthematicSwitch {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        while(true){
                double n1,n2;
        System.out.print("Enter the two number : ");
        n1=sc.nextInt();
        n2=sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.println("Enter the choice : ");
        int n = sc.nextInt();

        switch(n){
            case 1:
            System.out.println("Addition of two number : "+(n1+n2));
            break;
            case 2:
            System.out.println("Subtraction of two number : "+(n1-n2));
            break;
            case 3:
            System.out.println("Multiplication of two number : "+(n1*n2));
            break;
            case 4:
            System.out.println("Division of two number : "+(double)(n1/n2));
            break;
            case 5:
            System.exit(0);
            break;
            default:
            System.out.println("Invalid choice.");
        }
        }

    }
}
