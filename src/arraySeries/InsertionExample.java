package JavaDsa;


import org.jetbrains.annotations.Contract;

public class InsertionExample {
    public static void main(String[] args) {
        for (int x : insertionSort(new int[]{5, 4, 1, 2, 3, 7, 6}))
            System.out.print(" " + x);
    }

    @Contract(value = "_ -> param1", pure = true)
    private static int[] insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] >= key) {
                arr[j + 1] = arr[j];
                j--;                    // j=j-1
            }
            arr[j + 1] = key;
            for (int x:arr)
                System.out.print(x+" ");
            System.out.println();
        }
        System.out.println("______________________");
        return arr;
    }
}
