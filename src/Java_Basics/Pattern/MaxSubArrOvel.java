package Java_Basics.Pattern;

public class MaxSubArrOvel {
    //a,e,i,o,u
    public static void main(String[] args) {

    }

    private static String maxSubArrOvalLen(String str, int k) {
        int l = 0, r = 0, res = 0, window = 0;
        for (; r < k; r++) {
            window += isOwel(str.charAt(r));
        }
        res = window;
//        window += str.charAt(r);
        while (r < str.length()) {
            window -= isOwel(str.charAt(l++));
            window += isOwel(str.charAt(r++));
            res = Math.max(res, window);
        }
        //sub string updation
        return "";
    }

    private static int isOwel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
    }
}
/*
sliding window pattern
 */