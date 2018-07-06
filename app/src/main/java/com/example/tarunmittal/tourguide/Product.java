package com.example.tarunmittal.tourguide;
public class Product {
    String productName;
    String productAddress;
    String productWebsite;
    int productImage;
    float productRating;
    public Product(String productName, String productAddress, String productWebsite, int productImage, float productRating) {
        this.productName = productName;
        this.productAddress = productAddress;
        this.productWebsite = productWebsite;
        this.productImage = productImage;
        this.productRating = productRating;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
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
