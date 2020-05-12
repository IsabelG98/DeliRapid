package com.example.tourism_ens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class PrincipalLugar extends AppCompatActivity {

    ListView lista;


    String[][] datos = {
            {"Las cañadas","Ideal para acampar, albercas","10","Km. 31.5, Ensenada - Lázaro Cárdenas, 22830"},
            {"Los viñedos","Variedad de vistas vinicolas","9","Valle Guadalupe - Viveros, Km 77 Ensenada - Tecate"},
            {"El Malecón","Paseos en barcos y mucho mas","8", "Calz. José María Morelos 103, 22785"},
            {"La Bufadora","Diversión al maximo, vista al mar","7","Calle N, 22819 Ensenada, B.C."},
    };

    int[] datosImg = {R.drawable.canadas, R.drawable.vinedos, R.drawable.malecon, R.drawable.lugar1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_lugar);


        lista = (ListView) findViewById(R.id.lvListaL);

        lista.setAdapter(new AdaptadorL(this, datos, datosImg));
    }
}
