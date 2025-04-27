package com.example.statistics;

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
        TextView answer = findViewById(R.id.result);
        EditText editText = findViewById(R.id.ediText1);
        ArrayList<Double> numbers = new ArrayList<Double>();

        Button Add = findViewById(R.id.add);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();
                double decimalValue = 0.0;
                if (input.isEmpty()) {
                    editText.setError("This field cannot be empty!");
                } else {
                    decimalValue = Double.parseDouble(input);
                }
                numbers.add(decimalValue);
                editText.setText("");
            }
        });

        Button Mean = findViewById(R.id.mean);
        Mean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0; i<numbers.size(); i++){
                    answer.setText(numbers.get(i)+" ");
                }
            }
        });

    }
}