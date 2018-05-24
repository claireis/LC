package tk.carlyle2k;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class AppTest {
    private App app = new App();

    @Test
    public void flipAndInvertImage() {
        int[][] m1 = new int[][] {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        assertArrayEquals(new int[][]{{1, 0, 0},
                {0, 1, 0}, {1, 1, 1}}, app.flipAndInvertImage(m1));

        int[][] m2 = new int[][] {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };

        assertArrayEquals(new int[][] {{1,1,0,0},
                {0,1,1,0}, {0,0,0,1}, {1,0,1,0}}, app.flipAndInvertImage(m2));
    }

    @Test
    public void partitionLabels() {
        String input1 = "ababcbacadefegdehijhklij";
        List<Integer> output1 = Arrays.asList(9, 7, 8);
        assertEquals(output1, app.partitionLabels(input1));

        String input2 = "ababvcbfacadefdegvdeghijhaklijlmoiuuyionomoj";
        List<Integer> output2 = Arrays.asList(44);
        assertEquals(output2, app.partitionLabels(input2));

    }

    @Test
    public void complexNumberMultiply() {
        String input1 = "13+99i";
        String input2 = "14+99i";
        assertEquals("-9619+2673i", app.complexNumberMultiply(input1, input2));

        input1 = "1+-1i";
        input2 = "1+-1i";
        assertEquals("0+-2i", app.complexNumberMultiply(input1, input2));
    }

    @Test
    public void countBattleships() {
        char[][] input1 = {{'X', '.', '.', 'X'},
                {'.', '.', '.', 'X'},
                {'.', '.', '.', 'X'}};

        assertEquals(2, app.countBattleships(input1));

        input1 = new char[][] {{'X', '.', 'X', '.', 'X'},
                {'X', '.', '.', '.', 'X'},
                {'.', '.', '.', '.', '.'},
                {'X', 'X', 'X', '.', '.'}};

        assertEquals(4, app.countBattleships(input1));
    }

    @Test
    public void shortestToChar() {
        String intput1 = "loveleetcode";
        char C = 'e';

        assertArrayEquals(new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}, app.shortestToChar(intput1, C));

        intput1 = "aaac";
        C = 'c';
        assertArrayEquals(new int[]{3, 2, 1, 0}, app.shortestToChar(intput1, C));
    }

    @Test
    public void countBits() {
        int input = 5;

        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, app.countBits(5));
    }

    @Test
    public void customSortString() {
        String input1 = "cba";
        String input2 = "abcd";

        assertEquals("cbad", app.customSortString(input1, input2));

        input1 = "fdc";
        input2 = "abcdefghijklmncc";
        assertEquals("fdcccabeghijklmn", app.customSortString(input1, input2));
    }

    @Test
    public void findDuplicates() {
        int[] input = {2, 4, 2, 3, 3, 1, 9, 8, 4};

        assertEquals(Arrays.asList(2, 3, 4), app.findDuplicates(input));
    }

    @Test
    public void reconstructQueue() {
        int[][] input = {{7, 1}, {4, 4}, {7, 0}, {5, 2}, {6, 1}, {5, 0}, {4, 5}, {4, 6}, {4, 7}, {2, 3}};

        assertArrayEquals(new int[][]{{5, 0}, {7, 0}, {5, 2}, {2, 3}, {6, 1}, {4, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 1}}, app.reconstructQueue(input));

        input = new int[][]{};

        assertArrayEquals(new int[][]{}, app.reconstructQueue(input));
    }
}