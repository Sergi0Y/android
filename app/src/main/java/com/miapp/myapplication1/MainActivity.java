package com.miapp.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText numero;
    TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = (EditText)findViewById(R.id.num);
        mensaje = (TextView) findViewById(R.id.txtMensaje);
    }

    public void verificar(View view) {
        int num;
        num = Integer.parseInt(numero.getText().toString());
        if (num%2==0){
            mensaje.setText("EL numero es par");
        }
        else{
            mensaje.setText("El numero es impar");
        }
    }

}