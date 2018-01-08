package com.example.ahmed.farzana;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"***||'Welcome to Farzana Dawa Khana'||***", Toast.LENGTH_LONG).show();
        Toast.makeText(this,"Your Most Trusted Personal Herbal Health Care Store and Service Center",Toast.LENGTH_LONG).show();
    }



    public void ourProducts(View view){

        Intent i = new Intent(MainActivity.this,ourProducts.class);
        startActivity(i);

    }

    public void contactUs(View view){

        Intent i = new Intent(MainActivity.this,contactUs.class);
        startActivity(i);
    }

}

