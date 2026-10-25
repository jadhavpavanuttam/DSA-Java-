package Java_Basics.Pattern;

public class PatternPrint {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(i==0||j==0||i==10/2||i==10||j==10)
//               if((i==0 && j<10) ||(i==10&&j<10)||(j==0)||(j==10&&i<10))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                System.out.println("Amol");

            }
            System.out.println();
        }
    }
}
