package com.azeiee.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    Button simpleGravityToast, nestedGravityToast, defaultToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defaultToast = findViewById(R.id.btn_dt);
        simpleGravityToast = findViewById(R.id.btn_st);
        nestedGravityToast = findViewById(R.id.btn_nt);

        defaultToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeText(MainActivity.this,"By default toast...", LENGTH_SHORT).show();
            }
        });

        simpleGravityToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Toast toast = Toast.makeText(MainActivity.this,"simple toast", LENGTH_SHORT);
             toast.setGravity(Gravity.CENTER,0,0);
             toast.show();
            }
        });

        nestedGravityToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(MainActivity.this,"simple toast", LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM| Gravity.RIGHT,0,0);
                toast.show();
            }
        });
    }
}