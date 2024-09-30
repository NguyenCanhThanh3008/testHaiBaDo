package com.mains.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productID;

        @NotBlank(message = "Name is required")
        private String name;

        @NotBlank(message = "Category is required")
        private String category;

        @Min(value = 1, message = "Star rating must be at least 1")
        @Max(value = 5, message = "Star rating cannot exceed 5")
        private int star;

        @Positive(message = "Price must be positive")
        private Double price;

        @PositiveOrZero(message = "Discount must be zero or positive")
        private Double discount;

        @NotBlank(message = "Color is required")
        private String color;

        @NotBlank(message = "Size is required")
        private String size;

        @NotBlank(message = "Style is required")
        private String style;

        @Positive(message = "Quantity must be positive")
        private int quantity;

        @NotBlank(message = "Description is required")
        private String description;


    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Img> images;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Review> reviews;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
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

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Img> getImages() {
        return images;
    }

    public void setImages(List<Img> images) {
        this.images = images;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Product [productID=" + productID + ", name=" + name + ", category=" + category + ", star=" + star
                + ", price=" + price + ", discount=" + discount + ", color=" + color + ", size=" + size + ", style="
                + style + ", quantity=" + quantity + ", description=" + description + ", images=" + images
                + ", reviews=" + reviews + "]";
    }

}