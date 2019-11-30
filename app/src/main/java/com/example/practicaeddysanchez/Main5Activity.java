package com.example.practicaeddysanchez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    EditText mEdittext;
    Button mButtonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        mEdittext=(EditText) findViewById(R.id.parametro);
        mButtonEnviar=(Button) findViewById(R.id.Enviarparametro);
        mButtonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main5Activity.this,Main6Activity.class);
                Bundle bundle=new Bundle();
                bundle.putString("dato", mEdittext.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

}
