package app.cuenca.petservice.com.petservice;

/**
 * Created by carlosluna on 7/8/17.
 */

public class Header {
    private String title;




    public Header() {
        super();
    }

    public Header(String title) {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
}
