package OpenClosePrincipe;

public class CreditCard  implements Payment{
    @Override
    public void PaymentType() {
        System.out.println("You want to pay with your CreditCard");
    }
}
