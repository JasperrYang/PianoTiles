package com.czp.pianotiles.element;

import android.graphics.Color;

/**
 * 
 * 2018/6/14
 **/

public class Score {
    private static final int SPAN = 1;
    private int mNumber;
    //边框宽度
    private float mTextSize = 60;
    //描边宽度
    private float mStrokeWidth = 20;
    //白块颜色
    private int mTextColor = Color.RED;

    public void update() {
        mNumber = mNumber + SPAN;
    }

    public String getNumber() {
        return String.valueOf(mNumber);
    }

    public void setNumber(int number) {
        mNumber = number;
    }

    public float getStrokeWidth() {
        return mStrokeWidth;
    }

    public void setStrokeWidth(float strokeWidth) {
        mStrokeWidth = strokeWidth;
    }


    public float getTextSize() {
        return mTextSize;
    }

    public int getTextColor() {
        return mTextColor;
    }

    public void setTextColor(int textColor) {
        mTextColor = textColor;
    }

    public void setTextSize(float textSize) {
        mTextSize = textSize;
    }
}
