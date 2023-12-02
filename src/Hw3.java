import java.util.Arrays;
public class Hw3 {

        public static void main(String[] args) {
            int[][] array3 = new int[][]{{1, 4, 56}, {23, 42, 24}, {2, 423, 2}};
            RotatePicMatrix(array3);
        }

        public static int RepeatsFinder(int[] array1) {
            for(int i = 0; i < array1.length; ++i) {
                int index = Math.abs(array1[i]) - 1;
                if (index < 0 || index >= array1.length) {
                    throw new IllegalArgumentException("Incorrect index" + index);
                }

                if (array1[index] < 0) {
                    return index + 1;
                }

                array1[index] = -array1[index];
            }

            throw new IllegalArgumentException("Ya need elements in range [1, array1.length-1]");
        }

        public static int RemoveNoUniques(int[] array2) {
            int j = 1;

            for(int i = 1; i < array2.length; ++i) {
                if (array2[i] != array2[i - 1]) {
                    array2[j] = array2[i];
                    ++j;
                }
            }

            return j;
        }

        public static void RotatePicMatrix(int[][] matrix) {
            int[] array3 = new int[matrix.length * matrix[0].length];
            int pointer1 = 0;
            int[][] var3 = matrix;
            int i = matrix.length;

            for(int var5 = 0; var5 < i; ++var5) {
                int[] ints = var3[var5];

                for(int j = 0; j < matrix[0].length; ++j) {
                    array3[pointer1] = ints[j];
                    ++pointer1;
                }
            }

            pointer1 = 0;

            for(int j = matrix[0].length - 1; j >= 0; --j) {
                for(i = 0; i < matrix.length; ++i) {
                    matrix[i][j] = array3[pointer1];
                    ++pointer1;
                }
            }

            System.out.print(Arrays.deepToString(matrix));
        }

}
