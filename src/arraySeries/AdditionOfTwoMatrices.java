import java.util.Scanner;

public class AdditionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rows :");
        int r1=sc.nextInt();
        System.out.println("Enter Columns :");
        int c1=sc.nextInt();
        //rows are compulsery columns are not columns
        int [][]a=new int[r1][c1];   //r*c
        System.out.println("Enter "+(r1*c1)+" Element's :");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++) {
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter Rows :");
        int r2=sc.nextInt();
        System.out.println("Enter Columns :");
        int c2=sc.nextInt();

        int [][]b=new int[r2][c2];   //r*c
        System.out.println("Enter "+(r2*c2)+" Element's :");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++) {
                b[i][j]= sc.nextInt();
            }
        }
        add(a,r1,c1,b,r2,c2);
    }
    private static void add(int [][]a,int r1,int c1,int [][]b,int r2,int c2)
    {
        if(r1!=r2||c1!=c2)
        {
            System.out.println("Wrong Input..Addition is not possible ");
            return;
        }
        System.out.println("Addition of two matrices is :\n");
        int [][]sum=new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        printMatrix(sum,r1,c1);
            }
            private static void printMatrix(int [][]sum,int rows,int columns)
            {
                for(int i=0;i< sum.length;i++)
                {
                    for(int j=0;j<sum[1].length;j++)
                    {
                        System.out.print(sum[i][j]+"  ");
                    }
                    System.out.println();
                }
            }

}

/*
Addition of two matrices is :

Enter Rows :
2
Enter Columns :
2
Enter 4 Element's :
1 2
1 2
Enter Rows :
2
Enter Columns :
2
Enter 4 Element's :
1 2
1 2
2  4
2  4

 */


/*
when can gives mismatch numbers of rows and columns

Enter Rows :
3
Enter Columns :
3
Enter 9 Element's :
1 2 3
4 5 6
7 8 9
Enter Rows :
3
Enter Columns :
4
Enter 12 Element's :
1 2 3
1 2 3
1 2 3
1 2 3
Wrong Input...

 */