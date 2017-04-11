package com.example.cmltdstudent.inclassassignment10_emmal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MonumentsInfo extends AppCompatActivity {

    TextView displayText;
    TextView nameText;
    TextView infoText;
    ImageView image;
    String savedText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monuments_info);

        nameText = (TextView) findViewById(R.id.monument_name);

        infoText = (TextView)  findViewById(R.id.monument_info);

        image = (ImageView) findViewById(R.id.monument_photo);


        Intent i = getIntent();
        Monuments m = (Monuments) i.getSerializableExtra(Keys.MONUMENTS);

        m.getName().toString();
        m.getInfo().toString();
        m.getPhotoId();

        displayText = (TextView) findViewById(R.id.display_text);

        savedText = displayText.getText().toString();


        displayText.setText((m.getName().toString() + "\n" + m.getInfo().toString() + "\n" ));
        image.setImageResource(m.getPhotoId());
    }

}