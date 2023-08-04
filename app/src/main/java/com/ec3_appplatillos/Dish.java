package com.ec3_appplatillos;

public class Dish {
    private int imageResId;
    private String name;
    private String description;
    private String ingredients;
    private double price;

    public Dish(int imageResId, String name, String description, String ingredients, double price) {
        this.imageResId = imageResId;
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.price = price;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
