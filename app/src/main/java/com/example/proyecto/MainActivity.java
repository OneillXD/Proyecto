package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView barberiaTextView ;
    EditText barberiaEditText;
    public void buttonPress (View view){
        Log.i("info", "buttonPress: ");
        barberiaEditText = findViewById(R.id.barberiaEditText);
        String barberiaString = barberiaEditText.getText().toString();
        barberiaTextView.setText(barberiaString);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        barberiaTextView = findViewById(R.id.barberiaEditText);
        barberiaTextView.setText("barberiaxd");
    }
}