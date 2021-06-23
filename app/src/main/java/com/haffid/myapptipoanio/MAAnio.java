package com.haffid.myapptipoanio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MAAnio extends AppCompatActivity {
    private TextView textoA, textoAB, textoM, textoS, textoD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_anio);

        textoA = findViewById(R.id.txtAnioA);
        textoAB = findViewById(R.id.txtAnioB);
        textoM = findViewById(R.id.txtMes);
        textoS = findViewById(R.id.txtSemana);
        textoD = findViewById(R.id.txtDia);
        this.obtener();
    }

    private void obtener(){
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            String anioa = bundle.getString("an");
                    textoA.setText("Año ingresado: " + anioa);
                    int bi = Integer.parseInt(anioa);
                    if ((bi % 4==0 && bi % 100 !=0) || (bi % 100 == 0 && bi % 400 == 0)){
                        textoAB.setText("Año bisiesto");
                        textoM.setText("Tiene 12 meses");
                        textoS.setText("Tiene 52.2 semanas");
                        textoD.setText("Tiene 366 días");
                    }else {
                        textoAB.setText("El Año no es bisiesto");
                        textoM.setText("Tiene 12 meses");
                        textoS.setText("Tiene 52.1 semanas");
                        textoD.setText("Tiene 365 días");
                    }

        }else {
            Toast.makeText(this, "Dato no encontrado", Toast.LENGTH_SHORT).show();
        }
    }
}