package Searching_Sorting.BinarySearch;

public class BinarySearchRecursion {
    public static int search(int[] array, int element, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (array[mid] == element) {
            return mid;
        } else if (array[mid] > element) {
            return search(array, element, start, mid - 1);
        } else {
            return search(array, element, mid + 1, end);
        }

    }

    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(search(array, 4, 0, array.length - 1));
    }
}
