package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
  ImageView img1,img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=findViewById(R.id.start);
        img2=findViewById(R.id.stop);
    }
    public void changePlay(View view){
        if(view==img1){
            startService(new Intent(this,MyService.class));
        } else if (view==img2) {
            stopService(new Intent(this,MyService.class));

        }

    }
}
