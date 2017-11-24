package app.cuenca.petservice.com.petservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class servicios extends AppCompatActivity implements View.OnClickListener{
    Button btn_vacuna;
    Button btn_despara;
    Button btn_antipul;
    Button btn_aseo;
    Button btn_consulta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);
        btn_vacuna = (Button) findViewById(R.id.button_vacuna);
        btn_despara = (Button) findViewById(R.id.button_despara);
        btn_antipul = (Button) findViewById(R.id.button_antipul);
        btn_aseo = (Button) findViewById(R.id.button_aseo);
        btn_consulta = (Button) findViewById(R.id.button_consulta);

        btn_vacuna.setOnClickListener(this);
        btn_despara.setOnClickListener(this);
        btn_antipul.setOnClickListener(this);
        btn_aseo.setOnClickListener(this);
        btn_consulta.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_vacuna:
                Intent intent = new Intent(servicios.this, Vacunas.class);
                startActivity(intent);
                break;
            case R.id.button_despara:
                Intent intent2 = new Intent(servicios.this, Desparacitacion.class);
                startActivity(intent2);
                break;
            case R.id.button_antipul:
                Intent intent3 = new Intent(servicios.this, Antipulgas.class);
                startActivity(intent3);
                break;
            case R.id.button_aseo:
                Intent intent4 = new Intent(servicios.this, Aseo.class);
                startActivity(intent4);
                break;
            case R.id.button_consulta:
                Intent intent5 = new Intent(servicios.this, consulta.class);
                startActivity(intent5);
                break;
        }
    }
}
