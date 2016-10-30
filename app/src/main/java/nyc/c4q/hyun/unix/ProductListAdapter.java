package nyc.c4q.hyun.unix;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import nyc.c4q.hyun.unix.products.Products;

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
        Product employee = mData.get(position);
        viewHolder.bind(employee);
        viewHolder.setOnClickListener(buildEmployeeClickListener(employee));
    }

    private View.OnClickListener buildEmployeeClickListener(Product employee) {
        if (employee != null){
            return navigateToEmployeeViewListener(employee.getName());
        }
        return defaultClickListener();
    }

    /**
     * This click listener launches an intent with the employee name as an extra
     * @param name
     * @return
     */
    private View.OnClickListener navigateToEmployeeViewListener(final String name) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ProductView.class);
                intent.putExtra(ProductView.EMPLOYEE_NAME, name);
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
