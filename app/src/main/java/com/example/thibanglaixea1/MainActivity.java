package com.example.thibanglaixea1;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnimationDrawable animation = new AnimationDrawable();
        animation.addFrame(getResources().getDrawable(R.drawable.icon_menu), 10000);
        animation.addFrame(getResources().getDrawable(R.drawable.icon_start), 50000);
        animation.setOneShot(false);

        ImageView imageAnim =  (ImageView) findViewById(R.id.image_view);
        imageAnim.setBackgroundDrawable(animation);

        // start the animation!
        animation.start();






    }
}
