package app.cuenca.petservice.com.petservice;

import java.util.ArrayList;

/**
 * Created by carlosluna on 28/8/17.
 */

public class Cart {
    public static ArrayList<Object> lista = new ArrayList<Object>();
    public static float total=0;

    public static boolean addCart(String id, String animal, String servicio, String title, String descripcion, float unitCost, int number){
        boolean agregado = true;
        for (Object iterador:lista) {
            ItemFull itemCart;
            if (iterador instanceof ItemFull){
                itemCart= (ItemFull) iterador;
                if(itemCart.id== id){
                    agregado = false;
                    break;
                }
            }
        }
        if (agregado == true){
            float totalItem;
            totalItem = unitCost*number;
            ItemFull nuevoItem = new ItemFull(id, animal,servicio, title, descripcion, unitCost, number,totalItem);
            lista.add(nuevoItem);
            getTotal();
        }
        return agregado;
    }

    public static float getTotal(){
        float totalLista =0;
        for (Object iterador:lista) {
            ItemFull itemCart;
            if (iterador instanceof ItemFull){
                itemCart= (ItemFull) iterador;
                totalLista+=itemCart.total;
            }
        }
        total=totalLista;
        return total;
    }

    public static void clearCart(){
        lista.clear();
        total=0;
    }


}
