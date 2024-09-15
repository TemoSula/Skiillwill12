import OpenClosePrincipe.CreditCard;
import OpenClosePrincipe.PayPal;
import OpenClosePrincipe.Payment;
import SingleResponsibilityPrincipe.User;
import SingleResponsibilityPrincipe.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ეს არის SingleResponsibility შედეგი
        User user = new User("Giorgi", "Giorgadze");
        UserService service = new UserService();
        service.RegisterUser(user);




        //ეს არის Open/Close შედეგი
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PayType: ");
        String PaymentType = scanner.nextLine();
        Payment payment = null;
        if(PaymentType.equals("PayPal"))
        {
            payment = new PayPal();
            payment.PaymentType();
        }else if(PaymentType.equals("CreditCard"))
        {
            payment = new CreditCard();
            payment.PaymentType();
        }else
        {
            System.out.println("something went wrong");
        }


    }
}