package com.example.practicaeddysanchez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {
    TextView mTextview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        mTextview1=(TextView) findViewById(R.id.textView);
        Bundle bundle = this.getIntent().getExtras();
        mTextview1.setText(bundle.getString("dato"));

    }
}
