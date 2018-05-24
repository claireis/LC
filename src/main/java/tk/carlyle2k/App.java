package tk.carlyle2k;

import java.util.*;

public class App {

    /**
     * 791. Custom Sort String
     */
    public String customSortString(String S, String T) {
        int[] counts = new int[26];

        for (char c : T.toCharArray()) {
            counts[c - 'a']++;
        }

        char[] ret = new char[T.length()];
        int index = 0;
        for (char c : S.toCharArray()) {
            while (counts[c - 'a']-- > 0) {
                ret[index++] = c;
            }
        }

        for (int i = 0; i < counts.length; i++) {
            while (counts[i]-- > 0) {
                ret[index++] = (char) ('a' + i);
            }
        }

        return new String(ret);
    }

    /**
     * 338. Counting Bits
     */
    public int[] countBits(int num) {
        int[] ret = new int[num + 1];

        for (int i = 0; i <= num; i++) {
            ret[i] = countBitsHelper(i);
        }

        return ret;
    }

    private static int countBitsHelper(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1)
                count++;

            num >>= 1;
        }

        return count;
    }

    /**
     * 821. Shortest Distance to a Character
     */
    public int[] shortestToChar(String S, char C) {
        char[] chars = S.toCharArray();
        int[] ret = new int[chars.length];

        int index = -1;
        Deque<Integer> queue = new ArrayDeque<>();
        for (char i : chars) {
            index++;
            if (i == C) {
                queue.add(index);
            }
        }

        int cur = queue.poll();
        int next = queue.isEmpty() ? Integer.MAX_VALUE : queue.poll();
        for (int i = 0; i < chars.length; i++) {
            ret[i] = Math.min(Math.abs(cur - i), Math.abs(next - i));

            if (i == next && !queue.isEmpty()) {
                cur = next;
                next = queue.poll();
            }
        }

        return ret;
    }

    /**
     * 419. Battleships in a Board
     */
    public int countBattleships(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    if (i > 0 && board[i - 1][j] == 'X') {
                        continue;
                    }

                    if (j > 0 && board[i][j - 1] == 'X') {
                        continue;
                    }

                    count++;
                }
            }
        }

        return count;
    }

    /**
     * 537. Complex Number Multiplication
     */
    public String complexNumberMultiply(String a, String b) {
        String[] first = a.split("\\+");
        String[] second = b.split("\\+");

        String firstImage = first[1].substring(0, first[1].length() - 1);
        String secondImage = second[1].substring(0, second[1].length() - 1);
        int real = Integer.parseInt(first[0]) * Integer.parseInt(second[0]) -
                Integer.parseInt(firstImage) * Integer.parseInt(secondImage);

        int image = Integer.parseInt(firstImage) * Integer.parseInt(second[0]) +
                Integer.parseInt(secondImage) * Integer.parseInt(first[0]);

        return real + "+" + image + "i";
    }

    /**
     * 797. All Paths From Source to Target
     */
    // public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    //     List<List<Integer>> res = new ArrayList<>();
    //     List<Integer> path = new ArrayList<>();
    //
    //     path.add(0);
    //     dfsSearch(graph, 0, res, path);
    //
    //     return res;
    // }
    //
    // private void dfsSearch(int[][] graph, int node, List<List<Integer>> res, List<Integer> path) {
    //     if (node == graph.length - 1) {
    //         res.add(new ArrayList<>(path));
    //         return;
    //     }
    //
    //     for (int nextNode : graph[node]) {
    //         path.add(nextNode);
    //         dfsSearch(graph, nextNode, res, path);
    //         path.remove(path.size() - 1);
    //     }
    // }

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
