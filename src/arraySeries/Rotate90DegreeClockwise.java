package arraySeries;

import java.util.Scanner;

public class Rotate90DegreeClockwise {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Same Rows & Column's");
        int r=scanner.nextInt();
        int c=scanner.nextInt();
        int [][]matrix=new int[r][c];
        int totelElements=r*c;
        System.out.print("Enter  "+totelElements+" Values \n");
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Input matrix :");
        printMatrix(matrix);
        System.out.println("Transpose :");
        transposeInPlase(matrix,r,c);
        rotate(matrix,r);
        printMatrix(matrix);
    }
    private static void printMatrix(int [][]print)
    {
        for(int i=0;i<print.length;i++)
        {
            for(int j=0;j<print[i].length;j++)
            {
                System.out.print("  "+print[i][j]);
            }
            System.out.println();
        }
    }
    private static void reverseArray(int []a)
    {
        int i=0,j=a.length-1;
        while(i<j)
        {
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
    }
    private static void rotate(int [][]matrix,int n)
    {
transposeInPlase(matrix,n,n);
for(int i=0;i<n;i++)
{
    Rotate90DegreeClockwise.reverseArray(matrix[i]);
}
    }
    static void transposeInPlase(int [][]matrix,int r,int c)
    {
        for(int i=0;i<c;i++)
        {
            for (int j=i;j<r;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

    }
}

/*
rotate 90 degree to the given matrices:

Enter Same Rows & Column's
3
3
Enter  9 Values
1 2 3
4 5 6
7 8 9
Input matrix :
  1  2  3
  4  5  6
  7  8  9
Transpose :
  3  2  1
  6  5  4
  9  8  7

 */