package Main;
import java.util.*;

public class k31 {
    public static void main(String[] args) {
        int[] a = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
        System.out.println("Original Array: " + Arrays.toString(a));
        for(int i=0;i<a.length;i++)
        {
        for (int j = i + 1; j < a.length; j++) {
            if (a[j] % 2 != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
        }
        }

        System.out.println("New Array: " + Arrays.toString(a));
    }
}
