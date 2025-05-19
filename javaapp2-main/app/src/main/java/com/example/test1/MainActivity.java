package com.example.test1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button bt;
    CheckBox ch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        bt=findViewById(R.id.button);
        ch=findViewById(R.id.checkBox);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ch.isChecked())
                    Toast.makeText(getApplicationContext(),"Tiked",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"No Tiked",Toast.LENGTH_SHORT).show();

            }
        });


    }
}