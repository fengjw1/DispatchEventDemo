package com.fengjw.dispatcheventdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private View mView1;
    private RelativeLayout mViewgroup;
    private View mView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mView1 = (View) findViewById(R.id.view1);
//        mView1.setOnClickListener(this);
        mViewgroup = (RelativeLayout) findViewById(R.id.viewgroup);
//        mViewgroup.setOnClickListener(this);
        mView2 = (View) findViewById(R.id.view2);
//        mView2.setOnClickListener(this);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Util.debug("activity dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Util.debug("activity onTouchEvent");
        return super.onTouchEvent(event);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.view1:
                // TODO 18/11/23
                break;
            case R.id.viewgroup:
                // TODO 18/11/23
                break;
            case R.id.view2:
                // TODO 18/11/23
                break;
            default:
                break;
        }
    }
}
