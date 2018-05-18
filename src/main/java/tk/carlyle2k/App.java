package tk.carlyle2k;

public class App {

    /**
     * 832. Flipping an Image
     */
    public int[][] flipAndInvertImage(int[][] A) {
        int half = A.length / 2;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (j < half) {
                    int tmp = A[i][j];
                    A[i][j] = A[i][A.length - j - 1];
                    A[i][A.length - j - 1] = tmp;
                }

                A[i][j] = A[i][j] == 0 ? 1 : 0;
            }
        }

        return A;
    }
}
