package com.example.iithack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class myProfile extends AppCompatActivity {

    private CheckBox admin;
    private CheckBox normal;
    private Button submit;
    private TextView sorry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        admin=(CheckBox) findViewById(R.id.admin);
        normal=(CheckBox) findViewById(R.id.normal);
        submit =(Button) findViewById(R.id.submit);
        sorry =(TextView) findViewById(R.id.sorry);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(admin.isChecked() && !normal.isChecked()){
                    Intent profileActivity = new Intent(myProfile.this, AdminBar.class);
                    startActivity(profileActivity);
                }
                else if(!admin.isChecked() && normal.isChecked()){
                    Intent profileActivity = new Intent(myProfile.this, NormalUser.class);
                    startActivity(profileActivity);
                    finish();

                }
               else {
                    sorry = (TextView) findViewById(R.id.sorry);
                    //sorry.setText("ID not found");
                    Toast.makeText(myProfile.this, "Chech only one box", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
