package arraySeries;

public class FindMajorityNBy2time {
    public static void main(String[] args) {
        System.out.println("n/2 time majority is : " + majority(new int[]{1, 23, 1, 41, 5, 1, 2, 2, 4, 13, 41}));
    }

    static Integer majority(int[] a) {
        int candidate = 0, votes = 0;

        for (int x : a) {
            if (votes == 0) candidate = x;
            votes += x == candidate ? 1 : -1;
        }

        int count = 0;
        for (int x : a) if (x == candidate) count++;

        return count > a.length / 2 ? candidate : null;
    }
}
/*
Uses Boyer–Moore voting and then verifies the candidate.
 */