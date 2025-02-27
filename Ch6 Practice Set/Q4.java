public class Q4 {
    public static void main(String[] args) {
        int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] mat2 = { { 1, 2, 3 }, { 4, 5, 6 } };

        int[][] result = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("Sum of the two matrices is  Matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

}
