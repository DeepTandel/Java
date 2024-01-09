package OOPS.ThisFunction;

class ThisExOne {
    int a;
    int b;
    ThisExOne(int a,int b){
        this.a=a;
        this.b=b;
    }
    void display(){
        System.out.println("a = "+a+" b = "+b);
    }
    public static void main(String[] args) {
        ThisExOne obj = new ThisExOne(10, 20);
        obj.display();
    }
}
