package arraySeries;

public class MoveZerosEle {
    public static void main(String[] args) {
        moveZeros(new int[]{0, 1, 0, 3, 12});
    }

    static void moveZeros(int[] a) {
        int k = 0;
        for (int x : a)
            if (x != 0) a[k++] = x;

        while (k < a.length) a[k++] = 0;
    }
}
