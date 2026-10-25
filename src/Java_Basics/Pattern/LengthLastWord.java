package Java_Basics.Pattern;

public class LengthLastWord {
    public static void main(String[] args) {

        System.out.println("COUNTING OF THE LENGTH OF LAST WORD IS : " + countLength("qweqwe"));
    }

    private static int countLength(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                counter = 0;
            }
            counter++;
        }
        return counter - 1;
    }
}
