package com.example.safafard.espbms1;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/**
 * Created by safafard on 5/17/2017.
 */

public class scrollButton  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll_btn);
        Button btn = (Button) findViewById(R.id.buttonScroll);
        btn.setMovementMethod(new ScrollingMovementMethod());
        /*btn.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

            }
        });
        */
        //btn.onTouchEvent()

    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {

        return super.onTouchEvent(event);
    }
}
