package strings;

public class SpaceCountingStr {
    public static void main(String[] args) {
        System.out.printf("HII IM PAVAN JADHAV FROM JALGAON");
    }
    static int countSpaces(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == ' ')
                count++;

        return count;
    }
}
