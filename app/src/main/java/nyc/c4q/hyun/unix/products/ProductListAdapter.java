package nyc.c4q.hyun.unix.products;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import nyc.c4q.hyun.unix.R;

/**
 * Created by Hyun on 10/29/16.
 */
public class ProductListAdapter extends RecyclerView.Adapter {

    private List<Products> mData = Arrays.asList(
            new Products("AntiIr", R.drawable.antiirreflection),
            new Products("KleinTools", R.drawable.kleintools),
            new Products("Led", R.drawable.ledlights),
            new Products("Magic", R.drawable.magicseries),
            new Products("Ring", R.drawable.ringdoorbells),
            new Products("Rack", R.drawable.rackcabinets)
    );
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ProductViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ProductViewHolder viewHolder = (ProductViewHolder) holder;
        Products products = mData.get(position);
        viewHolder.bind(products);
        viewHolder.setOnClickListener(buildProductClickListener(products));
    }

    private View.OnClickListener buildProductClickListener(Products products) {
        if (products != null){
            return navigateToProductViewListener(products.getName());
        }
        return defaultClickListener();
    }
    /**
     * This click listener launches an intent with the products name as an extra
     */
    private View.OnClickListener navigateToProductViewListener(final String name) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ProductView.class);
                intent.putExtra(ProductView.PRODUCT_NAME, name);
                view.getContext().startActivity(intent);
            }
        };
    }
    /*
     The default click listener does nothing;
     */
    private View.OnClickListener defaultClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Do Nothing
            }
        };
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
