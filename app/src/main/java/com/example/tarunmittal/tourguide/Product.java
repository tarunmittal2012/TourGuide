package com.example.tarunmittal.tourguide;

public class Product {

    String productName;

    String productAddress;

    String productWebsite;

    String proudctDescription;

    int productImage;

    float productRating;

    public Product(String productName, String productAddress, String productWebsite, int productImage, float productRating, String proudctDescription) {

        this.productName = productName;
        this.productAddress = productAddress;
        this.productWebsite = productWebsite;
        this.productImage = productImage;
        this.productRating = productRating;
        this.proudctDescription = proudctDescription;

    }

    public Product(String productName, String proudctDescription, int productImage) {

        this.productName = productName;
        this.proudctDescription = proudctDescription;
        this.productImage = productImage;
    }

    public String getProductName() {

        return productName;
    }

    public void setProductName(String productName) {

        this.productName = productName;
    }

    public String getProudctDescription() {

        return proudctDescription;
    }

    public void setProudctDescription(String proudctDescription) {

        this.proudctDescription = proudctDescription;
    }

    public String getProductAddress() {

        return productAddress;
    }

    public void setProductAddress(String productAddress) {

        this.productAddress = productAddress;
    }

    public String getProductWebsite() {

        return productWebsite;
    }

    public void setProductWebsite(String productWebsite) {

        this.productWebsite = productWebsite;
    }

    public int getProductImage() {

        return productImage;
    }

    public void setProductImage(int productImage) {

        this.productImage = productImage;
    }

    public float getProductRating() {

        return productRating;
    }

    public void setProductRating(float productRating) {

        this.productRating = productRating;
    }
}
