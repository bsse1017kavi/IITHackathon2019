package com.example.iithack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class AdminPanel extends AppCompatActivity {

    private CheckBox pdf,image,video;
    private Button button;
    private TextView sorry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_panel);

        pdf = (CheckBox) findViewById(R.id.pdf);
        image = (CheckBox) findViewById(R.id.image);
        video = (CheckBox) findViewById(R.id.video);
        sorry = (TextView) findViewById(R.id.sorry);
        button= (Button) findViewById(R.id.submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(pdf.isChecked() && !image.isChecked() && !video.isChecked()){

                }
                else if(!pdf.isChecked() && image.isChecked() && !video.isChecked()){


                }
                else if (!pdf.isChecked() && !image.isChecked() && video.isChecked()) {

                }

                else
                {
                    sorry = (TextView) findViewById(R.id.sorry);
                    //sorry.setText("ID not found");
                    Toast.makeText(AdminPanel.this, "Chech only one box", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
/*




*
* */