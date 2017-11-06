package com.example.lenovo.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double num1 = 0;
    private double num2 = 0;
    private EditText editText;
    private TextView textView;
    private String opt = "+";
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            editText = (EditText)findViewById(R.id.editView);
            textView = (TextView)findViewById(R.id.showView);
            Button btn = (Button)view;
            try{
                switch (btn.getId())
                {
                    case R.id.button_1:
                    {
                        if(opt == "0")
                            editText.setText("");
                        String str = editText.getText().toString();
                        editText.setText(str+1);
                        str = editText.getText().toString();
                        textView.setText(str);
                        opt = "1";
                        break;
                    }
                    case R.id.button_2:
                    {
                        if(opt == "0")
                            editText.setText("");
                        String str = editText.getText().toString();
                        editText.setText(str+2);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.button_3:
                    {
                        if(opt == "0")
                            editText.setText("");
                        String str = editText.getText().toString();
                        editText.setText(str+3);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.button_4:
                    {
                        if(opt == "0")
                            editText.setText("");
                        String str = editText.getText().toString();
                        editText.setText(str+4);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.button_5:
                    {
                        if(opt == "0")
                            editText.setText("");
                        String str = editText.getText().toString();
                        editText.setText(str+5);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.button_6:
                    {
                        if(opt == "0")
                            editText.setText("");
                        String str = editText.getText().toString();
                        editText.setText(str+6);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.button_7:
                    {
                        if(opt == "0")
                            editText.setText("");
                        String str = editText.getText().toString();
                        editText.setText(str+7);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.button_8:
                    {
                        if(opt == "0")
                            editText.setText("");
                        String str = editText.getText().toString();
                        editText.setText(str+8);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.button_9:
                    {
                        if(opt == "0")
                            editText.setText("");
                        String str = editText.getText().toString();
                        editText.setText(str+9);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.button_0:
                    {
                        if(opt == "0")
                            editText.setText("");
                        String str = editText.getText().toString();
                        editText.setText(str+0);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.button_point:
                    {
                        String str = editText.getText().toString();
                        if(str.indexOf(".") != -1)
                        {}
                        else
                        {
                            if(str.equals("0"))
                                editText.setText(("0" + ".").toString());
                            else if(str.equals(""))
                            {}
                            else
                            {
                                editText.setText(str + ".");
                            }
                        }
                        break;
                    }
                    case R.id.button_add:
                    {
                        String str = editText.getText().toString();
                        num1 = Double.parseDouble(str);
                        opt = "+";
                        textView.setText(num1 + opt);
                        editText.setText("");
                        break;
                    }
                    case R.id.button_sub:
                    {
                        String str = editText.getText().toString();
                        num1 = Double.parseDouble(str);
                        opt = "-";
                        editText.setText("");
                        textView.setText(num1 + opt);
                        break;
                    }
                    case R.id.button_mul:
                    {
                        String str = editText.getText().toString();
                        num1 = Double.parseDouble(str);
                        opt = "*";
                        editText.setText("");
                        textView.setText(num1 + opt);
                        break;
                    }
                    case R.id.button_div:
                    {
                        String str = editText.getText().toString();
                        num1 = Double.parseDouble(str);
                        opt = "/";
                        editText.setText("");
                        textView.setText(num1 + opt);
                    }
                    case R.id.button_equ:
                    {
                        if(opt == "+")
                        {
                            String str = editText.getText().toString();
                            num2 = Double.parseDouble(str);
                            textView.setText(num1 + opt + num2 + "=");
                            editText.setText((num1 + num2) + "");
                        }
                        else if(opt == "-")
                        {
                            String str = editText.getText().toString();
                            num2 = Double.parseDouble(str);
                            textView.setText(num1 + opt + num2 + "=");
                            editText.setText((num1 - num2) + "");
                        }
                        else if(opt == "*")
                        {
                            String str = editText.getText().toString();
                            num2 = Double.parseDouble(str);
                            textView.setText(num1 + opt + num2 + "=");
                            editText.setText((num1 * num2) + "");
                        }
                        else if(opt == "/")
                        {
                            String str = editText.getText().toString();
                            num2 = Double.parseDouble(str);
                            if(num2 == 0)
                            {
                                editText.setText("");
                                textView.setText("除数不能为零");
                                break;
                            }
                            else
                            {
                                textView.setText(num1 + opt + num2 + "=");
                                editText.setText((num1/num2) + "");
                            }
                        }
                        opt = "0";
                        break;
                    }
                    case R.id.button_CE:
                    {
                        String str = editText.getText().toString();
                        if(str.length() > 0)
                            editText.setText(" ");
                        break;
                    }
                    case R.id.button_Back:
                    {
                        String str = editText.getText().toString();
                        if(str.length() > 0)
                            editText.setText(str.substring(0,str.length()-1));
                        break;
                    }
                }
            }catch (Exception e){}
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.button_1);
        Button button2 = (Button)findViewById(R.id.button_2);
        Button button3 = (Button)findViewById(R.id.button_3);
        Button button4 = (Button)findViewById(R.id.button_4);
        Button button5 = (Button)findViewById(R.id.button_5);
        Button button6 = (Button)findViewById(R.id.button_6);
        Button button7 = (Button)findViewById(R.id.button_7);
        Button button8 = (Button)findViewById(R.id.button_8);
        Button button9 = (Button)findViewById(R.id.button_9);
        Button button0 = (Button)findViewById(R.id.button_0);
        Button buttonAdd = (Button)findViewById(R.id.button_add);
        Button buttonSub = (Button)findViewById(R.id.button_sub);
        Button buttonMul = (Button)findViewById(R.id.button_mul);
        Button buttonDiv = (Button)findViewById(R.id.button_div);
        Button buttonEqu = (Button)findViewById(R.id.button_equ);
        Button buttonCE = (Button)findViewById(R.id.button_CE);
        Button buttonBack = (Button)findViewById(R.id.button_Back);
        Button buttonPoint = (Button)findViewById(R.id.button_point);
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);
        button7.setOnClickListener(listener);
        button8.setOnClickListener(listener);
        button9.setOnClickListener(listener);
        button0.setOnClickListener(listener);
        buttonAdd.setOnClickListener(listener);
        buttonSub.setOnClickListener(listener);
        buttonMul.setOnClickListener(listener);
        buttonDiv.setOnClickListener(listener);
        buttonEqu.setOnClickListener(listener);
        buttonCE.setOnClickListener(listener);
        buttonBack.setOnClickListener(listener);
        buttonPoint.setOnClickListener(listener);
    }
}
