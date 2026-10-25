package strings;

public class ReverseStringdemo {
    public static void main(String[] args) {
        System.out.println("REVERSE IS : " + reverse("pavan"));
    }

    static String reverse(String s) {
        char[] a = s.toCharArray();
        int left = 0, right = a.length - 1;

        while (left < right) {
            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        return new String(a);
    }
}
