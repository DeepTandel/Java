package Arrays;

public class LargeSmallSum {
    public static void main(String[] args) {
        int arr[] = {3,2,1,7,4};
        int max=arr[0];
        int min=arr[0];
        
        for(int i =1;i<5;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        
        for(int i =1;i<5;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }

        int total = min + max;
        System.out.println(total);
        
    }
}
