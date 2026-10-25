package arraySeries;

public class LongestConsSeq {
    public static void main(String[] args) {
        System.out.println("Longest Cons Seq Is : " + longestConsecutive(new int[]{1, 2, 3, 1, 56, 4, 6, 75}));
    }

    static int longestConsecutive(int[] a) {
        java.util.Set<Integer> set = new java.util.HashSet<>();
        for (int x : a) set.add(x);

        int best = 0;
        for (int x : set) {
            if (x == Integer.MIN_VALUE || !set.contains(x - 1)) {
                int length = 1;
                long next = (long) x + 1;

                while (next <= Integer.MAX_VALUE && set.contains((int) next)) {
                    length++;
                    next++;
                }
                best = Math.max(best, length);
            }
        }
        return best;
    }
}
