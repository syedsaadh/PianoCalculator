package com.example.materialcalculator;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by syedaamir on 11-04-2016.
 */
public class buttons extends Button {

    public buttons(Context context) {
        super(context);
        setFont();

    }

    public buttons(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public buttons(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setFont();
    }

    private void setFont() {
        Typeface normal = Typeface.createFromAsset(getContext().getAssets(), "fonts/PoiretOne-Regular.ttf");
        setTypeface(normal, Typeface.NORMAL);

    }
}