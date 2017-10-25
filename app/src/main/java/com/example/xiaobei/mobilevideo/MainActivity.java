package com.example.xiaobei.mobilevideo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import org.w3c.dom.Text;

/*主页面*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.main_text);
        tv.setTextSize(30);
        tv.setText("我是主页面");
        tv.setGravity(Gravity.CENTER);
        tv.setTextColor(Color.RED);
    }
}
