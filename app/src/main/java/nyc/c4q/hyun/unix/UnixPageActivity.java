package nyc.c4q.hyun.unix;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import nyc.c4q.hyun.unix.products.ProductListAdapter;

public class UnixPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unixpage_layout);

        setToolBar();
        setRecycler();

    }
    private void setToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.unixcctv);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }

    private void setRecycler() {
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.productList_RV);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new ProductListAdapter());
    }

    // Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) { //
            case R.id.toolbar_faves:
//                composeMessage();
                return true;
            case R.id.toolbar_cart:
//                showProfileView();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
