package basicConcepts;

public class CreaditCard implements Computer.Payment {
    private String creditCardNo;

    CreaditCard(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    public void pay(double payment) {
        System.out.println("Payment Successful :" + payment + " using Card ");
    }
}
