package com.example.greetings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    TextView txt;
    EditText edit;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=findViewById(R.id.logo);
        txt=findViewById(R.id.textHeading);
        edit=findViewById(R.id.nameInput);
        btn=findViewById(R.id.submitButton);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edit.getText().toString();
                Toast.makeText(MainActivity.this, "happy birthday "+name,Toast.LENGTH_LONG).show();
            }
        });

    }
}