package nyc.c4q.hyun.unix.products;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import nyc.c4q.hyun.unix.R;

/**
 * Created by Hyun on 10/30/16.
 */
public class ProductView extends AppCompatActivity {

    public static final String PRODUCT_NAME = "extra.product.name";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_layout);
        String productinfo = getIntent().getStringExtra(PRODUCT_NAME);
        if(productinfo != null){
            switch (productinfo){
                case "KleinTools":case "Led":
                case "Magic":case "Ring":
                case "Rack":case "AntiIr":
                    break;
            }
        }
    }

}
