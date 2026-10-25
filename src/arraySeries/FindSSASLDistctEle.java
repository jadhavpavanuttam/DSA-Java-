package arraySeries;

public class FindSSASLDistctEle {
    public static void main(String[] args) {
        System.out.println("Second Largest : " + secondLargest(new int[]{13, 53, 5, 245, 36}));
        System.out.println("Second Smallest : " + secondSmallest(new int[]{13, 53, 5, 245, 36}));
    }

    static Integer secondSmallest(int[] a) {
        Integer first = null, second = null;

        for (int x : a) {
            if (first == null || x < first) {
                second = first;
                first = x;
            } else if (x != first && (second == null || x < second)) {
                second = x;
            }
        }
        return second;
    }

    static Integer secondLargest(int[] a) {
        Integer first = null, second = null;

        for (int x : a) {
            if (first == null || x > first) {
                if (first != null) second = first;
                first = x;
            } else if (x != first && (second == null || x > second)) {
                second = x;
            }
        }
        return second;
    }
}
