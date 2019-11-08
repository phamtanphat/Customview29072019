package com.example.customview29072019;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DefaultSolarItem extends RelativeLayout {

    private EditText mEdt;
    private TextView mTextCell;

    private String mValeCell;

    public DefaultSolarItem(Context context) {
        super(context);
        init(null);
    }

    public DefaultSolarItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public DefaultSolarItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attributeSet) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.item_edit_default_solor_panel,this,true);
        mapview(view);
        loadAttrsView(attributeSet);
        setupView();
    }


    private void mapview(View view) {
        mEdt = view.findViewById(R.id.edittextDefaultSolar);
        mTextCell = view.findViewById(R.id.textviewValueDefaultSolar);
    }
    private void loadAttrsView(AttributeSet attributeSet) {
        if (attributeSet == null) return;
        TypedArray typedArray =  getContext().obtainStyledAttributes(attributeSet,R.styleable.DefaultSolarItem);
        mValeCell = typedArray.getString(R.styleable.DefaultSolarItem_textValueCell);
        typedArray.recycle();
    }

    private void setupView() {
        mTextCell.setText(mValeCell);
    }

}
