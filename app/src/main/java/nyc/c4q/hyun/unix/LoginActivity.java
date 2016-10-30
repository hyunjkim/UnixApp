package nyc.c4q.hyun.unix;

import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;


/**
 * Created by Hyun on 10/28/16.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener,TextView.OnEditorActionListener {

    public static final String TAG = "LoginActivity";

    Button loginBtn;
    Button contactBtn;

    EditText usernameInput;
    EditText passwordInput;

//    * Pass in email , password
//    * */
    private List<Customers> mCustomers = Arrays.asList(
            new Customers("hyunjoo@gmail.com", "helloc4q")
    );

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.login_layout);
        buttons();
//        donebutton();
//        loggingIn();

    }

    private void buttons() {
        loginBtn = (Button) findViewById(R.id.loginbtn);
        loginBtn.setOnClickListener(this);
        contactBtn = (Button) findViewById(R.id.contactusbtn);
        contactBtn.setOnClickListener(this);

        /* For more info :
         * https://developer.android.com/training/keyboard-input/style.html
         */
        usernameInput = (EditText) findViewById(R.id.username_input);
        usernameInput.setOnEditorActionListener(this);
        passwordInput = (EditText) findViewById(R.id.password_input);
        passwordInput.setOnEditorActionListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d("Hyun", "Reaches");
        switch (v.getId()) {
            case R.id.loginbtn:
                Log.d("Hyun", "Reaches2");
                loggingIn();
                break;
            case R.id.contactusbtn:
                break;
        }
    }
    private void loggingIn() {
        if (usernameInput.getText().toString().equals("ashiqueisthebest@gmail.com") && passwordInput.getText().toString().equals("yahh")) {
            Log.d("Hyun", "Reaches3");
            Intent mainPage = new Intent(this, UnixPageActivity.class);
            startActivity(mainPage);
        } else {
            showtheDialog();
        }
    }

    private void showtheDialog() {
        DialogFragment newFragment = new Alert();
        newFragment.show(getFragmentManager(), "alert");
    }

    /*
    * https://developer.android.com/training/keyboard-input/style.html
    * */
    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        boolean handled = false;
        if (actionId == EditorInfo.IME_NULL) {
            handled = true;
        }
        return handled;
    }
}