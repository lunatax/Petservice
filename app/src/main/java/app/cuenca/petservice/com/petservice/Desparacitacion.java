package app.cuenca.petservice.com.petservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Desparacitacion extends AppCompatActivity {
    ListView lv_desp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desparacitacion);


        List<Object> lt_data =new ArrayList<Object>();
        Item item_data[]=new Item[]{
                new Item (R.drawable.ic_addcart,getString(R.string.hasta5),"Descripcion1",8),
                new Item (R.drawable.ic_addcart,getString(R.string.hasta10),"Descripcion1",10),
                new Item (R.drawable.ic_addcart,getString(R.string.hasta15),"Descripcion1",13),
                new Item (R.drawable.ic_addcart,getString(R.string.hasta20),"Descripcion",16),
                new Item (R.drawable.ic_addcart,getString(R.string.hasta25),"Descripcion",17),
                new Item (R.drawable.ic_addcart,getString(R.string.hasta30),"Descripcion",20),
                new Item (R.drawable.ic_addcart,getString(R.string.mas30),"Descripcion",22)
        };


        for(Integer i =0; i< item_data.length; i++){
            lt_data.add(item_data[i]);
        }


        ItemAdapter adapter = new ItemAdapter(this,R.layout.lv_item_row, lt_data);
        lv_desp = (ListView) findViewById(R.id.lv_desp);

        View header = (View) getLayoutInflater().inflate(R.layout.lv_header_row,null);
        TextView tv_header = (TextView) header.findViewById(R.id.tv_header);
        tv_header.setText(getString(R.string.desparacitacion));

        lv_desp.addHeaderView(header);

        lv_desp.setAdapter(adapter);

    }
}
