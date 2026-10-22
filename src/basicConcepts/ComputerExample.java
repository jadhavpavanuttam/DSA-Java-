package JavaInnerClass.com;

public class ComputerExample {
    public static void main(String[] args) {
Computer computer=new Computer("XYz","HP","ABC");
    String s=computer.getOs().stripIndent();

        System.out.println("Operating System nsme is : "+s);
        Computer.OperatingSystem.USB usb = new Computer.OperatingSystem.USB("Type-C");
        System.out.println("Given USB Output  : "+usb);

    }
}
