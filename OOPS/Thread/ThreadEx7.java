package OOPS.Thread;

class MyThreadEx6 extends Thread{
    public void run(){
        
        try{
            for(int i=1;i<=10;i++){
                System.out.println("Child thread");
                Thread.sleep(1000);
            }
            
        }
        catch(InterruptedException e){
            System.out.println("InterruptedException is occur");
        }
    }
}


public class ThreadEx7 {
    public static void main(String[] args) throws InterruptedException {
        MyThreadEx6 s = new MyThreadEx6();
        s.start();
        s.interrupt();
        for(int i=1;i<=10;i++){
            System.out.println("Main thread");
            Thread.sleep(1000);
        }
    }
}
