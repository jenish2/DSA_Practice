package Arrays.SubArray.PrintAllSubArray;

public class SubArray {
    public static void main(String[] args) {
        int[] array = { 1, -2, 3, 8, -5, 3 };

        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                for(int k= i ;k<=j;k++) {
                    System.out.print(array[k]+"    ");
                }
                System.out.println();
            }
        }
       
    }


}