package nyc.c4q.hyun.unix.products;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import nyc.c4q.hyun.unix.R;

/**
 * Created by Hyun on 10/29/16.
 */
public class ProductViewHolder extends RecyclerView.ViewHolder {

    private final View mView;
    private final ImageView mProductPic;

    public ProductViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        mView = itemView;
        mProductPic = (ImageView) mView.findViewById(R.id.product_image);
    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.product_view_holder, parent, false);
    }

    public void bind(Products productDescription) {
        Integer resource = productDescription.getImageResource();
        if (resource != null){
            mProductPic.setImageResource(resource);
        }
    }
    public void setOnClickListener(View.OnClickListener clickListener){
        mView.setOnClickListener(clickListener);
    }
}
