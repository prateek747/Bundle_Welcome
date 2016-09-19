package com.webs.buzztechies.bundlewelcome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ursrnm;
    EditText pswrd;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        ursrnm= (EditText)findViewById(R.id.urnm);
        pswrd = (EditText)findViewById(R.id.pswrd);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = ursrnm.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("Name", val);
                Intent intent = new Intent(MainActivity.this, welcome.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
