package Arrays.KthMaxOrMinArray;

public class SecondMinElement {
    static int secondMinElement(int[] array) {
        int result = -1;
        int minimum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minimum]) {
                result = minimum;
                minimum = i;
            } else if (array[i] > array[minimum]) {
                if (result == -1 || array[i] < array[result]) {
                    result = i;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 , 12 };
        System.out.println("Second Minimum Value in Array   :-  " + array[secondMinElement(array)]);
    }
}
