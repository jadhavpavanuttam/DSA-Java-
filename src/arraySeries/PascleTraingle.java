import java.util.Scanner;

public class PascleTraingle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Range :");

        int n=scanner.nextInt();
        int a[][]=pascle(n);
        printMatrix(a);
    }
    private static int [][]pascle(int n)
    {
        int [][]pscl=new int[n][];
        for(int i=0;i<n;i++)
        {
            //dynamically we get spaces with each arrays
            pscl[i]=new int[i+1];
            //qs tand last elements of eveery rows has1
            pscl[i][0]= pscl[i][i]=1;
            for (int j=1;j<i;j++)
                pscl[i][j]=pscl[i-1][j]+pscl[i-1][j-1];
        }
        return pscl;
    }

    private static void printMatrix(int matrix[][])
    {
        for(int i=0;i< matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
                System.out.print("  " + matrix[i][j]);
            System.out.println();
        }
    }
}
/*
Enter the Range :
        7
        1
        1  1
        1  2  1
        1  3  3  1
        1  4  6  4  1
        1  5  10  10  5  1
        1  6  15  20  15  6  1
*/