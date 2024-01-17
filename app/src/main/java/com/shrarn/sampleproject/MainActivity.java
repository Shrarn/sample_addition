package com.shrarn.sampleproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtResult;
    AppCompatButton btn_Add;
    EditText num1, num2;
    Float number1,number2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult = findViewById(R.id.txtResult);
        btn_Add = findViewById(R.id.btnAdd);
        num1 = findViewById(R.id.txtNumber1);
        num2 = findViewById(R.id.txtNumber2);

        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().equals("") || num2.getText().equals(""))
                {
                    txtResult.setText("NaN");
                }
                else
                {
                    number1 = Float.parseFloat(num1.getText().toString());
                    number2 = Float.parseFloat(num2.getText().toString());
                    result = number1 + number2;
                    txtResult.setText(""+result);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}