package com.example.zadatak2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText e;
    private EditText d;
    private EditText E;
    private EditText D;
    private TextView ED;
    private TextView DD;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e = findViewById(R.id.editTextEvri);
        d = findViewById(R.id.editTextDolari);
        E = findViewById(R.id.editTextKursE);
        D = findViewById(R.id.editTextKursD);
        ED = findViewById(R.id.textViewEuD);
        DD = findViewById(R.id.textViewDuD);
    }

    public void pretvoriEvro(View view)
    {
        double iznosE = Double.parseDouble(e.getText().toString());
        double kurs = Double.parseDouble(E.getText().toString());
        double rez = iznosE * kurs;
        ED.setText(String.valueOf(rez));
    }

    public void pretvoriDolar(View view)
    {
        double iznosD = Double.parseDouble(d.getText().toString());
        double kurs = Double.parseDouble(D.getText().toString());
        double rez = iznosD * kurs;
        DD.setText(String.valueOf(rez));
        DD.setText(String.valueOf(rez));
    }
    
}