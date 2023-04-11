package Arrays.KthMaxOrMinArray;

import java.util.Collections;
import java.util.PriorityQueue;;

public class KthMinUsingHeap {
    public static void main(String[] args) {
        int[] array = { 12, 2, 9, 14, 15, 3, 24, 11 };
        int k = 3;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            maxHeap.add(array[i]);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        System.out.println("Kth Min element :- " + maxHeap.poll());
    }
}
