package com.example.asuma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText num1, num2;
    Button buttonSuma;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.input1);
        num2 = (EditText) findViewById(R.id.input2);
        resultado = (TextView) findViewById(R.id.textResultado);
        buttonSuma = (Button) findViewById(R.id.buttonSuma);
        buttonSuma.setOnClickListener(this);
    }

    public void OnClick(View view){
        int a, b;
        a = Integer.parseInt(num1.getText().toString());
        b = Integer.parseInt(num2.getText().toString());
        int suma = a + b;
        resultado.setText(suma);
    }
}
