package restaurant;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    //psvm shortcut
    public static void main(String[] args) {


        MenuItem gyro = new MenuItem("Specials","Gyro", 7.99,"Greek item");
        MenuItem taco = new MenuItem("Mexican food","Taco", 8.99,"Greek item");

        ArrayList<MenuItem> fullMenu = new ArrayList<>();
        fullMenu.add(gyro);




        Menu firstMenu = new Menu(fullMenu, new Date());

        //  for(Menu any: menu1.fullMenu) {
        //    System.out.println(any.getName());
        System.out.println(firstMenu);

        firstMenu.newFoodAdded();

        fullMenu.add(taco);
        System.out.println(firstMenu);
    }
}
