package OOPS;

class Reactangle {
    int length,breadth;
    public Reactangle(int l,int b){
        length = l;
        breadth = b;
    }
    int area(){
        int ans = length*breadth;
        return ans;
    }
}

class ReactangleOne{
    public static void main(String[] args) {
        Reactangle obj = new Reactangle(4,5);
        System.out.println("Area of rectangle : "+obj.area());
    }
}