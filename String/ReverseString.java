package String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();
        for(int i=str.length()-1;i>=0 ;--i){
            System.out.print(str.charAt(i)+"\t");
        }

    }
}
