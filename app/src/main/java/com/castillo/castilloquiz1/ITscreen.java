package com.castillo.castilloquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ITscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itscreen);
    }

    public void buttonClickFunctionhomeit(View view)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void buttonClickFunctionittocs(View view)
    {
        Intent intent = new Intent(getApplicationContext(), CSscreen.class);
        startActivity(intent);
    }

    public void buttonClickFunctionittois(View view)
    {
        Intent intent = new Intent(getApplicationContext(), ISscreen.class);
        startActivity(intent);
    }

}
