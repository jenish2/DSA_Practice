package Arrays.KthMaxOrMinArray;

import java.util.Arrays;

public class KthMinUsingSort {
    public static void main(String[] args) {
        int[] array = { 12, 14, 15, 1, 11 };
        int k = 2;

        Arrays.sort(array);

        System.out.println("Kth Smallest Element In Array :- "+ array[k - 1]);
    }
}
