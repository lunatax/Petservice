package app.cuenca.petservice.com.petservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tipomascota extends AppCompatActivity implements View.OnClickListener {
    Button btn_perro;
    Button btn_gato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipomascota);
        btn_perro = (Button) findViewById(R.id.button_perro);
        btn_gato = (Button) findViewById(R.id.button_gato);
        btn_perro.setOnClickListener(this);
        btn_gato.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_perro:
                Intent intent = new Intent(tipomascota.this, servicios.class);
                startActivity(intent);
                break;
            case R.id.button_gato:
                Intent intent2 = new Intent(tipomascota.this, servicios.class);
                startActivity(intent2);
                break;
        }
    }
}
