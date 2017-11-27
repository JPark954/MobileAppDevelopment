package com.example.javan.finalprojectapp;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.BounceInterpolator;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    ViewGroup rootContainer ;
    Scene page2;
    Scene page3;
    Transition transitionMgr;




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        ConstraintLayout
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rootContainer =
                (ViewGroup) findViewById(R.id.rootContainer);
        transitionMgr = TransitionInflater.from(this).inflateTransition(R.transition.transition);



        page2 = Scene.getSceneForLayout(rootContainer,
                R.layout.layout_one, this);

        page3 = Scene.getSceneForLayout(rootContainer,
                R.layout.layout_two, this);


    }



    public void goToPage3 (View view)
    {
        TransitionManager.go(page3, transitionMgr);
    }


    public void goToPage2 (View view)
    {
        TransitionManager.go(page2, transitionMgr);
    }
}
