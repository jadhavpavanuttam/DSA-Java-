package basicConcepts;

public class AnonymousExample {
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//    ShopingCart shopingCart=new ShopingCart(150);

    public static void main(String[] args) {
        ShopingCart shopingCart=new ShopingCart(150);
//    CreaditCard creaditCard=new CreaditCard("4934");
    shopingCart.processPayment(new Computer.Payment() {
        @Override
        public void pay(double amount) {
            System.out.println("Payed  "+amount+"  Success");
        }
    });
    shopingCart.processPayment(new Computer.Payment() {
        @Override
        public void pay(double amount) {
            System.out.println("Payment Successfull ...");
        }
    });

    }
}
