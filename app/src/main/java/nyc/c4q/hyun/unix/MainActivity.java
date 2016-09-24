package nyc.c4q.hyun.unix;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        // Capture our button from layout
        Button button = (Button)findViewById(R.id.button);
        Button buttonTwo = (Button)findViewById(R.id.button2);

        // Register the onClick listener with the implementation above
        button.setOnClickListener(mCorkyListener);
        buttonTwo.setOnClickListener(mCorkyListener);


    }

    private View.OnClickListener mCorkyListener = new View.OnClickListener() {

        Context context = getApplicationContext();
        CharSequence text = "clicked";
        int duration = Toast.LENGTH_SHORT;

        public void onClick(View v) {
            // do something when the button is clicked
//            Toast toast = Toast.makeText(context, text, duration);
//            toast.setText(text);
            // ... Or as a single line:
            Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
        }

    };


    @Override
    protected void onStart() {
        Log.d(TAG,"onStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    public void onClick(View v) {

    }
}
