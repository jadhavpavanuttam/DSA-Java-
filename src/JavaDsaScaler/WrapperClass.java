package JavaDsaScaler;

public class WrapperClass {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(5);
        System.out.println(i + " " + i.getClass().getName());
        Float f = Float.valueOf(4);
        System.out.println(f + " " + f.getClass().getName());
        Integer ia = Integer.valueOf("101", 2);
        int x = ia.intValue();
        System.out.println("Class Name :" + ia.getClass().getName() + " ,  Value : " + x);
    }
}
