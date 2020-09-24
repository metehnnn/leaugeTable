package com.metehancoskun.leaugetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView imageView=findViewById(R.id.imageView);
        TextView nameText=findViewById(R.id.nameText);

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        nameText.setText(name);
    }
}