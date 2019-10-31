package com.example.applicationdialogs;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity{
    private TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton = findViewById(R.id.botonid);
        view = findViewById(R.id.text);

        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog.Builder ventana = new AlertDialog.Builder(MainActivity.this);
                ventana.setIcon(R.mipmap.ic_launcher).setTitle(R.string.titulo).setMessage(R.string.texto);
                ventana.setPositiveButton(R.string.afirmacion, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        view.setText("Le has dado a ok!");
                    }
                });

                ventana.setNegativeButton(R.string.negacion, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        view.setText("Le has dado a cancel!");
                    }
                });



                ventana.show();
            }


        });
    }


}
