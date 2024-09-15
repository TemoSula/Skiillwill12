package SingleResponsibilityPrincipe;

//ეს კლასი პასუხისმგებელია იუზერის დარეგისტრირებაზე
public class UserService {
public void RegisterUser(User user){
UserPersistence userPersistence = new UserPersistence();
userPersistence.SaveUser(user);

}

}
