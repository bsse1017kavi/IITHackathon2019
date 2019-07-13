package com.example.iithack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.iithack.loginModule.Verifier;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private TextView login;
    private TextView sorry;
    private EditText eid;
    private Button button;
    private  String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        login = (TextView) findViewById(R.id.login);
        login.setText("Welcome to UNDP employee login");

        button = (Button)findViewById(R.id.button);
        eid   = (EditText)findViewById(R.id.eid);

        button.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v){
                id= (String) eid.getText().toString();
                Verifier verifier = new Verifier();
                verifier.initialize();
                if(verifier.verify(id))
                {
                    Intent profileActivity = new Intent(MainActivity.this, myProfile.class);
                    startActivity(profileActivity);
                    finish();
                }
                else

                {
                    sorry = (TextView) findViewById(R.id.sorry);
                    sorry.setText("ID not found");
                    Toast.makeText(MainActivity.this, "ID not found", Toast.LENGTH_SHORT).show();
                }
            }

        });


    }
}
