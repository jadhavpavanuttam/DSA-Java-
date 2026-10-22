package JavaInnerClass.com;

public class ShopingCart {
    private double totelAmount;
    public ShopingCart(double totelAmount)
    {
        this.totelAmount=totelAmount;
    }
    public void processPayment(Computer.Payment payment)
    {
        payment.pay(totelAmount);
    }
}
