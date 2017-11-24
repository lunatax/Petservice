package app.cuenca.petservice.com.petservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Antipulgas extends AppCompatActivity {
    ListView lv_antipul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antipulgas);

        String tip_mascota ="PERRO";

        List<Object> lt_data =new ArrayList<Object>();
        Item item_data_1mes[]=new Item[]{
                new Item (R.drawable.ic_addcart,getString(R.string.hasta10),"Descripcion1",8),
                new Item (R.drawable.ic_addcart,getString(R.string.hasta20),"Descripcion",12),
                new Item (R.drawable.ic_addcart,getString(R.string.hasta30),"Descripcion",15),
                new Item (R.drawable.ic_addcart,getString(R.string.mas30),"Descripcion",17)
        };
        Item item_data_3mes[]=new Item[]{
                new Item (R.drawable.ic_addcart,getString(R.string.hasta10),"Descripcion1",12),
                new Item (R.drawable.ic_addcart,getString(R.string.hasta20),"Descripcion",13),
                new Item (R.drawable.ic_addcart,getString(R.string.hasta30),"Descripcion",17),
                new Item (R.drawable.ic_addcart,getString(R.string.mas30),"Descripcion",19)
        };

        lt_data.add(new Header(getString(R.string.unmes)));
        for(Integer i =0; i< item_data_1mes.length; i++){
            lt_data.add(item_data_1mes[i]);
        }
        lt_data.add(new Header(getString(R.string.tresmeses)));
        for(Integer i =0; i< item_data_3mes.length; i++){
            lt_data.add(item_data_3mes[i]);
        }

        ItemAdapter adapter = new ItemAdapter(this,R.layout.lv_item_row, lt_data);
        lv_antipul = (ListView) findViewById(R.id.lv_antipul);
        View header = (View) getLayoutInflater().inflate(R.layout.lv_header_row,null);

        TextView tv_header = (TextView) header.findViewById(R.id.tv_header);
        tv_header.setText(getString(R.string.antipulgas));

        lv_antipul.addHeaderView(header);
        lv_antipul.setAdapter(adapter);

        

    }
}
