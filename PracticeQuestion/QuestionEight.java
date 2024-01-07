package PracticeQuestion;

import java.util.Arrays;

class QuestionEight {
    public static void main(String[] args) {
        int[] arr = {6,9,3,5,8};
        Arrays.sort(arr);
        int ans;
        System.out.println(Arrays.toString(arr));
        if(arr[0]+arr[1]<9){
            ans = arr[0] * arr[1];
            System.out.println(ans);
        }
        else{
            System.out.println(0);
        }
    }
}
