package arraySeries;

public class SetZerosEle {
    public static void main(String[] args) {
        setZeroes(new int[][]{{1, 2, 3}, {1, 23, 1}, {12, 3, 4}});
    }

    static void setZeroes(int[][] a) {
        if (a.length == 0 || a[0].length == 0) return;

        int m = a.length, n = a[0].length;
        boolean firstRow = false, firstCol = false;

        for (int j = 0; j < n; j++)
            if (a[0][j] == 0) firstRow = true;

        for (int i = 0; i < m; i++)
            if (a[i][0] == 0) firstCol = true;

        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (a[i][j] == 0) a[i][0] = a[0][j] = 0;

        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (a[i][0] == 0 || a[0][j] == 0) a[i][j] = 0;

        if (firstRow)
            for (int j = 0; j < n; j++) a[0][j] = 0;

        if (firstCol)
            for (int i = 0; i < m; i++) a[i][0] = 0;
    }
}
