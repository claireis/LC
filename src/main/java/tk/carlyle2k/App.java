package tk.carlyle2k;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * 763. Partition Labels
     */
    public List<Integer> partitionLabels(String S) {
        char[] chars = S.toCharArray();

        Map<Character, Integer> position = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
                position.put(chars[i], i);
        }

        List<Integer> partition = new ArrayList<>();
        int pos = -1;
        int index = -1;
        for (int i = 0; i < chars.length; i++) {
            if (position.get(chars[i]) > index) {
                index = position.get(chars[i]);
            }

            if (i == index || i == chars.length - 1) {
                partition.add(i - pos);
                pos = index;
                index = -1;
            }
        }

        return partition;
    }
}
