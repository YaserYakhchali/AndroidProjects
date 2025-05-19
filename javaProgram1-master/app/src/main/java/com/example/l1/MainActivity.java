package com.example.l1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    EditText edit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        bt1=findViewById(R.id.button);
        edit1=findViewById(R.id.editTextText);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"salam",Toast.LENGTH_SHORT).show();
                int i = Integer.parseInt(edit1.getText().toString()) * 10;
                Toast.makeText(getApplicationContext(), i + "", Toast.LENGTH_SHORT).show();
               /* String s=edit1.getText()+"";
                int i=Integer.parseInt(s);
                i=i*10;
                Toast.makeText(getApplicationContext(),i +"",Toast.LENGTH_SHORT).show();*/
                //Snackbar.make(v, "دکمه کلیک شد!", Snackbar.LENGTH_SHORT).show();
               Snackbar.make(v, "فایل حذف شد!", Snackbar.LENGTH_LONG)
                        .setAction("برگردوندن", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // اینجا کدی بنویس که فایل برگرده
                                Toast.makeText(getApplicationContext(), "فایل بازگردانی شد.", Toast.LENGTH_SHORT).show();
                            }
                        }).show();

            }
        });

    }
}