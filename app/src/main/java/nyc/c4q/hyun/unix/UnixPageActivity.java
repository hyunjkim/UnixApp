package nyc.c4q.hyun.unix;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class UnixPageActivity extends AppCompatActivity {

    public static final String TAG = "UnixPageActivity";
    private RecyclerView mRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unixpage_layout);
        mRecyclerView = (RecyclerView) findViewById(R.id.productList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new ProductListAdapter());
    }
}
