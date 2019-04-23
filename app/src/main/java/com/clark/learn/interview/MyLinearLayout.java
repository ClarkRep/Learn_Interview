package com.clark.learn.interview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * @author
 * @description
 * @date 2019/3/26
 */
public class MyLinearLayout extends LinearLayout {
    public MyLinearLayout(Context context) {
        super(context);
    }

    public MyLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i("haha", "MyLinearLayout:actionDown");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("haha", "MyLinearLayout:actionMove");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("haha", "MyLinearLayout:actionUp");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.i("haha", "MyLinearLayout:actionCancel");
                break;
            default:
                break;
        }
        return super.onTouchEvent(event);
    }
}
