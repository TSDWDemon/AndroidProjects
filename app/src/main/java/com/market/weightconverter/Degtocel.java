package com.market.weightconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.market.weightconverter.R;

public class Degtocel extends AppCompatActivity {

    private EditText editTextCelsius;
    private TextView textViewFahrenheit;
    private Button buttonConvertBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degtocel);

        editTextCelsius = findViewById(R.id.editTextCelsius);
        textViewFahrenheit = findViewById(R.id.textViewFahrenheit);
        buttonConvertBack = findViewById(R.id.buttonConvertBack);

        buttonConvertBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String celsiusText = editTextCelsius.getText().toString();
                if (!celsiusText.isEmpty()) {
                    double celsius = Double.parseDouble(celsiusText);
                    double fahrenheit = (celsius * 9/5) + 32;
                    textViewFahrenheit.setText(fahrenheit + " °F");
                }
            }
        });
    }
}
