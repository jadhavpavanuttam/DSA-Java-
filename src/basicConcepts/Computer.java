package basicConcepts;

//Static inner class
public class Computer {
    private String brand;
    private String model;
    private String os;

    public Computer(String osName, String brand, String model) {
        this.os = new OperatingSystem(osName).toString();
        this.brand = brand;
        this.model = model;
    }

    public String getOs() {
        return os;
    }

//    public OperatingSystem os;

    class OperatingSystem {
        private String osName;

        static class USB {
            private String type;

            public USB(String type) {
                this.type = type;
                System.out.println("USB Type is : " + type);
            }
        }

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayName() {
            System.out.println("Operating is given.." + " Mac OS");
        }
    }

    public static interface Payment {
        void pay(double amount);
    }
}
