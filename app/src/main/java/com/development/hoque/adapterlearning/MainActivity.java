package com.development.hoque.adapterlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemClickListener{

    ListView l;
    String str[] = {"sunday","monday","tuesday","wednesday","thurday","friday","saturday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = (ListView)findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,str);
        l.setAdapter(adapter);
        l.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position == 0) {
            Intent intent = new Intent(this, Sunday.class);

            String str = "Hi";
            String str2 = str+" again!";

            intent.putExtra("Key", str);
            intent.putExtra("Rat", str2);
            startActivity(intent);
        }
    }
}
