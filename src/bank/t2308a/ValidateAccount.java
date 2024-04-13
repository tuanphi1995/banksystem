package bank.t2308a;
public class ValidateAccount {

    private static final String REGISTERED_MOBILE = "0904999999";
    private static final String REGISTERED_PASSWORD = "password123";

    public boolean checkAccount(String mobile, String password) {
        return REGISTERED_MOBILE.equals(mobile) && REGISTERED_PASSWORD.equals(password);
    }
}