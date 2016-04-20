package com.chyss.airpureanim;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	ImageView mouth,mouthBig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mouth = (ImageView) findViewById(R.id.circle_image);
        mouth.setAnimation(AnimationUtils.loadAnimation(this, R.anim.mouthanim));
        
        mouthBig = (ImageView) findViewById(R.id.circle_image_big);
        mouthBig.setAnimation(AnimationUtils.loadAnimation(this, R.anim.mouth_biganim));
    }
}
