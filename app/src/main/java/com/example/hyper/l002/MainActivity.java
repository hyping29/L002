package com.example.hyper.l002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnStartAty1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartAty1 = (Button) findViewById(R.id.btnStartAty1);
        btnStartAty1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Aty1.class);
//                i.putExtra("txt","Hello Aty1");
                Bundle data = new Bundle();
                data.putString("txt", "Hello Aty1!");
                i.putExtras(data);
                startActivity(i);
            }
        });
        System.out.println("onCreate");
    }
}
