package edu.umb.intento_1_practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class segunda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        TextView tNom2 = (TextView)findViewById(R.id.tNom2);
        String n = getIntent().getStringExtra("nom");
        tNom2.setText(n);
    }
}