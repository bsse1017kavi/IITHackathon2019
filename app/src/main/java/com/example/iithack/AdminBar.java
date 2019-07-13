package com.example.iithack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.iithack.loginModule.Verifier;

import java.sql.SQLOutput;

public class AdminBar extends AppCompatActivity {

    private EditText adminid;
    private Button submit;
    private String adid;
    private TextView sorry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_bar);

        submit = (Button)findViewById(R.id.submit);
        adminid   = (EditText)findViewById(R.id.adminid);

        submit.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v){
                adid= (String) adminid.getText().toString();
               // System.out.println(adid);
                adid= (String) adminid.getText().toString();
                Verifier verifier = new Verifier();
                verifier.initialize();
                if(verifier.verify(adid))
                {
                    Intent profileActivity = new Intent(AdminBar.this, AdminPanel.class);
                    startActivity(profileActivity);
                    finish();
                }
                else

                {
                    sorry = (TextView) findViewById(R.id.sorry);
                    sorry.setText("ID not found");
                    Toast.makeText(AdminBar.this, "ID not found", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}
