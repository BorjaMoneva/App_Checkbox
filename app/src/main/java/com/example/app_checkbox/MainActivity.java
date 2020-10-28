package com.example.app_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    CheckBox cb1, cb2, cb3, cb4;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.txt_nombre);
        et2 = (EditText) findViewById(R.id.txt_apellido);
        cb1 = (CheckBox) findViewById(R.id.cb_java);
        cb2 = (CheckBox) findViewById(R.id.cb_python);
        cb3 = (CheckBox) findViewById(R.id.cb_c);
        cb4 = (CheckBox) findViewById(R.id.cb_kotlin);
        tv = (TextView) findViewById(R.id.tv_info);
    }

    public void mostrarINformacion(View view) {
        String nombre = et1.getText().toString();
        String apellido = et2.getText().toString();
        String java = cb1.getText().toString();
        String python = cb2.getText().toString();
        String kotlin = cb4.getText().toString();
        String C = cb3.getText().toString();

        int contador = 0;
        String respuesta = "";
        if (nombre.isEmpty() && apellido.isEmpty() || nombre.isEmpty() | apellido.isEmpty()) {
            Toast.makeText(this, "Debes rellenar el nombre y el apellido",Toast.LENGTH_LONG).show();
        } else {
            String aux = nombre + " " + apellido + " ha usado: ";
            if (cb1.isChecked()) {
                respuesta = respuesta + java + ", ";
                contador++;
            }
            if (cb2.isChecked()) {
                respuesta = respuesta + python + ", ";
                contador++;
            }
            if (cb4.isChecked()) {
                respuesta = respuesta + kotlin + ", ";
                contador++;
            }
            if (cb3.isChecked()) {
                respuesta = respuesta + C + ", ";
                contador++;
            }
            if (contador == 0) {
                tv.setText(aux + " no sabe programar nada");
            } else {
                tv.setText(aux + respuesta + " un total de " + contador);
            }

        }
    }
}