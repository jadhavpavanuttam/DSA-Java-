package arraySeries;

public class FindRepeated {
    public static void main(String[] args) {
        System.out.println(firstRepeatingElement(new int[]{1, 3, 6, 6, 26, 65, 6}));
        System.out.println("Unique ele : " + firstUniqueElement(new int[]{1, 3, 6, 6, 26, 65, 6}));
    }

    static Integer firstRepeatingElement(int[] a) {
        java.util.Set<Integer> seen = new java.util.HashSet<>();

        for (int i = a.length - 1; i >= 0; i--)
            if (!seen.add(a[i])) {
                System.out.println("continue scan to identify...");
            }

        java.util.Set<Integer> suffix = new java.util.HashSet<>();
        for (int i = a.length - 1; i >= 0; i--) {
            if (suffix.contains(a[i])) {
                System.out.println("repeated value : " + a[i]);
            }
            suffix.add(a[i]);
        }

        java.util.Set<Integer> all = new java.util.HashSet<>();
        for (int x : a) all.add(x);

        java.util.Set<Integer> checked = new java.util.HashSet<>();
        for (int x : a) {
            if (!checked.add(x)) return x;
        }
        return null;
    }

    static Integer firstUniqueElement(int[] a) {
        java.util.Map<Integer, Integer> f = new java.util.LinkedHashMap<>();

        for (int x : a) f.put(x, f.getOrDefault(x, 0) + 1);
        for (int x : a) if (f.get(x) == 1) return x;

        return null;
    }
}
