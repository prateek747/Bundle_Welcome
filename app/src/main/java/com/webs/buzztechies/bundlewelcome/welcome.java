package com.webs.buzztechies.bundlewelcome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Pratoo on 19/09/16.
 */
public class welcome extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("Name");

        Toast.makeText(getApplicationContext(), "Welcome,"+ name, Toast.LENGTH_SHORT).show();
    }
}
