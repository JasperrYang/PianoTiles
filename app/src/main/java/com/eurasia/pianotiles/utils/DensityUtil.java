package com.eurasia.pianotiles.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.WindowManager;

/**
 * 2018.06.19 别踩白快
 */

public class DensityUtil {
    // 将设备独立像素设置为普通的px像素
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    // 将普通的px像素设置为独立像素
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    // 获取手机的尺寸
    public static int[] getPhoneSize(Context context) {
        DisplayMetrics dm = new DisplayMetrics();
        WindowManager mWindowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        mWindowManager.getDefaultDisplay().getMetrics(dm);
        return new int[] { dm.widthPixels, dm.heightPixels };
    }

    //获取手机尺寸，传入参数：WindowManager
    //WindowManager是外界访问Window的入口
    public static int[] getPhoneSize(WindowManager mWindowManager) {
        DisplayMetrics dm = new DisplayMetrics();
        mWindowManager.getDefaultDisplay().getMetrics(dm);
        return new int[] { dm.widthPixels, dm.heightPixels };
    }
    // 尺寸转换：sp转px
    public static int sp2px(Context context, float spVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, spVal,
                context.getResources().getDisplayMetrics());
    }

}
