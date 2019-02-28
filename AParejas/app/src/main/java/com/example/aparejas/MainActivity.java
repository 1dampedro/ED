package com.example.aparejas;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity{
    LinearLayout contenedor;
    LinearLayout lineas[];
    Drawable imagenes[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contenedor = findViewById(R.id.contenedor);
        lineas = new LinearLayout[contenedor.getChildCount()];

        for (int i = 0; i < contenedor.getChildCount(); ++i)
            lineas[i] = (LinearLayout) contenedor.getChildAt(i);

        imagenes = new Drawable[] {
                getResources().getDrawable(R.drawable.fondo)
        };

        CrearImagenes();
    }

    public void empezarJuego(View view) {
        ActivarImagenes();
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
                img.setImageDrawable(imagenes[0]);
                img.setEnabled(false);

                lineas[i].addView(img);
            }
        }
    }

    private void ActivarImagenes() {
        for (int i = 0 ;i < contenedor.getChildCount(); ++i)
        {
            for(int x = 0 ;x < 4; x++) {
                lineas[i].getChildAt(x).setEnabled(true);
            }
        }
    }
}
