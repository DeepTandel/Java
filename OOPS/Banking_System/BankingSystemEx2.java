package OOPS.Banking_System;
import java.util.*;

interface RBI{
    int mins=4;
    int minc=2;
    void calculateInterest();
}

abstract class BankAccountEx1
{
	Scanner sc=new Scanner(System.in);
	static double amount;
    static double balance,balance1;
	static int mobile,accountNumber;
	static String name;
	abstract void deposit();
	
	abstract void withdraw();

    BankAccountEx1(){
        balance=1000.0;
        balance1=1000.0;
    }
	
	public void inputCustData()
	{
		System.out.println("Enter Account Number :");
		accountNumber=sc.nextInt();
		System.out.println("Enter Name :");
		name=sc.next();
		System.out.println("Enter Mobile number :");
		mobile=sc.nextInt();
	}
	public void showCustData()
	{
        System.out.println("<------------Details-------------->");
		System.out.println("Account Number :"+ accountNumber);
		System.out.println("Name :"+ name);
		System.out.println("Mobile Number :"+ mobile);
		System.out.println("Balance for Current Account:"+balance1);
		System.out.println("Balance for Savings account:"+balance);
        System.out.println("-------------------------------------");

	}
}




class SavingsAccountEx1 extends BankAccountEx1 implements RBI
{
	public void deposit()
	{
		System.out.println("Enter amount");
		amount=sc.nextInt();
		balance=balance+amount;
}
	public void withdraw()
	{
		System.out.println("Enter amount :");
		amount=sc.nextInt();
        if(balance-amount<1000)
		{
			System.out.println("Minimum account balance should be 1000");
		}
		else 
		{
			System.out.println("Withdrawal is possible");
			balance=balance-amount;	
		}
		balance=balance-amount;
	}

    public void calculateInterest(){
        double interest = balance * 0.04;
        System.out.println("Interest : "+interest);
        balance = balance - interest;
    }
}
class CurrentAccountEx1 extends SavingsAccountEx1 implements RBI
{
	public void deposit()
	{
		System.out.println("Enter amount");
		amount=sc.nextInt();
		balance1=balance1+amount;
}
	public void withdraw()
	{
		System.out.println("Enter amount :");
		amount=sc.nextInt();
        if(balance-amount<1000)
		{
			System.out.println("Minimum account balance should be 1000");
		}
		else {
		
			System.out.println("Withdrawal is possible");
			balance=balance-amount;	
		}
		balance1=balance1-amount;
	}

    public void calculateInterest(){
        double interest = balance * 0.02;
        System.out.println("Interest : "+interest);
        balance1 = balance1 - interest;
    }

}

class BankingSystemEx2 extends CurrentAccountEx1
{
	public static void main(String args[])
	{
		while(true)
		{
			{
				CurrentAccountEx1 C=new CurrentAccountEx1();
				SavingsAccountEx1 S= new SavingsAccountEx1();
				Scanner sc1=new Scanner(System.in);
				System.out.println("1. Input Data ");
				System.out.println("2. Show info ");
				System.out.println("3. Deposit amount on savings account ");
				System.out.println("4. Withdraw money from savings account ");
                System.out.println("5. Interest");
				System.out.println("6. Deposit money on current account");
				System.out.println("7. Withdraw money from current account");
                System.out.println("8. Interest");

				System.out.println("9.Exit ");
				int choice=sc1.nextInt();
				switch(choice)
				{
				case 1: S.inputCustData();
					    break;
			    case 2: S.showCustData();
					    break;
                case 3: S.deposit();
					    break;
                case 4: S.withdraw();
					    break;
                case 5 : S.calculateInterest();
                        break;
				case 6: C.deposit();
						break;
                case 7: C.withdraw();
					    break;
                case 8: C.calculateInterest();
                        break;
                case 9:System.exit(0);
                        break;
			    default: System.exit(0);
					    break;
		    
		    

				}

			}
		}
	}
		}