package edu.umb.intento_1_practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class primera extends AppCompatActivity {

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saludar(View v){
        TextView t1 = findViewById(R.id.tNom1);
        String nombre1 = t1.getText().toString();

        Intent i = new Intent(primera.this, segunda.class);
        i.putExtra("nom",nombre1);
        startActivity(i);
    }
}