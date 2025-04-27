package com.example.statistics;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Double> numbers;
    TextView answer = findViewById(R.id.result);
    Calculate calc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        numbers = new ArrayList<Double>();
        calc = new Calculate(numbers);

    }

    public void doAdd(View v){
        EditText e = (EditText)findViewById(R.id.editText1);
        String value = e.getText().toString();
        Double d = Double.parseDouble(value);
        numbers.add(d);
        e.setText("");
    }

    public void getMean(View view) {
        double mean = calc.calcMean();
        answer.setText("Mean = "+mean);
    }

    public void getVariance(View view) {
        double variance = calc.calcVariance();
        answer.setText("Variance = "+variance);
    }

    public void getStdDev(View view) {
        double stdDev = calc.calcStdDev();
        answer.setText("Std Dev = "+stdDev);
    }
}