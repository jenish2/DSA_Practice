import java.util.Scanner;

class ReverseArray {

    public int[] reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            array[start] = array[start] + array[end];
            array[end] = array[start] - array[end];
            array[start] = array[start] - array[end];
            start++;
            end--;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Length of Integer Array");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Enter Integer of Array");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        int[] reversedArray = new ReverseArray().reverseArray(array);
        System.out.println("Reversed Array");
        for (int i : reversedArray) {
            System.out.print(i + "    ");
        }
    }
}