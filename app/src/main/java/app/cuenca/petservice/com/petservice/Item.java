package app.cuenca.petservice.com.petservice;

/**
 * Created by carlosluna on 30/7/17.
 */

public class Item {
    public int icon;
    public String title;
    public String description;
    public float cost;

    public Item(){
        super();
    }
    public Item(int icon, String title, String description, float cost){
        this.icon = icon;
        this.title = title;
        this.description = description;
        this.cost=cost;
    }
}
