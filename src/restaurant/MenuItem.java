package restaurant;

import java.util.Objects;

public class MenuItem {
    private String category;
    private String name;
    private double price;
    private String description;
    private boolean newOrNot = true;

    public MenuItem(String category, String name, double price, String description){
        this.category = category;
        this.name = name;
        this.price = price;
        this.description = description;
        //this.newOrNot = newOrNot;
    }

    private String getCategory() {
        return category;
    }

    private void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isNewOrNot() {
        return newOrNot;
    }

    public void setNewOrNot(boolean newOrNot) {
        this.newOrNot = newOrNot;
    }

    public void printNames() {
        System.out.println("Names:"  );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 && category.equals(menuItem.category) && name.equals(menuItem.name) && description.equals(menuItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name, price, description);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", newOrNot=" + newOrNot +
                '}';
    }
}