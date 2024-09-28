package com.mains.Entity;

import jakarta.persistence.*;

@Entity
public class Img {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imgID;

    private String link;

    @ManyToOne
    @JoinColumn(name = "productID")
    private Product product;

    public Long getImgID() {
        return imgID;
    }

    public void setImgID(Long imgID) {
        this.imgID = imgID;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
