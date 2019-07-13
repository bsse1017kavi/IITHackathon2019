package com.example.iithack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.iithack.loginModule.Verifier;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private TextView login;
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
                    System.out.println("OKK");
                }
                else System.out.println("no");
            }

        });
    }
}
