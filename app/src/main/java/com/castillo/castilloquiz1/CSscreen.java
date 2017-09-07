package com.castillo.castilloquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CSscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csscreen);
    }


    public void buttonClickFunctionhomecs(View view)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void buttonClickFunctioncstoit(View view)
    {
        Intent intent = new Intent(getApplicationContext(), ITscreen.class);
        startActivity(intent);
    }

    public void buttonClickFunctioncstois(View view)
    {
        Intent intent = new Intent(getApplicationContext(), ISscreen.class);
        startActivity(intent);
    }


}



