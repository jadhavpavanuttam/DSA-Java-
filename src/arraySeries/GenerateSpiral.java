import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class GenerateSpiral {
    public static void main(String[] args) {
        System.out.println("Entert the square numer");
        int n=new Scanner(System.in).nextInt();
        int [][]matrix=new int[n][n];
        int totelElements=n*n;
        System.out.print("Enter  "+totelElements+" Values : ");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                matrix[i][j]=new Scanner(System.in).nextInt();
            }
        }
        printMatrix(matrix);
    }
    private static int [][]generateSpiral(int n)
    {
        int topRow=0,bottomRoq=n-1,rightColumn=n-1,leftColumn=0;
        int curr=1;
        int [][]matrix=new int[n][n];
        while(curr<=n*n)
        {
//            for(int j=leftColumn,j<=rightColumn && curr<=n*n;j++)
//            for(int j=0;j< matrix.length && curr<n*n;j++)
//                 matrix[leftColumn][j]=curr++;
            for (int i = 0; i <n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[leftColumn][i]=i;
                }

            }
            for(int j=matrix.length-1;j>=0;j--)
        curr++;
        }

        return matrix;
    }
    private static void printMatrix(@org.jetbrains.annotations.NotNull int matrix[][])
    {
        for(int i=0;i< matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
                System.out.print("  " + matrix[i][j]);
            System.out.println();
        }
    }
}
