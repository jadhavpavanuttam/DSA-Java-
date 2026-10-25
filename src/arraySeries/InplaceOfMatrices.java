package arraySeries;

import java.util.Scanner;

public class InplaceOfMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nummber of rows and columns :");
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] matrix = new int[r][c];
        int totelElements = r * c;
        System.out.print("Enter  " + totelElements + " Values ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Transpose :");
        transposeInPlase(matrix, r, c);
        printMatrix(matrix);
    }

    private static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print("  " + matrix[i][j]);
            System.out.println();
        }
    }

    static void transposeInPlase(int[][] matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
}

/*
Enter the number of rows and columns :
3
3
Enter  9 Values 1 3 4
3 4 5
6 5 3
Transpose :
  1  3  6
  3  4  5
  4  5  3
 */