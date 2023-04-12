import java.util.ArrayList;

public class SpiralTraversal {
    public static ArrayList<Integer> spiralTraverseMatrix(int[][] matrix) {
        int col = matrix[0].length;
        int row = matrix.length;
        int right = col - 1;
        int left = 0;
        int top = 0;
        int bottom = row - 1;

        ArrayList<Integer> traversal = new ArrayList<Integer>();
        while (top <= bottom || left <= right) {
            for (int i = left; i <= right; i++) {
                traversal.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                traversal.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    traversal.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    traversal.add(matrix[i][left]);
                }
                left++;
            }
        }
        return traversal;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        System.out.println("Traversal Of Matrix In Spiral   :-  " + spiralTraverseMatrix(matrix));
    }
}