package com.example.linear_layout033;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox check1, check2, check3, check4;
    Button btn;
    RadioGroup radioG;
    RadioButton rbtn1, rbtn2, rbtn3;
    String var1, var2;
    TextView tv_test1, tv_test2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get 介面元件
        check1 = (CheckBox) findViewById(R.id.check1);
        check2 = (CheckBox) findViewById(R.id.check2);
        check3 = (CheckBox) findViewById(R.id.check3);
        check4 = (CheckBox) findViewById(R.id.check4);
        btn = (Button) findViewById(R.id.btn);
        rbtn1 = (RadioButton) findViewById(R.id.rbtn1);
        rbtn2 = (RadioButton) findViewById(R.id.rbtn2);
        rbtn3 = (RadioButton) findViewById(R.id.rbtn3);
        radioG = (RadioGroup) findViewById(R.id.radioG);
        tv_test1 = (TextView) findViewById(R.id.tv_test1);
        tv_test2 = (TextView) findViewById(R.id.tv_test2);


        // set 共用事件
        btn.setOnClickListener(Listener);
        check1.setOnCheckedChangeListener(myListener);
        check2.setOnCheckedChangeListener(myListener);
        check3.setOnCheckedChangeListener(myListener);
        check4.setOnCheckedChangeListener(myListener);
        radioG.setOnCheckedChangeListener(radGroupListener);
    }

    private CheckBox.OnCheckedChangeListener myListener=
            new CheckBox.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged (CompoundButton buttonView,boolean isChecked) {
            int n=0;
            String selected="";
            String s1 ="", s2 ="", s3 ="", S4 ="";
            if (check1.isChecked()) {
                n++;
                s1=check1.getText().toString() + " ";
            } else {
                s1=" ";
            }

            if (check2.isChecked()) {
                n++;
                s2=check2.getText().toString() + " ";
            } else {
                s2=" ";
            }

            if (check3.isChecked()) {
                n++;
                s3=check3.getText().toString() + " ";
            } else {
                s3=" ";
            }

            if (check4.isChecked()) {
                n++;
                S4 =check4.getText().toString() + " ";
            } else {
                S4=" ";
            }

            selected = s1 + s2 + s3 + S4;
            Toast.makeText(MainActivity.this, "你点的主菜包括了："+ selected +"总共" + n + "个。", Toast.LENGTH_SHORT).show();
            tv_test1.setText("你点的主菜包括了："+ selected +"总共" + n + "个。");

            var1 = ("你点的主菜包括了："+ selected +"总共" + n + "个。") ;
        }
    };

    private RadioGroup.OnCheckedChangeListener radGroupListener=
            new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged (RadioGroup group,int checkedId) {
//                    int  p = group.indexOfChild((RadioButton) findViewById(checkedId));	// 選項的索引值

                    if (checkedId == R.id.rbtn1)
                        tv_test2.setText(  "你点的点心是：" + rbtn1.getText());
//                        Toast.makeText(MainActivity.this, "你点的点心是：" + rbtn1.getText() , Toast.LENGTH_SHORT).show();
                    else if (checkedId == R.id.rbtn2)
                        tv_test2.setText(  "你点的点心是： "+ rbtn2.getText());
//                        Toast.makeText(MainActivity.this, "你点的点心是：" + rbtn1.getText() , Toast.LENGTH_SHORT).show();
                    else if (checkedId == R.id.rbtn3)
                        tv_test2.setText(  "你点的点心是： "+ rbtn3.getText());
//                        Toast.makeText(MainActivity.this, "你点的点心是：" + rbtn1.getText() , Toast.LENGTH_SHORT).show();

                    var2 = var1 + "\n" + tv_test2;
                }
            };


//    btn.setOnClickListener Listener(new View.OnClickListener() {
//        @Override
//        public void onClick
//    })
    private Button.OnClickListener Listener = new Button.OnClickListener() {
        @Override
        public void  onClick(View v) {
            Toast.makeText(MainActivity.this, var2, Toast.LENGTH_SHORT).show();
        }
    };



}
