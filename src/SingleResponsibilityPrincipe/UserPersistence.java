package SingleResponsibilityPrincipe;

//ეს კლასი პასუხისმგებელია მონაცემების შენახვაზე
public class UserPersistence {
    public void SaveUser(User user)
    {
        System.out.println("Succefuly Registration" + " " + user.getFirstName() + " " + user.getLastName());
    }
}
