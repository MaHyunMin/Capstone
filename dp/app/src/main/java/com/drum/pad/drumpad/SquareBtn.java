package com.drum.pad.drumpad;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

public class SquareBtn extends Button {

    public SquareBtn(Context context) {
        super(context);
    }

    public SquareBtn(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareBtn(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);

        width = Math.min(width, height);
        height = width;

        setMeasuredDimension(width, height);
    }
}