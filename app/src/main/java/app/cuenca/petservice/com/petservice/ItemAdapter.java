package app.cuenca.petservice.com.petservice;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by carlosluna on 30/7/17.
 */

public class ItemAdapter extends ArrayAdapter<Object> {
    Context context;
    int resource;
    //Item data[]=null;
    List <Object> data;

    public ItemAdapter(Context context, int resource, List <Object> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource = resource;
        this.data=objects;
    }

    public View getView(final int position, View converView, ViewGroup parent){
        View row = converView;

        if(getItem(position) instanceof Header){
            if (row==null){
                LayoutInflater inflater =((Activity)context).getLayoutInflater();
                row = inflater.inflate(R.layout.lv_header, null);
                TextView textView = (TextView) row.findViewById(R.id.tv_header);
                Header header = (Header) getItem(position);
                textView.setText(header.getTitle());
            }
        }else{
            ItemHolder itemHolder=null;
            if (row==null){
                LayoutInflater inflater =((Activity)context).getLayoutInflater();
                row = inflater.inflate(resource,parent,false);
                itemHolder = new ItemHolder();
                itemHolder.imagen=(ImageView) row.findViewById(R.id.ib_add);
                itemHolder.titulo =(TextView) row.findViewById(R.id.tv_title);
                itemHolder.descripcion =(TextView) row.findViewById(R.id.tv_description);
                itemHolder.costo =(TextView) row.findViewById(R.id.tv_cost);
                row.setTag(itemHolder);
            }else{
                itemHolder = (ItemHolder)row.getTag();
            }
            Item  item =(Item) data.get(position);
            itemHolder.titulo.setText(item.title);
            itemHolder.descripcion.setText(item.description);
            itemHolder.costo.setText("$"+Float.toString(item.cost));
            itemHolder.imagen.setImageResource(item.icon);
            ImageButton  ib_add = (ImageButton) row.findViewById(R.id.ib_add);
            ib_add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    showDialogCarro(position);
                }
            });
        }



        return row;
    }
    public void showDialogCarro(final int position){

        LayoutInflater inflater =((Activity)context).getLayoutInflater();


        View otherLayout = LayoutInflater.from((Activity)context).inflate(R.layout.add_carro,null);

        View layout = inflater.inflate(R.layout.add_carro, (ViewGroup) otherLayout.findViewById(R.id.cont_add_carro));

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(layout);
        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.dismiss();
                Toast.makeText((Activity)context,"boton aceptar con id"+position,Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int id) {
                // User cancelled the dialog
                dialogInterface.dismiss();
            }
        });
        builder.create();
        builder.show();
    }

    static class ItemHolder{
        ImageView imagen;
        TextView titulo;
        TextView descripcion;
        TextView costo;

    }
}
