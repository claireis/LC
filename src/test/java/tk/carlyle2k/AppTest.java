package tk.carlyle2k;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AppTest {
    private App app = new App();

    @Test
    public void repeatNTimes() {
        int[] A = {1, 2, 3, 3};

        assertEquals(3, app.repeatedNTimes(A));

        A = new int[]{5,1,5,2,5,3,5,4};
        assertEquals(5, app.repeatedNTimes(A));
    }

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

    @Test
    public void canVisitAllRooms() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(1));
        input.add(Arrays.asList(2));
        input.add(Arrays.asList(3));
        input.add(new ArrayList<>());

        assertTrue(app.canVisitAllRooms(input));

        input.clear();
        input.add(Arrays.asList(1, 3));
        input.add(Arrays.asList(3, 0, 1));
        input.add(Arrays.asList(2));
        input.add(Arrays.asList(0));

        assertFalse(app.canVisitAllRooms(input));

        input.clear();
        input.add(Arrays.asList(2));
        input.add(new ArrayList<>());
        input.add(Arrays.asList(1));

        assertTrue(app.canVisitAllRooms(input));

        input.clear();
        input.add(new ArrayList<>());
        input.add(Arrays.asList(1, 1));
        input.add(Arrays.asList(2, 2));

        assertFalse(app.canVisitAllRooms(input));

        input.clear();
        input.add(Arrays.asList(4));
        input.add(Arrays.asList(3));
        input.add(new ArrayList<>());
        input.add(Arrays.asList(2, 5, 7));
        input.add(Arrays.asList(1));
        input.add(new ArrayList<>());
        input.add(Arrays.asList(8, 9));
        input.add(new ArrayList<>());
        input.add(new ArrayList<>());
        input.add(Arrays.asList(6));

        assertFalse(app.canVisitAllRooms(input));
    }

    @Test
    public void toGoatLatinTest() {
        String input = " I";

        assertEquals("Imaaa", app.toGoatLatin(input));

        input = "The quick brown fox jumped over the lazy dog";

        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa", app.toGoatLatin(input));
    }

    @Test
    public void findBottomLeftValueTest() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        assertEquals(1, app.findBottomLeftValue(root));

        root = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        t1.left = new TreeNode(4);
        root.left = t1;

        TreeNode t2 = new TreeNode(5);
        t2.left = new TreeNode(7);
        TreeNode t3 = new TreeNode(3);
        t3.left = t2;
        t3.right = new TreeNode(6);
        root.right = t3;

        assertEquals(7, app.findBottomLeftValue(root));
    }

    @Test
    public void singleNonDuplicateTest() {
        // int[] input = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        //
        // assertEquals(2, app.singleNonDuplicate(input));
        //
        // input = new int[]{3, 3, 7, 7, 10, 11, 11};
        //
        // assertEquals(10, app.singleNonDuplicate(input));
        //
        // input = new int[]{1, 2, 2};
        //
        // assertEquals(1, app.singleNonDuplicate(input));
    }

    @Test
    public void largestValuesTest() {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(5);
        root.right = t1;
        TreeNode t2 = new TreeNode(2);
        t1.right = t2;
        t2.right = new TreeNode(5);
        t2.left = new TreeNode(5);

        assertEquals(Arrays.asList(1, 5, 2, 5), app.largestValues(root));

    }
}