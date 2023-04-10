package Arrays.KthMaxOrMinArray;

public class SecondLargeElement {
    static int secondLargeElement(int[] array) {
        int result = -1;
        int largest = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[largest]) {
                largest = i;
                result = largest;
            } else if (array[i] != array[largest]) {
                if (result == -1 || array[result] < array[i]) {
                    result = i;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Second Large Element is :- " + secondLargeElement(array));
    }
}
