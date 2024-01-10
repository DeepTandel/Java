package OOPS.Banking_System;

import java.util.Scanner;

class Employee{
    double salary;
    Employee(double sal){
        salary = sal;
    }

    void work(){
        System.out.println("Employee is working on ChatBot");
    }

    void getSalary(){
        System.out.println("Salary"+salary);
    }

}

class HrManager extends Employee{
    String empName,empId,city;
    Scanner sc = new Scanner(System.in);
    HrManager(){
        super(400000);
    }

    void work(){
       
    }


    void getEmployee(){
         System.out.print("Enter the name : ");
        empName = sc.next();
        System.out.print("Enter the account number : ");
        empId = sc.next();
        System.out.print("Enter the mobile number  : ");
        city = sc.next();
    }

    void showEmployee(){


    }

}


public class Office {
    
}
