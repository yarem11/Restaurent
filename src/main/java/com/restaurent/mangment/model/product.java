package com.restaurent.mangment.model;

import jakarta.persistence.*;

public class product {
    private String name;
    private String imageUrl;

    public product(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
