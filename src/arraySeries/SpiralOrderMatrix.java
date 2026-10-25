package arraySeries;

import java.util.Scanner;

public class SpiralOrderMatrix {
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
printMatrix(matrix);

    }
    private static void printSpiralOrder(int [][]matrix,int r,int c)
    {
        int totelElements=0;
        int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
        while(totelElements<r*c)
        {
            //topRow ->leftColl to rightCol

            for(int j=leftCol;j<=rightCol;j++)
            {
                System.out.println(matrix[topRow][j]);
                totelElements++;
            }
            topRow++;
            //rightCol to BottomRows
            for(int i=topRow;i<=bottomRow;i++)
            {
                System.out.println(matrix[i][rightCol]);
                totelElements++;
            }
            rightCol--;
            //BottomRows to right to left
           for(int j=rightCol;j>=leftCol;j--)
           {
               System.out.println(matrix[bottomRow][j]);
               totelElements++;
           }
           bottomRow--;
            //leftCol ->bottom ot leftRow
            for(int i=bottomRow;i>=topRow;i--)
            {
                System.out.println(matrix[i][leftCol]);
                totelElements++;
            }
            leftCol++;
        }

    }
    private static void printMatrix( int matrix[][])
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
Enter the number of rows and columns :
3
4
Enter  12 Values 1 2 3
1 2 4
5 6 7
7 5 6
top:R
  1  2  3  1
  2  4  5  6
  7  7  5  6
Bott:R  Right:C
left:C
 */