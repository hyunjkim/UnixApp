package nyc.c4q.hyun.unix.products;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import nyc.c4q.hyun.unix.R;

public class UnixPageActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unixpage_layout);
        mRecyclerView = (RecyclerView) findViewById(R.id.productList_RV);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        mRecyclerView.setAdapter(new ProductListAdapter());
    }
}
