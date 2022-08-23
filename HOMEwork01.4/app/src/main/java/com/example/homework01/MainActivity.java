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
                if(!et_1.getText().toString().isEmpty() && !et_2.getText().toString().isEmpty() &&
                !et_3.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "不对哦，还没填完啦，登入失败:(",
                            Toast.LENGTH_LONG).show(); }
                else {
                    Toast.makeText(MainActivity.this, "就是你了！欢迎回来~",
                            Toast.LENGTH_SHORT).show();
                }

                String 姓名 = et_1.getText().toString();
                String 学号 = et_2.getText().toString();
                tv_5.setText("姓名" + 姓名 + ", 学号" + 学号 + "我爱吕老师的课 :)"  );
            }
        });
    }

}
