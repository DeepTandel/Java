package OOPS.Banking_System;

import java.util.Scanner;

class BankAccount{
    String accNo;
    String mobileNO;
    String name;
    static int balance;
    Scanner sc = new Scanner(System.in);
    int amt;

    public BankAccount(){
        balance = 1000;
    }

    public void inputData(){
        System.out.print("Enter the name : ");
        name = sc.next();
        System.out.print("Enter the account number : ");
        accNo = sc.next();
        System.out.print("Enter the mobile number  : ");
        mobileNO = sc.next();
       
    }

    public void display(){
        System.out.println("\nName : "+name);
        System.out.println("Account Number : "+accNo);
        System.out.println("Mobile number : "+mobileNO);
        System.out.println("Balance : "+balance);
    }

    public void deposit(){
        System.out.println("Enter the amount : ");
        amt = sc.nextInt();
        amt = amt + balance;
        System.out.println("Updated amount : "+amt);
        balance = amt;
    }

    public void withdraw(){
        System.out.println("Enter the amount : ");
        amt = sc.nextInt();
        amt = balance - amt;
        System.out.println("Updated amount : "+amt);
        balance = amt;
    }


}


class SavingAccount extends BankAccount{
    public void withdraw(){
        
        System.out.println("Enter the amount : ");
        amt = sc.nextInt();
       
        if(balance-amt<1000){
            System.out.println("Minimum amout should be 1000");
        }else{
            balance = balance-amt;
            System.out.println("Amount : "+balance);
        }
        balance = amt;
    }
}


class BankingSystem {
    public static void main(String[] args) {
        SavingAccount obj = new SavingAccount();
        BankAccount obj1 = new BankAccount();
        while(true){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("\n1. Enter the inputData\n2. Display\n3. Deposit\n4. Withdraw\n5. SavingAccount Withdraw\n6. Exit.\nEnter the choice : ");
            int ch=sc1.nextInt();
            switch(ch){
                case 1:obj1.inputData();
                break;
                case 2:obj1.display();
                break;
                case 3:obj1.deposit();
                break;
                case 4:obj1.withdraw();
                break;
                case 5:obj.withdraw();
                break;
                case 6 :System.exit(0);
                break;
                default:System.out.println("Invalid choice.");
                break;
                
            }
        }


    }
}
