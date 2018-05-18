package tk.carlyle2k;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AppTest {
    private App app = new App();

    @Test
    public void flipAndInvertImage() {
        int[][] m1 = new int[][] {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        assertArrayEquals(app.flipAndInvertImage(m1), new int[][]{{1, 0, 0},
                {0, 1, 0}, {1, 1, 1}});

        int[][] m2 = new int[][] {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };

        assertArrayEquals(app.flipAndInvertImage(m2), new int[][] {{1,1,0,0},
                {0,1,1,0}, {0,0,0,1}, {1,0,1,0}});
    }
}