package com.example.fernando.helpme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends DebugActivity implements View.OnClickListener {

    Button btnContato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnContato = (Button) findViewById(R.id.btnContato);
        btnContato.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this, ContatoActivity.class);
        startActivity(it);
    }


}
