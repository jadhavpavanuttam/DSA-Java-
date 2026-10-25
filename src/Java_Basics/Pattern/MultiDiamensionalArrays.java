package Java_Basics.Pattern;

public class MultiDiamensionalArrays {
    public static void main(String[] args) {
        int [][]nums=new int[3][4];
        int random=0;


        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                nums[i][j]=(int)(Math.random()*10);
                System.out.print(" "+nums[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
//                nums[i][j]=(int)Math.random()*10;
                System.out.print(" "+nums[i][j]);
            }
            System.out.println();
        }
    }
}
/*
Random Values Generator:

 7 2 4 0
 9 0 0 7
 3 7 0 1
 7 2 4 0
 9 0 0 7
 3 7 0 1
 */