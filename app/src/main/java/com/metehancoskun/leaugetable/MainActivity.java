package com.metehancoskun.leaugetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public String[] leaugeName={"Premier Leauge","La Liga","Bundesliga","Seria","Super Lig","Ligue 1"};
    public String[] teamName={"Liverpool","Manchester United","Manchester City","Barcelona","Real Madrid","Atletico Madrid","Bayern Munih","Juventus","Besiktas","Paris Saint German"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=findViewById(R.id.listView);
        Bitmap liverpool= BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.liverpool);
        Bitmap manu=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.manu);
        Bitmap city=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.city);
        Bitmap barca=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.barca);
        Bitmap madrid=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.madrid);
        Bitmap amadrid=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.amadrid);
        Bitmap bayern=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.bayern);
        Bitmap juventus=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.juventus);
        Bitmap bjk=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.bjk);
        Bitmap psg=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.psg);
        final ArrayList<Bitmap> image =new ArrayList<>();
        image.add(liverpool);
        image.add(manu);
        image.add(city);
        image.add(barca);
        image.add(madrid);
        image.add(amadrid);
        image.add(bayern);
        image.add(juventus);
        image.add(bjk);
        image.add(psg);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,leaugeName);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
            intent.putExtra("name",teamName[i]);
            startActivity(intent);
            }
        });
    }
}