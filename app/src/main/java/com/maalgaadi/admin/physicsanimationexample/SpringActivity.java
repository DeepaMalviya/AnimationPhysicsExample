package com.maalgaadi.admin.physicsanimationexample;

import android.os.Bundle;
import android.support.animation.DynamicAnimation;
import android.support.animation.SpringAnimation;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class SpringActivity extends AppCompatActivity {
     private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring);

        imageView=(ImageView)findViewById(R.id.image);

       /* final SpringAnimation animation= new SpringAnimation(view,DynamicAnimation.TRANSLATION_Y);
        animation.getSpring().setDampingRatio(DAMPING_RATIO_LOW_BOUNCY);*/

       /* final SpringAnimation animation1= new SpringAnimation(view1,DynamicAnimation.TRANSLATION_Y);
        animation1.getSpring().setDampingRatio(DAMPING_RATIO_LOW_BOUNCY);*/

        final SpringAnimation anim1X = new SpringAnimation(imageView,
                DynamicAnimation.TRANSLATION_X);
        final SpringAnimation anim1Y = new SpringAnimation(imageView,
                DynamicAnimation.TRANSLATION_Y);
        final SpringAnimation anim2X = new SpringAnimation(imageView,
                DynamicAnimation.TRANSLATION_X);
        final SpringAnimation anim2Y = new SpringAnimation(imageView,
                DynamicAnimation.TRANSLATION_Y);
        anim1X.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public void onAnimationUpdate(DynamicAnimation animation, float value, float velocity) {
                anim2X.animateToFinalPosition(value);
            }
        });
        anim1Y.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public void onAnimationUpdate(DynamicAnimation animation, float value, float velocity) {
                anim2Y.animateToFinalPosition(value);
            }
        });

    }
}
