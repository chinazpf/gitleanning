package com.icitic.gitlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view = new View(this);
        view.setBackgroundResource(R.color.colorAccent);
        Button btn = findViewById(R.id.btn);
        btn.setText("MainActivity");
    }

    public void goSecondActivity(View view) {
        startActivity(new Intent(this,SecondActivity.class));
    }
}
