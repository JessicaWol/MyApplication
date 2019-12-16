package com.example.myapplication.Model;

import java.util.List;

public class Products {
    private String name;
    private String brand;
    private String price_sign;
    private String description;
    private String product_type;
    private String currency;
    private String category;
    private String image_link;
    private String product_link;
    private String website_link;
    private double price;
    private double rating;


    public String getPrice_sign() {
        return price_sign;
    }

    public void setPrice_sign(String price_sign) {
        this.price_sign = price_sign;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getProduct_type() {
        return product_type;
    }
    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    public String getProduct_link() {
        return product_link;
    }

    public void setProduct_link(String product_link) {
        this.product_link = product_link;
    }

    public String getWebsite_link() {
        return website_link;
    }
    public void setWebsite_link(String website_link) {
        this.website_link = website_link;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}

