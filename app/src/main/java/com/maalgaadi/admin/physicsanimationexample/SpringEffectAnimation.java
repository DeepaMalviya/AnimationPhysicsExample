package com.maalgaadi.admin.physicsanimationexample;

import android.os.Bundle;
import android.support.animation.DynamicAnimation;
import android.support.animation.SpringAnimation;
import android.support.animation.SpringForce;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by admin on 7/24/2017.
 */

public class SpringEffectAnimation extends AppCompatActivity{
    private View view,view1;
    private ImageView imageView;
    private ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring);

        imageView=(ImageView)findViewById(R.id.image);
        SpringForce spring = new SpringForce(0)
                .setDampingRatio(SpringForce.DAMPING_RATIO_LOW_BOUNCY)
                .setStiffness(SpringForce.STIFFNESS_LOW);

        final SpringAnimation animation= new SpringAnimation(imageView, DynamicAnimation.SCALE_X)
                .setMinValue(0).setSpring(spring).setStartValue(1);
        animation.setStartVelocity(5000);
        animation.start();


       /* final SpringAnimation animation1= new SpringAnimation(view1,DynamicAnimation.TRANSLATION_Y);
        animation1.getSpring().setDampingRatio(DAMPING_RATIO_LOW_BOUNCY);*/
/*
        final SpringAnimation anim1X = new SpringAnimation(imageView,
                DynamicAnimation.TRANSLATION_X);
        final SpringAnimation anim1Y = new SpringAnimation(imageView,
                DynamicAnimation.TRANSLATION_Y);
        final SpringAnimation anim2X = new SpringAnimation(imageView1,
                DynamicAnimation.TRANSLATION_X);
        final SpringAnimation anim2Y = new SpringAnimation(imageView1,
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
        });*/

    }


}
