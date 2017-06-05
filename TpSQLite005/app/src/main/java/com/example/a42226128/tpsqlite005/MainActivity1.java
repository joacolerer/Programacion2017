package com.example.a42226128.tpsqlite005;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {
    Button btnInsertar;
    Button btnEliminar;
    Button btnActualizar;
    Button btnIrA3Act;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        ObtenerReferencias();
        SetearListeners();
    }
    private View.OnClickListener btnInsertar_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast msg = Toast.makeText(getApplicationContext(), "btnInsert", Toast.LENGTH_LONG);
            msg.show();
        }
    };
    private View.OnClickListener btnEliminar_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast msg = Toast.makeText(getApplicationContext(), "btnEliminar", Toast.LENGTH_LONG);
            msg.show();
        }
    };
    private View.OnClickListener btnActualizar_Click= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast msg = Toast.makeText(getApplicationContext(), "btnActualizar", Toast.LENGTH_LONG);
            msg.show();
        }
    };
    private View.OnClickListener btnIrA3Act_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast msg = Toast.makeText(getApplicationContext(), "btnIrA3Act", Toast.LENGTH_LONG);
            msg.show();
        }
    };
    private void ObtenerReferencias(){
        btnInsertar = (Button) findViewById(R.id.btnInsert);
        btnEliminar = (Button) findViewById(R.id.btnEliminar);
        btnActualizar = (Button) findViewById(R.id.btnActualizar);
        btnIrA3Act = (Button) findViewById(R.id.btnVisualizarRegistros);
    }

    private void SetearListeners(){
        btnInsertar.setOnClickListener(btnInsertar_Click);
        btnEliminar.setOnClickListener(btnEliminar_Click);
        btnActualizar.setOnClickListener(btnActualizar_Click);
        btnIrA3Act.setOnClickListener(btnIrA3Act_Click);
    }
}
