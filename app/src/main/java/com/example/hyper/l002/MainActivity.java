package com.example.hyper.l002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvOut;
    private Button btnStartAty1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        btnStartAty1 = (Button) findViewById(R.id.btnStartAty1);
        btnStartAty1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Aty1.class);
//                i.putExtra("txt","Hello Aty1");
                Bundle data = new Bundle();
                data.putString("txt", "Hello Aty1!");
                i.putExtras(data);
//                startActivity(i); // TODO: 2016/7/31  启动另一个Activty
                startActivityForResult(i, 0);// TODO: 2016/7/31 启动另一个ACtivty 有返回值
            }
        });
        System.out.println("onCreate");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String txt = data.getStringExtra("result");
        tvOut.setText(txt);
        super.onActivityResult(requestCode, resultCode, data);
    }
}
