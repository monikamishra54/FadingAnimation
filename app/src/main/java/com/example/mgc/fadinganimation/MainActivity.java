package com.example.mgc.fadinganimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView img,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public  void  fade(View view){
        img=(ImageView) findViewById(R.id.bart1);
        img.animate().alpha(0f).setDuration(2000);

        img2=(ImageView) findViewById(R.id.imageView);
        img2.animate().alpha(1f).setDuration(2000);
    }
}
