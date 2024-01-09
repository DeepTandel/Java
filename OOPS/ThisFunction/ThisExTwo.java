package OOPS.ThisFunction;

class ThisExTwo {
    int a;
    int b;
    ThisExTwo(){
        this(10,20);
    }
    ThisExTwo(int x,int y){
        a=x;
        b=y;
    }
    void display(){
        System.out.println("a = "+a+" b = "+b);
    }
    public static void main(String[] args) {
        ThisExTwo obj = new ThisExTwo();
        ThisExOne obj1 = new ThisExOne(20, 40);
        obj.display();
        obj1.display();
    } 
}
