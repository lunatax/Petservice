package app.cuenca.petservice.com.petservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Aseo extends AppCompatActivity {
    ListView lv_aseo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aseo);

        List<Object> lt_data =new ArrayList<Object>();
        Item item_data[]=new Item[]{
                new Item (R.drawable.ic_addcart,getString(R.string.hasta5),"Descripcion1",8),
                new Item (R.drawable.ic_addcart,getString(R.string.hasta10),"Descripcion1",10),
                new Item (R.drawable.ic_addcart,getString(R.string.hasta15),"Descripcion1",12),
                new Item (R.drawable.ic_addcart,getString(R.string.hasta20),"Descripcion",14),
                new Item (R.drawable.ic_addcart,getString(R.string.hasta25),"Descripcion",16),
                new Item (R.drawable.ic_addcart,getString(R.string.hasta30),"Descripcion",18),
                new Item (R.drawable.ic_addcart,getString(R.string.mas30),"Descripcion",20)
        };


        for(Integer i =0; i< item_data.length; i++){
            lt_data.add(item_data[i]);
        }


        ItemAdapter adapter = new ItemAdapter(this,R.layout.lv_item_row, lt_data);
        lv_aseo = (ListView) findViewById(R.id.lv_aseo);

        View header = (View) getLayoutInflater().inflate(R.layout.lv_header_row,null);
        TextView tv_header = (TextView) header.findViewById(R.id.tv_header);
        tv_header.setText(getString(R.string.aseo));

        lv_aseo.addHeaderView(header);

        lv_aseo.setAdapter(adapter);
    }
}
