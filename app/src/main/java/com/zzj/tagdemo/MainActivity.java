package com.zzj.tagdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //develop  分支
        //master加一个
        //这是dev   dev  增加东西
        setContentView(R.layout.activity_main);
    }

    public void click(View view){
        startActivity(new Intent(this,Main2Activity.class));
    }
}
