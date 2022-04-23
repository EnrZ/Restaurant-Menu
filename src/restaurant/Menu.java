package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date dateUpdated;
    //ArrayList<MenuItem> fullMenu = new ArrayList<>();



    public Menu(ArrayList<MenuItem> items, Date dateUpdated) {
        this.items = items;
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "items=" + items +
                ", dateUpdated=" + dateUpdated +
                '}';
    }
//menu should have MenuItem field
    //date as field in menu
    //when new item added to menu, set new to true then everything else sets to false

    //create menu items, call a constructor for menu that will take items, date and add it to menu
    //  public void displayMenu() {
    //  fullMenu.
    // String template = ""
    // }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public void newFoodAdded(){
        for(MenuItem food : this.getItems()){
            food.setNewOrNot(false);
        }
    }

}