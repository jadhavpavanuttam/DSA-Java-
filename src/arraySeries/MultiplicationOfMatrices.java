import java.util.Scanner;

public class MultiplicationOfMatrices {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        int row1=new Scanner(System.in).nextInt();
        System.out.println("Enter Column's :");
        int col1=new Scanner(System.in).nextInt();
        int first[][]=new int[row1][col1];
        for(int i=0;i<first.length;i++)
        {
            for(int j=0;j<first.length;j++)
            {
                first[i][j]=new Scanner(System.in).nextInt();
            }
        }
        System.out.println("Enter number of rows:");
        int row2=new Scanner(System.in).nextInt();
        System.out.println("Enter Column's :");
        int col2=new Scanner(System.in).nextInt();


        int second[][]=new int[row2][col2];
        for(int i=0;i<second.length;i++)
        {
            for(int j=0;j<second.length;j++)
            {
                first[i][j]=new Scanner(System.in).nextInt();
            }
        }

//        inputValues(first,second,row1,col1,row2,col2);
        multiplication(first,second,row1,row2,col1,col2);
    }
    private static void multiplication(int [][]first,int [][]second,int r1,int r2,int c1,int c2)
    {
        if(c1!=c2)
        {
            System.out.println("Wrong input...");
            return;
        }
//        int mul=1;
        int [][]mul=new int[r1][c2];
        for(int i=0;i<r1;i++)
        {
            for (int j=0;j<first[i].length;j++)
            {
                for(int k=0;k<c1;k++)
                {
                    /*
                    i 'th row of first

                    j 'th column of second
                     */
                    mul[i][j]+=(first[i][k]*second[k][j]);
                }
            }
        }
printMatrix(mul);
    }
    private static void printMatrix(int [][]mul)
    {
        for (int i=0;i<mul.length;i++)
        {
            for(int j=0;j<mul[i].length;j++)
            {
                System.out.println(mul[i][j]);
            }
        }
    }
}