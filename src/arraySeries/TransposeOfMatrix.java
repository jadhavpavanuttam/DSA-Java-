package arraySeries;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the nummber of rows and columns :");
        int r=scanner.nextInt();
        int c=scanner.nextInt();
        int [][]matrix=new int[r][c];
        int totelElements=r*c;
        System.out.print("Enter  "+totelElements+" Values ");
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);
        System.out.println("Transpose of matrices :");
        finrTranspose(matrix,r,c);
        printMatrix(matrix);
    }

    static int[][]finrTranspose(int transpose[][],int r,int c)
    {

        int ans[][]=new int[c][r];
        for (int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
              ans[i][j]=transpose[j][i];
            }
        }
        return ans;
    }
    private static void printMatrix(int matrix[][])
      {
    for(int i=0;i<matrix.length;i++)
    {
        for (int j=0;j<matrix[i].length;j++)
        {
            System.out.print(matrix[i][j]);
        }
        System.out.println();
    }
}
}
