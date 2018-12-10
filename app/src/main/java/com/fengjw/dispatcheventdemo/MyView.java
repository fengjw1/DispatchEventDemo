package com.fengjw.dispatcheventdemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Util.debug("MyView1 dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Util.debug("MyView1 onTouchEvent");
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Util.debug("MyView1 ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                Util.debug("MyView1 ACTION_UP");
                break;
        }
//        return true;
        return super.onTouchEvent(event);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Util.debug("MyView1 ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                Util.debug("MyView1 ACTION_UP");
                break;
        }
        return super.onKeyDown(keyCode, event);
    }
}
