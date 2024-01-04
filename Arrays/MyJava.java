package Arrays;

import java.util.Scanner;

class Student{

    int rollno[] = new int[10];
    String name[]=new String[10];
    String city[]=new String[10];
    String mob[]=new String[10];
    int i=0;
    Scanner sc = new Scanner(System.in);


    public void inputData(){
        System.out.print("Enter the roll no :");
        rollno[i]=sc.nextInt();
        System.out.print("Enter the name :");
        name[i]=sc.nextLine();
        System.out.print("Enter the city :");
        city[i]=sc.nextLine();
        System.out.print("Enter the mob :");
        mob[i]=sc.nextLine();

        ++i;
    }
    public void showInfo(){
        System.out.println("rollno\tname\tcity\tmobileno.");
        System.out.println("-------------------");
        for(int k=0;k<i;k++){
            
        }
    }
    public void updateData(){

    }
    public void deleteData(){

    }
}






class MyJava {
    
}
