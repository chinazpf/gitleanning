package com.icitic.gitlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * @author zhangpengfei
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout llContent = findViewById(R.id.ll_content);
        View view = new View(this);
        view.setBackgroundResource(R.color.colorPrimary);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = 45;
        layoutParams.width = 45;
        view.setLayoutParams(layoutParams);
        llContent.addView(view);
        Button btn = findViewById(R.id.btn);
        btn.setText("MainActivity");
    }

    public void goSecondActivity(View view) {
        startActivity(new Intent(this,SecondActivity.class));
    }
}
