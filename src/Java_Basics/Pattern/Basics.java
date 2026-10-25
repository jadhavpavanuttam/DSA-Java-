package Java_Basics.Pattern;

public class Basics {

    public static void main(String[] args) {
//        int num=new Scanner(System.in).nextInt(),sum=0;
        int num = 0, sum = 0;
        for (int i = 0; i < 50; i++) //in the for loop automatically executed
        {
            try {
                Thread.sleep(100);
                if (i % 3 == 0 && i % 2 == 0)
                    continue;
                System.out.println(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

//        do {
//            try {
//                if(num==5){
//                    System.out.println("PAVAN ARE YOU REAHINC AT POSITION :"+num);
//                    break;
//                }
//                Thread.sleep(1000);
//                System.out.println(num);
//
//            num=new Scanner(System.in).nextInt();
//                sum+=num;
//                 num++;
//            }
//            catch(Exception e)
//            {
//                e.printStackTrace();
//            }
//        }
//        while(num!=10);
//        System.out.println("Sum of given numbres:"+sum);
    }

}

