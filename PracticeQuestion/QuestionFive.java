package PracticeQuestion;

import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = new String();
        System.out.println("Enter the string : ");
        str = sc.next();
        char ch[] = str.toCharArray();
        int len=0;
        int out=0;
        for(int i=0;i<ch.length;i++){
            len++;
        }
        if(len==32){
            for(int i =0;i<len;i++){
                if(str.charAt(i)=='1'){
                    out++;
                }
            }
        }else{
            System.out.println("Wrong input");
        }

        System.out.println("No of 1's : "+out);
    }
}
