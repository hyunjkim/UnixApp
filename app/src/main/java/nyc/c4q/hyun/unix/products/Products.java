package nyc.c4q.hyun.unix.products;

import android.support.annotation.DrawableRes;

import nyc.c4q.hyun.unix.R;

/**
 * Created by Hyun on 10/29/16.
 */

public class Products {

    private final String mName;
    private final Integer mImage;

    public Products (String name){
        mName = name;
        mImage = R.drawable.blank_pic;
    }

    public Products (String name, @DrawableRes Integer resource){
        mName = name;
        mImage = resource;
    }
    public String getName() {
        return mName;
    }

    public Integer getImageResource() {
        return mImage;
    }
}
