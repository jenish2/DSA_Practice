package BitManipulation.CountSetBit;

public class CountSetBit {
    static int countSetBit(int number) {
        int count = 0;
        while (number != 0) {
            number = number & (number - 1);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int number = 1512;
        System.out.println("count for set bit :- " + countSetBit(number));
    }
}
