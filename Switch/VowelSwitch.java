import java.util.Scanner;
public class VowelSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.print("Enter the character : ");
        ch=sc.next().charAt(0);

        switch(ch){
            case 'a':
            System.out.println("Vowel");
            break;
            case 'i':
            System.out.println("Vowel");
            break;
            case 'u':
            System.out.println("Vowel");
            break;
            case 'e':
            System.out.println("Vowel");
            break;
            case 's':
            System.out.println("Vowel");
            break;
            default:
            System.out.println("Not a vowel");
        }
    }
}
