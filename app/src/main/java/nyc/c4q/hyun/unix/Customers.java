package nyc.c4q.hyun.unix;

/**
 * Created by Hyun on 10/28/16.
 */
public class Customers {

    private final String mEmail;

    private final String mPassword;

    public Customers(String mEmail, String mPassword) {
        this.mEmail = mEmail;
        this.mPassword = mPassword;
    }

    public String getPassword() {
        return mPassword;
    }

    public String getEmail() {
        return mEmail;
    }

}
