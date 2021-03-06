package com.icitic.gitlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @author zhangpengfei
 */
public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout llContent = findViewById(R.id.ll_content);
        View view = new View(this);
        llContent.addView(view);
        view.setBackgroundResource(R.color.colorPrimary);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = 90;
        layoutParams.width = LinearLayout.LayoutParams.MATCH_PARENT;
        layoutParams.topMargin = 40;
        view.setLayoutParams(layoutParams);
        btn = findViewById(R.id.btn);
        btn.setText("MainActivity");
        TextView textView = findViewById(R.id.textview);
        textView.setText("MainActivity");
        initData();
    }

    private void initData() {
        btn.setText("i am MainActivity");
    }

    public void goSecondActivity(View view) {
        startActivity(new Intent(this,SecondActivity.class));
    }
}
