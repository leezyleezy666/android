package com.example.homework01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_1;
    EditText et_2;
    EditText et_3;
    TextView tv_5;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_1 = (EditText) findViewById(R.id.et_1);
        et_2 = (EditText) findViewById(R.id.et_2);
        et_3 = (EditText) findViewById(R.id.et_3);
        btn = (Button) findViewById(R.id.btn);
        tv_5 = (TextView) findViewById(R.id.tv_5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String 姓名 = et_1.getText().toString();
                String 学号 = et_2.getText().toString();
                String 密码 = et_3.getText().toString();
                tv_5.setText("姓名" + 姓名 + ", 学号" + 学号 + ", 密码：" + 密码);
            }
        });
    }

    private Button.OnClickListener listener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()) {
            case R.id.btn:
                        if (et_3.equals("107153025")) {
                            Toast toast=Toast.makeText(MainActivity.this,
                                    "密码准确，欢迎使用 :)", Toast.LENGTH_LONG);
                            toast.show();
                        }
                        else {
                            Toast toast= Toast.makeText(MainActivity.this,
                                    "密码错误，忘记了？", Toast.LENGTH_LONG);
                            toast.show();
                            et_3.setText("??");
                        }
                }
            };
    };
}
