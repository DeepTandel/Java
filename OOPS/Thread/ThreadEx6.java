package OOPS.Thread;

class MyThreadEx6 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Child thread");
        }
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException is){
        }
    }
}


public class ThreadEx6 {
    public static void main(String[] args) throws InterruptedException {
        MyThreadEx6 s = new MyThreadEx6();
        s.start();
        s.join();
        for(int i=1;i<=100;i++){
            System.out.println("Main thread");
        }
    }
}
