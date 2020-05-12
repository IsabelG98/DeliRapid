package com.example.tourism_ens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class  AdaptadorL extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context contexto;
    String[][] datos;
    int[] datosImg;

    public AdaptadorL(Context contexto, String[][] datos, int[] imagenes) {
        this.contexto = contexto;
        this.datos = datos;
        this.datosImg = imagenes;

        inflater = (LayoutInflater)contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        final View vista = inflater.inflate(R.layout.elemento_lista_l,null);

        TextView nombre = (TextView) vista.findViewById(R.id.textnombre2);
        TextView informacion = (TextView) vista.findViewById(R.id.textinfo2);
        TextView ubicacion = (TextView) vista.findViewById(R.id.textubica2);

        ImageView imagen = (ImageView) vista.findViewById(R.id.imageView2);
        RatingBar calificacion = (RatingBar) vista.findViewById(R.id.ratingBar);

        nombre.setText(datos[i][0]);
        informacion.setText(datos[i][1]);
        imagen.setImageResource(datosImg[i]);
        calificacion.setProgress(Integer.valueOf(datos[i][2]));
        ubicacion.setText(datos[i][3]);
        return vista;

    }


    @Override
    public int getCount() {
        return datosImg.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


}
