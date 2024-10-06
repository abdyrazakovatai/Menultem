package org.example.java15.model;

import java.math.BigDecimal;

public class Menultem {
    private String name;
    private String image;
    private BigDecimal price;
    private String description;
    private boolean isVegetarian;

    public Menultem() {
    }

    public Menultem(String name, String image, BigDecimal price, String description, boolean isVegetarian) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.description = description;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return "org.example.java15.model.Menultem{" +
               "name='" + name + '\'' +
               ", image='" + image + '\'' +
               ", price=" + price +
               ", description='" + description + '\'' +
               ", isVegetarian=" + isVegetarian +
               '}';
    }
}
