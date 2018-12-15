package com.example.hp.space;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.jgabrielfreitas.core.BlurImageView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.slider_in_left, R.anim.slide_out_left);
        setContentView(R.layout.activity_new);

        ActionBar actionBar = getSupportActionBar();
        TextView title_main = findViewById(R.id.name_title);
        TextView planetary = findViewById(R.id.mass);
        TextView radum = findViewById(R.id.radium);
        TextView perioddays = findViewById(R.id.period);

        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mPlanet = intent.getStringExtra("PlanetaryMassJpt");
        String mRadiusJpt = intent.getStringExtra("RadiumJpt");
        String mPeriod = intent.getStringExtra("perioddays");

        actionBar.setTitle(mActionBarTitle);
        title_main.setText(mActionBarTitle);
        planetary.setText(mPlanet);
        radum.setText(mRadiusJpt);
        perioddays.setText(mPeriod);
    }
}
