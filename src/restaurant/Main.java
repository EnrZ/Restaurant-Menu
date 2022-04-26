package restaurant;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    //psvm shortcut
    public static void main(String[] args) {

        MenuItem gyro = new MenuItem("Specials","Gyro", 7.99,"Greek item");
        MenuItem taco = new MenuItem("Mexican food","Taco", 8.99,"Mexican item");
        MenuItem gyro2 = new MenuItem("Specials","Gyro", 7.99,"Greek item");

        //ArrayList<MenuItem> fullMenu = new ArrayList<>();
        //fullMenu.add(gyro);




        Menu firstMenu = new Menu();

        firstMenu.addItem(gyro);

        //  for(Menu any: menu1.fullMenu) {
        //    System.out.println(any.getName());
        //firstMenu.printItem(taco);



        firstMenu.addItem(taco);
        //firstMenu.printItem(gyro);
        firstMenu.printMenu(firstMenu);


        firstMenu.newFoodAdded();
        firstMenu.addItem(gyro2);

       // System.out.println(firstMenu);
        firstMenu.removeItem(taco);
        firstMenu.printMenu(firstMenu);
        firstMenu.printItem(gyro);
        firstMenu.addItem(gyro);
        System.out.println(gyro.equals(gyro2));
        System.out.println(gyro.equals(taco));
      //  System.out.println(firstMenu);
    }
}
