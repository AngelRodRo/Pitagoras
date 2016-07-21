package com.example.pitagoras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtCatetoA,edtCatetoB;
    EditText edtHipotenusa,edtPerimetro,edtArea;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCatetoA = (EditText) findViewById(R.id.edtCatetoA);
        edtCatetoB = (EditText) findViewById(R.id.edtCatetoB);

        edtHipotenusa = (EditText) findViewById(R.id.editText3);
        edtPerimetro = (EditText) findViewById(R.id.editText4);
        edtArea = (EditText) findViewById(R.id.editText5);

        btnCalculate = (Button) findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular();
            }
        });

    }

    public void calcular(){
        double catetoC = Math.sqrt( Math.pow(Double.valueOf(edtCatetoA.getText().toString()),2)+Math.pow(Double.valueOf(edtCatetoB.getText().toString()),2));

        edtHipotenusa.setText(String.valueOf(catetoC));
        edtPerimetro.setText( String.valueOf(catetoC+Double.valueOf(edtCatetoA.getText().toString())+ Double.valueOf(edtCatetoB.getText().toString())));
        edtArea.setText(String.valueOf( (Double.valueOf(edtCatetoA.getText().toString())*Double.valueOf(edtCatetoB.getText().toString()))/2 ));

    }
}
