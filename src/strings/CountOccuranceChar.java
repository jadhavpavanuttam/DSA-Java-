package strings;

public class CountOccuranceChar {
    public static void main(String[] args) {
        System.out.printf("COUNTIG OF A IS : " + frequency("naval", 'l'));
        System.out.printf("COUNTIG OF A IS : " + frequency("pranav", 'a'));
    }

    static int frequency(String s, char target) {
        int count = 0;

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == target)
                count++;

        return count;
    }
}
