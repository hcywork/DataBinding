package com.chuangjiangkeji.bcrm.databinding;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * Created by hecaiyang on 2017/3/17.
 * 自定义通用条目实现
 */

public class CommonViewItem extends RelativeLayout {
    private Boolean RightIsVisiable, iconLeftIsVisiable;
    private static String textLeft, textRight;
    private ImageView leftIcon;
    private TextView leftTextView, rightTextView;
    private Drawable drawable;
    private int colorBlack, colorGray;
    private int colorAttr;


    public CommonViewItem(Context context) {
        super(context);
    }

    public CommonViewItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
        getAttrs(context, attrs);
        setAttrs(context);
    }


    private void initView(Context context) {
        View inflate = View.inflate(context, R.layout.common_view_item, this);
        leftIcon = (ImageView) inflate.findViewById(R.id.tvImage);
        leftTextView = (TextView) inflate.findViewById(R.id.tvLeftText);
        rightTextView = (TextView) inflate.findViewById(R.id.tvRightText);
    }

    /**
     * 获取传入参数   并且传入参数为五个，
     * 分别为左右两边的文字 textLeft  textRight
     * 右边的图片drawable
     * 左边的图片是否显示iconLeftIsVisiable   右边是显示文字还是图片RightIsVisiable
     *
     * @param context
     * @param attrs
     */
    private void getAttrs(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.commonViewItem_attrs);

        textLeft = typedArray.getString(R.styleable.commonViewItem_attrs_text_left);
        textRight = typedArray.getString(R.styleable.commonViewItem_attrs_text_right);

        drawable = typedArray.getDrawable(R.styleable.commonViewItem_attrs_iconSrcRight);
        iconLeftIsVisiable = typedArray.getBoolean(R.styleable.commonViewItem_attrs_iconLeftIsVisiable, false);
        RightIsVisiable = typedArray.getBoolean(R.styleable.commonViewItem_attrs_rightIsVisiable, false);
        colorAttr = typedArray.getColor(R.styleable.commonViewItem_attrs_textColorLeft, colorGray);

        colorBlack = ContextCompat.getColor(context, R.color.itemTextBlack);
        colorGray = ContextCompat.getColor(context, R.color.itemTextGray);
        typedArray.recycle();

    }

    /**
     * 设置传入参数
     *
     * @param context
     */
    private void setAttrs(Context context) {


        if (iconLeftIsVisiable) {
            rightTextView.setVisibility(VISIBLE);
            if (drawable != null) {
                leftIcon.setImageDrawable(drawable);
            }
        } else {
            leftIcon.setVisibility(GONE);
        }


        leftTextView.setText(textLeft);
        leftTextView.setTextColor(colorBlack);
        rightTextView.setTextColor(colorGray);

        if (RightIsVisiable) {
            rightTextView.setText(textRight);
            rightTextView.setCompoundDrawables(null, null, null, null);
        }
    }

    public void setText_left(CharSequence text) {
        leftTextView.setText(textLeft);
        leftTextView.setTextColor(colorBlack);

    }

    public void setText_right(CharSequence text) {
        rightTextView.setText(textLeft);
        rightTextView.setTextColor(colorBlack);

    }

    public TextView getTextLeftView() {
        return leftTextView;
    }
}
