package com.pluralsight;

public class Product {
        private int productId;
        private String productType;
        private double productPrice;

    public Product(int productId, String productType, double productPrice) {
        this.productId = productId;
        this.productType = productType;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
