package app.cuenca.petservice.com.petservice;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class IdiomaActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_ingles;
    Button btn_espanol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idioma);

        btn_ingles =(Button) findViewById(R.id.button_ingles);
        btn_espanol =(Button) findViewById(R.id.button_espanol);
        btn_espanol.setOnClickListener(this);
        btn_ingles.setOnClickListener(this);

        // ########################### Importante para cargar los items en memoria ****************
        Products.cargar();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_espanol:
//                Locale localizacion = new Locale("es", "ES");
//                Locale.setDefault(localizacion);
//                Configuration config = new Configuration();
//                config.setLocale(localizacion);
//                getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());

                Intent intent = new Intent(IdiomaActivity.this, tipomascota.class);
                startActivity(intent);
                break;
            case  R.id.button_ingles:
                Intent intent2 = new Intent(IdiomaActivity.this, tipomascota.class);
                startActivity(intent2);
                break;
        }
    }
}
