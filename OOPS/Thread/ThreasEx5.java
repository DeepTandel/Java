package OOPS.Thread;

public class ThreasEx5 {
    public static void main(String[] args) {
        try{
            for(int i=1;i<10;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){

        }
    }
}
