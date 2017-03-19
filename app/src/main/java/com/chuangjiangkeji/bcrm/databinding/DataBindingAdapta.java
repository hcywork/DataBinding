package com.chuangjiangkeji.bcrm.databinding;

import android.databinding.BindingAdapter;
import android.widget.TextView;

/**
 * Created by hecaiyang on 2017/3/19.
 */

public class DataBindingAdapta {
    @BindingAdapter({"bind:text_left"})
    public static void entriefgs(CommonViewItem operator, String array, String array2) {
        operator.setText_left(array);
        operator.setText_right(array2);
    }
}
