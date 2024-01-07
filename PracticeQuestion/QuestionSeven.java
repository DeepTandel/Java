package PracticeQuestion;

import java.util.Scanner;

public class QuestionSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = new String();
        System.out.print("Enter the String 1 :");
        str1 = sc.next();
        String str2 = new String();
        System.out.print("Enter the String 2 :");
        str2 = sc.next();
        int count=0;
        int output;

        if(str1.length()==str2.length()){
            for(int i=1;i<str1.length();i++){
                if(str1.charAt(i)!=str2.charAt(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
        else if(str1.length()>str2.length()){
            System.out.println(str1.length()-str2.length());
        }
        else{
            System.out.println(str2.length()-str1.length());
        }
    }
}
