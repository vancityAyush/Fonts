package com.ak11.fonts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Typeface font2 = Typeface.createFromAsset(getAssets(),"fonts/fontFofb.ttf");
        Typeface font3 = Typeface.createFromAsset(getAssets(),"fonts/fontSummer.ttf");
        Typeface font1 = Typeface.createFromAsset(getAssets(),"fonts/font1.ttf");
        Typeface font = ResourcesCompat.getFont(this,R.font.font1);

        TextView txtView = findViewById(R.id.textView);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){

                    case R.id.radioButton1:
                        txtView.setTypeface(font);
                        break;
                    case R.id.radioButton2:
                        txtView.setTypeface(font2);
                        break;
                    case R.id.radioButton3:
                        txtView.setTypeface(font3);

                }
            }
        });


    }
}