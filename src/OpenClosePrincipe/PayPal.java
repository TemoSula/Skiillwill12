package OpenClosePrincipe;

public class PayPal implements Payment{
    @Override
    public void PaymentType() {
        System.out.println("You want to pay with your paypal");
    }
}
