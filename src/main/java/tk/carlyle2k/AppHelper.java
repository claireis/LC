package tk.carlyle2k;

import java.util.Arrays;

public class AppHelper {
    private static final AppHelper HELPER = new AppHelper();
    private AppHelper() {}
    public static AppHelper getInstance() {
        return HELPER;
    }

    public void print2DArray(int[][] a) {
        for (int[] t : a) {
            System.out.println(Arrays.toString(t));
        }
    }
}
