package com.example.safafard.espbms1;

import android.app.Dialog;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by safafard on 5/16/2017.
 */

public class make_anime_for_load {
    private Context context;
    public make_anime_for_load(Context context){
        this.context = context;
    }
    public void loadAnimInDialog(Dialog dialog,int idImage,int layout,int intAnime){//anime =-1 is not have anime
        Animation animation = AnimationUtils.loadAnimation(context,intAnime);
        dialog.setContentView(layout);
        ImageView imageView = (ImageView) dialog.findViewById(idImage);
        imageView.startAnimation(animation);
        dialog.show();
    }
    public void loadAnimInActivity(ImageView imageView,int intAnime){
        Animation animation = AnimationUtils.loadAnimation(context,intAnime);
        imageView.startAnimation(animation);
    }

    public void cancelAnimInDialog(Dialog dialog){
        dialog.cancel();
        dialog.dismiss();
    }
    public void cancelAnimInActivity(ImageView imageView){
        ///// TODO: 5/16/2017 stop anim in Imageview
    }
}
