package com.example.tourism_ens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class PrincipalComida extends AppCompatActivity {


    ListView lista;


    String[][] datos = {
            {"Taqueria El Trailero","Ricos tacos de azada","10","Av. J, El Sauzal, Ensenada 22760"},
            {"Comedor del pueblo","Platillos mexicanos","9","Lago de Xochimilco 962, Valle Dorado, 22890"},
            {"Menudo Michoacas","Menudo, pozole, birria y mas","8", "Calz. José María Morelos 103, Ex-Ejido Chapultepec, 22785"},
            {"Tacos El Guero","Los mariscos de la zona mas frescos","7","Boulevard Lázaro Cárdenas S/N Col. Centro 22800 Ensenada, Baja California"},
    };


    int[] datosImg = {R.drawable.tacoseltrailero, R.drawable.comedordelpueblo, R.drawable.menudomichoacan, R.drawable.elguero};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_comida);

        lista = (ListView) findViewById(R.id.lvListaC);

        lista.setAdapter(new AdaptadorC(this, datos, datosImg));
    }
}
