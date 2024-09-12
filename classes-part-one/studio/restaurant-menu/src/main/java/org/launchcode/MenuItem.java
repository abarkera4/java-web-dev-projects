package org.launchcode;

import java.time.LocalDate;

public class MenuItem {
        private String name;
        private double price;
        private String description;
        private String category;
        private final LocalDate dateAdded;

        public MenuItem (String name, double price, String description, String category) {
            this.name = name;
            this.price = price;
            this.description = description;
            this.category = category;
            this.dateAdded = LocalDate.now();
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

}