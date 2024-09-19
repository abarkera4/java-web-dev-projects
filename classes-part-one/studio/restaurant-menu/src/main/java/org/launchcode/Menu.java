package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> dishes = new ArrayList<>();
    private LocalDate lastUpdated;

    public ArrayList<MenuItem> getItems() {
        return dishes;
    }

    @Override
    public String toString() {
        StringBuilder appetizer = new StringBuilder();
        for (MenuItem item : dishes) {
            if (item.getCategory().equals("appetizer")) {
                appetizer.append("\n").append(item).append("\n");
            }
        }
        StringBuilder entree = new StringBuilder();
        for (MenuItem item : dishes) {
            if (item.getCategory().equals("entree")) {
                entree.append("\n").append(item).append("\n");
            }
        }
        StringBuilder dessert = new StringBuilder();
        for (MenuItem item : dishes) {
            if (item.getCategory().equals("dessert")) {
                dessert.append("\n").append(item).append("\n");
            }
        }

        return "\nSTUDIO FOOD PLACE\n" +
                "\n*** Appetizers ***" + appetizer.toString() + "\n" +
                "\n*** Appetizers ***" + appetizer.toString() + "\n" +
                "\n*** Appetizers ***" + appetizer.toString() + "\n";
    }

    void addDish(MenuItem newItem) {
        dishes.add(newItem);
        lastUpdated = LocalDate.now();
    }

    void removeDish(MenuItem removeItem) {
        dishes.remove(removeItem);
        lastUpdated = LocalDate.now();
    }
}
