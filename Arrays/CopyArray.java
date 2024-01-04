package Arrays;

import java.util.*;

public class CopyArray {
    public static void main(String[] args) {
        int a1[] = new int[]{55,54,33,45,67,26};
        int a2[]= Arrays.copyOf(a1,6);

        System.out.println(Arrays.toString(a2));

        int a3[]=new int[10];
        System.arraycopy(a2, 0, a3, 3, 6);
        System.out.println(Arrays.toString(a3));
    }
}
