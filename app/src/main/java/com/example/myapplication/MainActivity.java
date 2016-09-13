package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Boolean startRotate1 = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1Clicked(View view) {
        //((Button) view).setText("AAAAA");
        if(!startRotate1)
            startRotate1 = true;

        if(startRotate1)
            view.setRotationX(view.getRotationX() + 3.0f);

    }
}
