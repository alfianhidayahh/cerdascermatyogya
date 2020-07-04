package com.example.aplikascerdascermat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout mlinePilGan, mLineEssay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlinePilGan = (LinearLayout) findViewById(R.id.pilihanganda);
        mLineEssay = (LinearLayout) findViewById(R.id.essay);

        mlinePilGan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, kuisPilihanGanda.class);
                startActivity(i);
            }
        });

        mLineEssay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, kuisEssay.class);
                startActivity(i);
            }
        });
    }
}
