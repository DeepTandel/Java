package Arrays;

public class Duplicate {
    public static void main(String[] args) {
        String[] strArray = {"Ashish", "Deep", "Rahul", "Adarsh","Deep"};
        for(int i=0;i<strArray.length-1;i++){
            for(int  j=1+i;j<strArray.length;j++ ){
                if((strArray[i].equals(strArray[j]))&&(i!=j)){
                    System.out.println("Duplication String : "+strArray[j]);
                }
            }
        }
    }
}
