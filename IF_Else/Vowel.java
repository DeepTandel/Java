import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        ch= sc.next().charAt(0);

        if((ch=='a')||(ch=='u')||(ch=='i')||(ch=='e')||(ch=='o')){
            System.out.println("The character is vowel.");
        }
        else{
            System.out.println("The charcter is not vowel.");
        }
    }
}
