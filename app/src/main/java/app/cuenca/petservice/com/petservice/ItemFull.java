package app.cuenca.petservice.com.petservice;

import java.util.ArrayList;

/**
 * Created by carlosluna on 28/8/17.
 */

public class ItemFull {
    public String id;
    public String animal;
    public String servicio;
    public String clase;
    public String title;
    public String description;
    public float unitCost;
    public int number;
    public float total;

    public ItemFull(String id, String animal, String servicio, String clase, String title, String description, float unitCost, int number, float total) {
        this.id = id;
        this.animal = animal;
        this.servicio = servicio;
        this.clase = clase;
        this.title = title;
        this.description = description;
        this.unitCost = unitCost;
        this.number = number;
        this.total = total;
    }

    public ItemFull(String id, String animal, String servicio, String title, String description, float unitCost, int number, float total) {
        this.id = id;
        this.animal = animal;
        this.servicio = servicio;
        this.clase ="";
        this.title = title;
        this.description = description;
        this.unitCost = unitCost;
        this.number = number;
        this.total = total;
    }
}
