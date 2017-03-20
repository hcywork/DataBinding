package com.chuangjiangkeji.bcrm.databinding;

import android.databinding.BindingAdapter;
import android.widget.TextView;

/**
 * Created by hecaiyang on 2017/3/19.
 */

public class DataBindingAdapta {
    @BindingAdapter({"bind:text_left"})
    public static void setText_left(CommonViewItem operator, String array) {
        operator.setText_left(array);
    }
    @BindingAdapter({"android:text"})
    public static void setText(TextView textView, String array) {
        textView.setText(array+"he");
    }
}
