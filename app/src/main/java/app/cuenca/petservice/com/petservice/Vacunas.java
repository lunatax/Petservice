package app.cuenca.petservice.com.petservice;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vacunas extends AppCompatActivity {
    ListView lv_vacunas;
//    public static int getStringIdentifier(Context context, String name) {
//        return context.getResources().getIdentifier(name, "string", context.getPackageName());
//    }

    private String getStringResourceByName(String aString) {
        String packageName = getPackageName();
        int resId = getResources()
                .getIdentifier(aString, "string", packageName);
        if (resId == 0) {
            return aString;
        } else {
            return getString(resId);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacunas);

        //Products.cargar();
        String tip_mascota ="PERRO";

        List<Object> lt_data =new ArrayList<Object>();
        Item item_data[] = new Item[]{
                new Item (R.drawable.ic_addcart,getStringResourceByName(((ItemFull)Products.listaPerro.get(0)).title), ((ItemFull)Products.listaPerro.get(0)).description, ((ItemFull)Products.listaPerro.get(0)).unitCost ),
                new Item (R.drawable.ic_addcart,getStringResourceByName(((ItemFull)Products.listaPerro.get(1)).title), ((ItemFull)Products.listaPerro.get(1)).description, ((ItemFull)Products.listaPerro.get(1)).unitCost ),
                new Item (R.drawable.ic_addcart,getStringResourceByName(((ItemFull)Products.listaPerro.get(2)).title), ((ItemFull)Products.listaPerro.get(2)).description, ((ItemFull)Products.listaPerro.get(2)).unitCost ),
                new Item (R.drawable.ic_addcart,getStringResourceByName(((ItemFull)Products.listaPerro.get(3)).title), ((ItemFull)Products.listaPerro.get(3)).description, ((ItemFull)Products.listaPerro.get(3)).unitCost ),
                new Item (R.drawable.ic_addcart,getStringResourceByName(((ItemFull)Products.listaPerro.get(4)).title), ((ItemFull)Products.listaPerro.get(4)).description, ((ItemFull)Products.listaPerro.get(4)).unitCost )

            //new Item (R.drawable.ic_addcart,getString(R.string.puppy),"Descripcion",11),
            //new Item (R.drawable.ic_addcart,getString(R.string.canigen),"Descripcion",11),
            //new Item (R.drawable.ic_addcart,getString(R.string.traque),"Descripcion",13),
            //new Item (R.drawable.ic_addcart,getString(R.string.felingen),"Descripcion",15),
            //new Item (R.drawable.ic_addcart,getString(R.string.rabia),"Descripcion descripcion desfdfdfdfdfdf",14)
        };
        for(Integer i =0; i< item_data.length; i++){
            lt_data.add(item_data[i]);
        }


        ItemAdapter adapter = new ItemAdapter(this,R.layout.lv_item_row, lt_data);


        lv_vacunas = (ListView) findViewById(R.id.lv_v);
        View header = (View) getLayoutInflater().inflate(R.layout.lv_header_row,null);

        TextView tv_header = (TextView) header.findViewById(R.id.tv_header);
        tv_header.setText(getString(R.string.vacuna));



        lv_vacunas.addHeaderView(header);
        lv_vacunas.setAdapter(adapter);

        lv_vacunas.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //TextView v = (TextView) view.findViewById(R.id.tv_title);
                //Toast.makeText(getApplicationContext(),v.getText(),Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"yap estap",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
