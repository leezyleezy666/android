package com.example.homework3_linear;

import android.support.v7.app.AppCompatActivity;
// 提醒同學，以下不能忘記
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 区域变数
    EditText edt_id, edt_pw;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get 介面元件
        edt_id = (EditText) findViewById(R.id.edt_id);
        edt_pw = (EditText) findViewById(R.id.edt_pw);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        // set 共用事件
        btn1.setOnClickListener(btnDoListener);
        btn2.setOnClickListener(btnDoListener);
    }

    private Button.OnClickListener btnDoListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.btn1){
                String 密码=edt_pw.getText().toString();
                String id=edt_id.getText().toString();
                if( 密码.equals("123456")== true  && id.equals("123123") ==true) {
                    Toast toast=Toast.makeText(MainActivity.this, "成功了，功课完成！", Toast.LENGTH_LONG);
                    toast.show();
                }
//                            Toast.makeText(MainActivity.this, "不对哦，还没填完啦，登入失败:",
//                                    Toast.LENGTH_SHORT).show();
                else {
                    Toast toast=Toast.makeText(MainActivity.this, "密碼錯誤，請重新輸入。", Toast.LENGTH_LONG);
                    toast.show();
//                            Toast.makeText(MainActivity.this,
//                                "不对哦，资料还没填完啦，登入失败:(", Toast.LENGTH_LONG).show();
                    edt_pw.setText("");
                }
            }

            else if (v.getId() == R.id.btn2) {
                        AlertDialog.Builder alert = new
                                AlertDialog.Builder(MainActivity.this);
                            alert.setTitle("WARNING!");
                            alert.setMessage("真的确定要关掉我吗？ :(");

                            // 对话框里 加一个 confirm btn
                            alert.setPositiveButton("是的消失吧!", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();  // shut down app.
                                }
                            });
                            alert.setNegativeButton("按错了，按错了", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                      // 如果空着就不会关掉app.
                                }
                            });
                            alert.show();
               }
        }
    };
}
