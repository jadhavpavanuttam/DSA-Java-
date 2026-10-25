package Java_Basics.Pattern;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        System.out.println("Reversing of isEnglish is : " + reverseOnlyLet("abc-consts1234"));
    }

    private static String reverseOnlyLet(String str) {
        //"ab-cd" -->"dc-ba"
        int i = 0, j = str.length() - 1;
        char[] arr = str.toCharArray();
        while (i < j) {
            if (isEnglish(arr[i])) {
                while (isEnglish(arr[j])) {  //debug to
                    j--;
                }
                char t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                j--;
            }
            i++;
        }
        return new String(arr);
    }

    private static boolean isEnglish(char ch) {
        return (65 < ch && ch < 90) || (97 < ch && ch < 122);
    }
}
//time complexity is O(n)
