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
        name[i]=sc.next();
        System.out.print("Enter the city :");
        city[i]=sc.next();
        System.out.print("Enter the mob :");
        mob[i]=sc.next();

        ++i;
    }
    public void showInfo(){
        System.out.println("rollno\tname\tcity\tmobileno.");
        System.out.println("-------------------------------------");
        for(int k=0;k<i;k++){
            System.out.println(rollno[k]+"\t"+name[k]+"\t"+city[k]+"\t"+mob[k]);
        }
        System.out.println();
    }
    public void updateData(){
        System.out.print("Enter Student Roll Number: ");
        int rno = sc.nextInt();
        for(int k=0; k<i; k++)
        {
            if(rno == rollno[k])
            {
                System.out.println("\n1. Name: "+name[k]+"\n"+"2. City: "+city[k]+"\n"+"3. Mobile Number: "+mob[k]);
                System.out.print("\nSelect a Choice: ");
                int cho = sc.nextInt();

                switch(cho)
                {
                    case 1:
                        System.out.print("\nEnter New Name: ");
                        String name1 = sc.next();
                        name[k]=name1; 
                        System.out.println("Record Updated........");
                        break;
                    case 2:
                        System.out.print("\nEnter New City: ");
                        String city1 = sc.next();
                        city[k]=city1; 
                        System.out.print("Record Updated........");
                        break;
                    case 3:
                        System.out.print("\nEnter New Mobile Number: ");
                        String mobno1 = sc.next();
                        mob[k]=mobno1; 
                        System.out.print("Record Updated........");
                        break;
                }
            }
        }
    }
    public void deleteData(){
        System.out.println("Enter student rollno : ");
        int rno=sc.nextInt();
        for(int k=0;k<i;i++){
            if(rno==rollno[k]){
                int temp=k;
                for(int j=k;j<i;j++){
                    rollno[j]=rollno[j+1];
                    System.out.println("Deleted .....");
                    i--;
                }
            }
        }
    }
}






class MyJava {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.err.println("1. Input Data\n2. Show Info\n3. Update Data\n4. Delete Data\n5.Exit\nEnter the choice : ");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:s.inputData();
                break;
                case 2:s.showInfo();
                break;
                case 3:s.updateData();
                break;
                case 4:s.deleteData();
                break;
                case 5:System.exit(0);
            }
            
        }
    }
}
