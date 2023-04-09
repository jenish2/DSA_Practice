package Arrays.MaxMinInArray;

public class MaxMinElement {

    static class MaxMinPair {
        int max;
        int min;
    }

    static MaxMinPair getMaxMinPair(int[] array) {
        MaxMinPair pair = new MaxMinPair();
        pair.max = array[0];
        pair.min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < pair.min) {
                pair.min = array[i];
            }
            if (array[i] > pair.max) {
                pair.max = array[i];
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 34, 123, 4, 3, 13 };
        MaxMinPair pair = getMaxMinPair(array);
        System.out.println("Maximum element " + pair.max);
        System.out.println("Minimum element " + pair.min);
    }
}
