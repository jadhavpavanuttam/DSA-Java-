import java.util.Scanner;

public class ReverseMatricesRows {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number of Rows :");
        int r=scanner.nextInt();
        System.out.println("Enter Number of columns :");
        int c=scanner.nextInt();
        System.out.println("Enter "+r*c+" : Values ");
        int [][]matrix=new int[r][c];  //rows , columns
        for(int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                matrix[i][j]=scanner.nextInt();
            }
        }
        printMatrix(matrix,r,c);
    }
    private static void printMatrix(int matrix[][],int r,int c)
    {
        int j=0;
        for (int i=r-1;i>=0;i--)
        {
            for(j=0;j<matrix[i].length;j++)
            {
                /*
                reverse the rows
                1  2  3
                4  5  6
                7  8  9
                 */

                System.out.print(matrix[i][j]+"  ");

            }
            System.out.println();
        }
    }

}

/*
Enter Number of Rows :
3
Enter Number of columns :
3
Enter 9 Values
1 2 3
4 5 6
7 8 9

7  8  9
4  5  6
1  2  3
 */