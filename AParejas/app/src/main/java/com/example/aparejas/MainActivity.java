package com.example.aparejas;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    List<Integer> numero = new ArrayList<Integer>();
    int random;
    LinearLayout contenedor;
    LinearLayout lineas[];
    Drawable imagenes[],imagenFondo[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contenedor = findViewById(R.id.contenedor);
        lineas = new LinearLayout[contenedor.getChildCount()];

        for (int i = 0; i < contenedor.getChildCount(); ++i)
            lineas[i] = (LinearLayout) contenedor.getChildAt(i);

        imagenFondo = new Drawable[]{
                getResources().getDrawable(R.drawable.fondo)
        };
        imagenes = new Drawable[] {
                getResources().getDrawable(R.drawable.img1),
                getResources().getDrawable(R.drawable.img2),
                getResources().getDrawable(R.drawable.img3),
                getResources().getDrawable(R.drawable.img4),
                getResources().getDrawable(R.drawable.img5),
                getResources().getDrawable(R.drawable.img6),
                getResources().getDrawable(R.drawable.img7),
                getResources().getDrawable(R.drawable.img8)
        };

        CrearImagenes();
        prepararRandom();
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void empezarJuego(View view) {
        ActivarImagenes();
        PonerImagenes();
    }

    private void CrearImagenes() {
        for (int i = 0 ;i < contenedor.getChildCount(); ++i)
        {
            for(int x = 0 ;x < 4; x++) {
                ImageButton img = new ImageButton(this);

                LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(
                        300, LinearLayout.LayoutParams.WRAP_CONTENT);
                lParams.setMargins(20, 0, 20, 0);

                img.setLayoutParams(lParams);
                img.setScaleType(ImageView.ScaleType.FIT_CENTER);
                img.setImageDrawable(imagenFondo[0]);
                img.setEnabled(false);

                lineas[i].addView(img);
                randomNumero();
                }

            }
        }

    private void prepararRandom() {
        for (int i = 0; i < ((contenedor.getChildCount()*4) / 2); i++) {
            numero.add(i + 1);
            numero.add(i + 1);
        }
    }

    private int randomNumero(){
        int devuelve;
        random = (int) (Math.random()*9);
        devuelve = numero.get(random);
        numero.remove(random);
        return devuelve;
    }

    private void ActivarImagenes() {
        for (int i = 0 ;i < contenedor.getChildCount(); ++i)
        {
            for(int x = 0 ;x < 4; x++) {
                lineas[i].getChildAt(x).setEnabled(true);
            }
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void PonerImagenes() {
        for (int i = 0 ;i < contenedor.getChildCount(); ++i)
        {
            for(int x = 0 ;x < 4; x++) {
                lineas[i].getChildAt(x).setBackground(imagenes[randomNumero()]);
            }
        }
    }

}
