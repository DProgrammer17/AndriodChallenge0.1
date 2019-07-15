package com.example.alc4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class ProActivity extends AppCompatActivity {

    ViewFlipper profile_flipper;

            @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        int images [] = {R.drawable.slider1, R.drawable.slider2, R.drawable.slider3, R.drawable.slider4, R.drawable.slider5, R.drawable.slider6, R.drawable.slider7 };


        profile_flipper = findViewById(R.id.profile_flipper);


        //loop
                for(int i =0; i < images.length; i++){
                     flipperImage(images[i]);
                }
                /*foreach
                for (int image: images){
                    flipperImage(image);
                }*/
            }



            public void flipperImage (int image){
                ImageView imageView = new ImageView(this);
                imageView.setBackgroundResource(image);

                profile_flipper.addView(imageView);
                profile_flipper.setFlipInterval(4000);//4sec
                profile_flipper.setAutoStart(true);

                //animation
                profile_flipper.setInAnimation(this, android.R.anim.slide_in_left);
                profile_flipper.setOutAnimation(this, android.R.anim.slide_out_right);




            }
}
