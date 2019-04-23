package com.clark.learn.interview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * @author
 * @description
 * @date 2019/3/26
 */
public class MyButton extends Button {

    String text;

    public MyButton(Context context) {
        super(context);
        text = getText().toString();
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        text = getText().toString();
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        text = getText().toString();
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i("haha", text + ":actionDown");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i("haha", text + ":actionMove");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("haha", text + ":actionUp");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.i("haha", text + ":actionCancel");
                break;
            default:
                break;
        }

        return super.onTouchEvent(event);
    }
}
