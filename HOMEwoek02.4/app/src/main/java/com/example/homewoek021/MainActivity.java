package com.example.homewoek021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtATM;
    Button btn7, btn8, btn9, btnDiv;
    Button btn4, btn5, btn6, btnMulti;
    Button btn1, btn2, btn3, btnNeg;
    Button btnClear, btn0, btnEqual, btnPlus;
    Integer num1, num2;
    Boolean isEnd = false;
    Integer method;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //取得介面元件
        edtATM=(EditText)findViewById(R.id.edtATM);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnMulti=(Button)findViewById(R.id.btnMulti);
        btnNeg=(Button)findViewById(R.id.btnNeg);
        btnEqual=(Button)findViewById(R.id.btnEqual);
        btnClear=(Button)findViewById(R.id.btnClear);
        btnPlus=(Button)findViewById(R.id.btnPlus);

        //設定共用事件
        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
        btn3.setOnClickListener(listener);
        btn4.setOnClickListener(listener);
        btn5.setOnClickListener(listener);
        btn6.setOnClickListener(listener);
        btn7.setOnClickListener(listener);
        btn8.setOnClickListener(listener);
        btn9.setOnClickListener(listener);
        btn0.setOnClickListener(listener);
        btnClear.setOnClickListener(listener);
        btnNeg.setOnClickListener(listener);
        btnPlus.setOnClickListener(listener);
        btnDiv.setOnClickListener(listener);
        btnEqual.setOnClickListener(listener);
        btnMulti.setOnClickListener(listener);
    }

    private Button.OnClickListener listener=new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (isEnd == true){
                edtATM.setText("");
                isEnd = false;
            }

            switch(v.getId()) {
                case R.id.btn1:  //按 1 鈕
                    displayScreen("1");
                    break;
                case R.id.btn2:  //按 2 鈕
                    displayScreen("2");
                    break;
                case R.id.btn3:  //按 3 鈕
                    displayScreen("3");
                    break;
                case R.id.btn4:  //按 4 鈕
                    displayScreen("4");
                    break;
                case R.id.btn5:  //按 5 鈕
                    displayScreen("5");
                    break;
                case R.id.btn6:  //按 6 鈕
                    displayScreen("6");
                    break;
                case R.id.btn7:  //按 7 鈕
                    displayScreen("7");
                    break;
                case R.id.btn8:  //按 8 鈕
                    displayScreen("8");
                    break;
                case R.id.btn9:  //按 9 鈕
                    displayScreen("9");
                    break;
                case R.id.btn0:  //按 0 鈕
                    displayScreen("0");
                    break;
                case R.id.btnClear:  //按 清除 鈕
                    String str=edtATM.getText().toString();
                    if(str.length()>0) {
                        str=str.substring(0, str.length()-1);
                        edtATM.setText(str);
                    }
                    break;

                case R.id.btnEqual:  //按 = 鈕
                    // 這裡要設計程式碼，當按下「=」按鍵後，再將第二個數字存入第二個變數
                    num2 = Integer.parseInt(edtATM.getText().toString());
                    calculateNumber();
                    break;

                case R.id.btnPlus:  //按 + 鈕
                    // 這裡要設計程式碼，按下「+」號按鍵，將第一個數字存入第一個變數，清除輸入文字框
                    num1 = Integer.parseInt(edtATM.getText().toString());
                    edtATM.setText("");
                    method=1;
                    break;

                case R.id.btnNeg:  //按 - 鈕
                    num1 = Integer.parseInt(edtATM.getText().toString());
                    edtATM.setText("");
                    method=2;
                    break;

                case R.id.btnMulti:  //按 * 鈕
                    num1 = Integer.parseInt(edtATM.getText().toString());
                    edtATM.setText("");
                    method=3;
                    break;

                case R.id.btnDiv:  //按 / 鈕
                    num1 = Integer.parseInt(edtATM.getText().toString());
                    edtATM.setText("");
                    method=4;
                    break;

        }
    };

    private void displayScreen(String s) {
        // 這裡要設計一段程式碼，在你按下的數字鍵後，輸入文字框中會出現你選擇的數字
        // 可以參考之前的程式碼範例，想想看怎麼弄？
        String str=edtATM.getText().toString();
        edtATM.setText(str + s);

    }

    private void calculateNumber() {
        Float ans=0f;
        // 這裡要設計一段程式碼，將第一個與第二個變數加起來，最後將結果顯示在文字框裡
        // 請善加利用上面那個FinalNumber變數，請注意！他是浮點數！
        // 記得要轉型！


        switch(method) {
            case 1:
                ans=num1.floatValue() + num2.floatValue();
                break;
            case 2:
                ans=num1.floatValue() - num2.floatValue();
                break;
            case 3:
                ans=num1.floatValue() * num2.floatValue();
                break;
            case 4:
                ans=num1.floatValue() / num2.floatValue();
                break;
        }
        edtATM.setText(ans.toString());
        isEnd = true;
    }
};
}
