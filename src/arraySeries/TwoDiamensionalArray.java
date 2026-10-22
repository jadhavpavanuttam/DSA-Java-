import java.util.Scanner;

public class TwoDiamensionalArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rows :");
        int r=sc.nextInt();
        System.out.println("Enter Columns :");
        int c=sc.nextInt();
    //rows are compulsery columns are not columns
        int [][]arr=new int[r][c];   //r*c
        System.out.println("Enter "+(r*c)+" Element's :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        printArray(arr,r,c);


        //Array Literals..
//        int arr[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}

//        System.out.println(arr[0][2]);//3
//        System.out.println(arr[2][0]); //7
    }
    //printing all the arrays elements
    private static void printArray(int [][]arr,int r,int c)
    {
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
