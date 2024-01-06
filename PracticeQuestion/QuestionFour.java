package PracticeQuestion;

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        String temp = str;
        String str2 = new String();

        for(int i=str.length()-1;i>=0 ;--i){
            str2 = str + str.charAt(i);
        }

        if (str.equals(str2)){
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not Palindrome String");
        }
        
    }
}
