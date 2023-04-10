package Arrays.KthMaxOrMinArray;

public class SecondLargeElement {
    static int secondLargeElement(int[] array) {
        int result = -1;
        int largest = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[largest]) {
                result = largest;
                largest = i;
            } else if (array[i] != array[largest]) {
                if (result == -1 || array[result] < array[i]) {
                    result = i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = { 100, 10, 20, 30, 40, 50, 60, 70, 80, 90, 110 };
        System.out.println("Second Large Element is :- " + array[secondLargeElement(array)]);
    }
}
