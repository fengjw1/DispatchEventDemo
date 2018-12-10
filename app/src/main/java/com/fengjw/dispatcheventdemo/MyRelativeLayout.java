package com.fengjw.dispatcheventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class MyRelativeLayout extends RelativeLayout {

    public MyRelativeLayout(Context context) {
        super(context);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Util.debug("MyRelativeLayout dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Util.debug("MyRelativeLayout onInterceptTouchEvent");
//        return super.onInterceptTouchEvent(ev);
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Util.debug("MyRelativeLayout onTouchEvent");

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Util.debug("MyRelativeLayout MotionEvent.ACTION_DOWN:");
                break;
            case MotionEvent.ACTION_UP:
                Util.debug("MyRelativeLayout MotionEvent.ACTION_UP:");
                break;
        }
        return super.onTouchEvent(event);
//        return true;
    }
}
