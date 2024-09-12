package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> items = new ArrayList<>();
    private LocalDate lastUpdated;

    public ArrayList<MenuItem> getItems() {
        return items;
    }
}