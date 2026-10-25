package arraySeries;

import java.util.*;

public class UnionFind {
    public static void main(String[] args) {
        System.out.println("Union : " + Arrays.toString(union(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 6}).toArray()));
    }

    static java.util.Set<Integer> union(int[] a, int[] b) {
        java.util.Set<Integer> s = new java.util.LinkedHashSet<>();
        for (int x : a) s.add(x);
        for (int x : b) s.add(x);
        return s;
    }

}
