package com.example.exerciseapp01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2, editText3, editText4;
    TextView textViewOrderRead, textViewOrderAscending, textViewOrderDescending;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);

        textViewOrderRead = findViewById(R.id.textViewOrderRead);
        textViewOrderAscending = findViewById(R.id.textViewOrderAscending);
        textViewOrderDescending = findViewById(R.id.textViewOrderDescending);

        buttonSubmit = findViewById(R.id.buttonSubmit);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOrders();
            }
        });
    }

    private void displayOrders() {
        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();
        String value3 = editText3.getText().toString();
        String value4 = editText4.getText().toString();

        // Exibir a ordem lida
        textViewOrderRead.setText("Ordem lida: " + value1 + ", " + value2 + ", " + value3 + ", " + value4);

        // Converter para inteiros para classificar
        Integer[] values = {Integer.parseInt(value1), Integer.parseInt(value2), Integer.parseInt(value3), Integer.parseInt(value4)};

        // Ordenar em ordem crescente
        Arrays.sort(values);
        textViewOrderAscending.setText("Ordem crescente: " + Arrays.toString(values));

        // Ordenar em ordem decrescente
        Arrays.sort(values, Collections.reverseOrder());
        textViewOrderDescending.setText("Ordem decrescente: " + Arrays.toString(values));
    }
}