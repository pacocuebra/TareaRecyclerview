package com.pacuebra.petgram;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
/*
        ImageView imPerro = (ImageView) findViewById(R.id.imPerro);
        TextView tvperro = (TextView)findViewById(R.id.tvperro);

        Bundle bundle = this.getIntent().getExtras();
        imPerro.setImageResource(bundle.getInt("FOTO"));
        tvperro.setText(bundle.getString("NOMBRE"));
 */

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
