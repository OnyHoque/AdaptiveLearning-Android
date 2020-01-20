package com.development.hoque.adapterlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Sunday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunday);
        Intent intent = getIntent();

        String val = intent.getStringExtra("Key");
        String val2 = intent.getStringExtra("Rat");

        Toast.makeText(this, val+ " " +val2, Toast.LENGTH_LONG).show();
    }
}
