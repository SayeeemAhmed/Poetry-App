package com.example.poetryapp;

import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =findViewById(R.id.listID);

        String[] poems=getResources().getStringArray(R.array.poem);

        Adapter adapter=new ArrayAdapter<String>(this,R.layout.sampleview,R.id.textID,poems);
        listView.setAdapter((ListAdapter) adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){

                    startActivity(new Intent(MainActivity.this,poem1.class));

                }else if (position==1){

                }

                else if (position==2){

                }

                else if (position==3){

                }
                else{

                }

            }
        });


    }
}