package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.second_activity);
        //receiving data
        Intent i = getIntent();
        int id = i.getIntExtra("id",0);
        //second argument is default value
        String name = i.getStringExtra("name");
        String address = i.getStringExtra("address");

        //Displaying received data in TextView
        TextView txt = findViewById(R.id.text2);
        txt.setText("Id = " +id+"\n"+"Name = "+name+"\n"+"Address = "+address);


    }
}
