import java.util.Scanner;
public class AsciiNumbers {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        ch=sc.next().charAt(0);

        if(ch>=65 && ch<=90){
            System.out.println("UpperCase");
        }
        else if(ch>=97 && ch<=122){
            System.out.println("LowerCase");
        }
        else if(ch>=48 && ch<=57){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Case");
        }
    }
}
