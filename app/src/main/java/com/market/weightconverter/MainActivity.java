package com.market.weightconverter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.market.weightconverter.R;

public class MainActivity extends AppCompatActivity {

    private EditText editTextKg;
    private TextView textViewGrams;
    private Button buttonConvert, buttonGoToTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextKg = findViewById(R.id.editTextKg);
        textViewGrams = findViewById(R.id.textViewGrams);
        buttonConvert = findViewById(R.id.buttonConvert);
        buttonGoToTemp = findViewById(R.id.buttonGoToTemp);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kgText = editTextKg.getText().toString();
                if (!kgText.isEmpty()) {
                    double kg = Double.parseDouble(kgText);
                    double grams = kg * 1000;
                    textViewGrams.setText(grams + " grams");
                }
            }
        });

        buttonGoToTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.market.weightconverter.Degtocel.class);
                startActivity(intent);
            }
        });
    }
}
