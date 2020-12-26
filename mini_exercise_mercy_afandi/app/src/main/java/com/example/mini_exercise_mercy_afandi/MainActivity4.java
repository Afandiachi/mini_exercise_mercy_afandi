package com.example.mini_exercise_mercy_afandi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    private Button returnToMain2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        returnToMain2=findViewById(R.id.button6);
        returnToMain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain3();
            }
        });
    }
    public void openMain3(){
        Intent intent6=new Intent(this,MainActivity.class);
        startActivity(intent6);
    }
}