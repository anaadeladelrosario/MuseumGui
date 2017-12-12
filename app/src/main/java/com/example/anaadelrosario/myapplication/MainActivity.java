package com.example.anaadelrosario.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view){


        //Hello message when click
        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(intent);

        Toast.makeText(MainActivity.this,"Hello there" + "!", Toast.LENGTH_SHORT).show();


        Log.i("Start", "Button Pressed!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        }
    }



