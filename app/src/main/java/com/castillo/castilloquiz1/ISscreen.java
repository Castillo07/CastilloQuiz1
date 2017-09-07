package com.castillo.castilloquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ISscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isscreen);
    }

    public void buttonClickFunctionhomeis(View view)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void buttonClickFunctionistocs(View view)
    {
        Intent intent = new Intent(getApplicationContext(), CSscreen.class);
        startActivity(intent);
    }

    public void buttonClickFunctionistoIT(View view)
    {
        Intent intent = new Intent(getApplicationContext(), ITscreen.class);
        startActivity(intent);
    }

}
