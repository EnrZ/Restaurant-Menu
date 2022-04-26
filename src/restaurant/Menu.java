package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.time.Instant;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date dateUpdated;
    //ArrayList<MenuItem> fullMenu = new ArrayList<>();

    public Menu(){
        this.items = new ArrayList<>();
        //this.dateUpdated = Date.from(Instant.now());
        Date specific = new Date();
        //this.dateUpdated = specific.getMilliseconds();
    }

    public Menu(ArrayList<MenuItem> items, Date dateUpdated) {
        this.items = items;
        this.dateUpdated = dateUpdated;
    }

    public void addItem(MenuItem newMenuItem){
        //this.items.add(newMenuItem);
        //this.dateUpdated = Date.from(Instant.now());
        for(MenuItem menuItem: this.items){
            if(newMenuItem.equals(menuItem)){
                System.out.println("This item already exists!");
                return;
            }
        }

        //the return will make it so that a duplicate will stop this method before getting to te line where it adds
        this.items.add(newMenuItem);

        this.dateUpdated = new Date();
    }

    public void removeItem(MenuItem newMenuItem){
        this.items.remove(newMenuItem);
    }

    public void printItem(MenuItem item){
        System.out.println(item.toString());
    }

    public void printMenu(Menu fullMenu){
        System.out.println(fullMenu.toString());
    }

    @Override
    public String toString() {
        return "Menu|||" +
                "items=" + items +
                ", dateUpdated=" + dateUpdated +
                "|||\n" ;
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