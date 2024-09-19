package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {
        private String name;
        private double price;
        private String description;
        private String category;
        private final LocalDate dateAdded;


        public MenuItem (String name, double price, String description, String category, String dateAdded) {
            this.name = name;
            this.price = price;
            this.description = description;
            this.category = category;
            this.dateAdded = LocalDate.parse(dateAdded);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public LocalDate getDateAdded() {
            return dateAdded;
        }

        public Boolean isNewItem() {
        LocalDate today = LocalDate.now();
        double daysOnMenu = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysOnMenu < 30;
        }

        @Override
        public String toString(){
            String checkNew = isNewItem() ? "*** NEW ITEM ***" : "";
            return name + checkNew + "\n" + description + " | $" + price;
        }

}