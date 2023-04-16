package Searching_Sorting.BinarySearch;

public class BinarySearch {
    public static int search(int[] array, int element) {
        int start = 0, index = -1;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] < element) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(search(array, 5));
    }
}
