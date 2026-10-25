package strings;

public class SpaceCountingAndRemoveStr {
    public static void main(String[] args) {
        System.out.println(countSpaces("Space Counting : " + "HII IM PAVAN JADHAV FROM JALGAON"));
        System.out.println(removeSpaces("Remove Spaces : " + "HII IM PAVAN JADHAV FROM JALGAON"));
    }

    static int countSpaces(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == ' ')
                count++;

        return count;
    }

    static String removeSpaces(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != ' ')
                result.append(s.charAt(i));

        return result.toString();
    }
}
