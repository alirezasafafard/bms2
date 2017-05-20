package com.example.safafard.espbms1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by safafard on 5/14/2017.
 */

public class progress extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_dialog);
        final ImageView progressIMV = (ImageView) findViewById(R.id.IMVprogress);
        final Button btn = (Button) findViewById(R.id.buttone);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog s = new Dialog(progress.this);
                make_anime_for_load makeAnimeForLoad = new make_anime_for_load(progress.this);
                makeAnimeForLoad.loadAnimInDialog(s, R.id.img2,R.layout.progress_dialog2,R.anim.loadanime);
                makeAnimeForLoad.loadAnimInActivity(progressIMV,R.anim.loadanime);
                Handler handler = null;
                handler = new Handler();
                handler.postDelayed(new Runnable(){

                    @Override
                    public void run() {
                        s.cancel();
                        s.dismiss();

                    }
                }, 5000);
            }
        });
    }
    public void makeanimebycode (ImageView imageView){
       // Animation animation = Animation.AnimationListener;

    }
}
