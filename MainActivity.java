package com.example.tourism_ens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   Button botonComidas;
   Button botonLugares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonComidas =(Button)findViewById(R.id.btlugarescomida);
        botonComidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguiente = new Intent(MainActivity.this, PrincipalComida.class);
                startActivity(siguiente);
            }
        });

        botonLugares =(Button)findViewById(R.id.btlugaresturisticos);
        botonLugares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguiente = new Intent(MainActivity.this, PrincipalLugar.class);
                startActivity(siguiente);
            }
        });

    }

}
