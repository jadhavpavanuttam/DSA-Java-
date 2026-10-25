package arraySeries;

public class SearchInRowAndColSM {
    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1, 2, 3}, {1, 2, 3}}, 2));
    }

    static boolean searchMatrix(int[][] a, int target) {
        if (a.length == 0 || a[0].length == 0) return false;

        int r = 0, c = a[0].length - 1;

        while (r < a.length && c >= 0) {
            if (a[r][c] == target) return true;
            if (a[r][c] > target) c--;
            else r++;
        }
        return false;
    }
}
