package JavaDsa;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {

//        with veriable length of cols in rows
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();  //3
        int[][] arr = new int[r][];  //row not column
        for (int i = 0; i < r; i++) {   //0 -> 2
            System.out.println("Enter Current Row :");
            int currentRow = scanner.nextInt();  //3
            arr[i] = new int[currentRow];  //arr[0] -> arr[2]
            System.out.println("Data in Current Rows is : ");
            for (int j = 0; j < currentRow; j++) {   //  0 -> 2 = 3
                arr[i][j] = scanner.nextInt();     //row -> col =>  how much we can interred
            }
        }
        System.out.println(Arrays.deepToString(arr));   //cast into the given list
    }
}

/*
no fixed number of rows is called as jagged array :
Or
every rows has variable number of elements
[[2], [4, 4, 3], [3, 1]]
 */