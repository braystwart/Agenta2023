package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btGuardar(View view){
        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        EditText txtApellido = (EditText)findViewById(R.id.txtApellido);
        RadioButton rbMascu = (RadioButton) findViewById(R.id.rbMascu);
        String genero;
        if (rbMascu.isChecked())
            genero = "estimado";
        else
            genero = "estimada";

        Toast.makeText(this.getApplicationContext().getApplicationContext(),
                "Hola, "+ genero + " "txtNombre.getText().toString() + " " + txtApellido.getText().toString(), Toast.LENGTH_LONG).show();

    }
}