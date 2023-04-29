public class LargestSumSubArray {
    public static void main(String[] args) {
        int[] array = { -2, -3, 4, -1, -2, 1, 5, -3 };

        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            int sum  = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if(sum > result){
                    result = sum;
                }
            }
        }
        System.out.println(result);
    }
}