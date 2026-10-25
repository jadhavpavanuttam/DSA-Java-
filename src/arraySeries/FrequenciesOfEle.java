package arraySeries;

public class FrequenciesOfEle {
    public static void main(String[] args) {
        frequencies(new int[]{1, 2, 31, 1, 53, 64, 13, 6, 46, 3, 9, 9, 7});
    }

    static void frequencies(int[] a) {
        java.util.Map<Integer, Integer> f = new java.util.LinkedHashMap<>();
        for (int x : a) f.put(x, f.getOrDefault(x, 0) + 1);
        System.out.println(f);
    }
}
