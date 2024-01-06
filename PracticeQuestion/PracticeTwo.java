package PracticeQuestion;

import java.util.Scanner;

class PracticeTwo {
    static int a;
    void isGreaterThan(){
        int sum = 1;
        int store = 0;
        for(int i=0;i<a;++i){
            sum=sum*4;
            if(sum==a){
                System.out.println("True");
                break;
            }
            else{
                ++store;
            }
        }
        if(store == a){
            System.out.println("False");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter the Number : ");
        a =sc.nextInt();
        PracticeTwo obj = new PracticeTwo();
        obj.isGreaterThan();
    }
}
