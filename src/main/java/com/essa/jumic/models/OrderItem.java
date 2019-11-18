package com.essa.jumic.models;

public class OrderItem {

    public int itemId;
    public String name;
    public double price;
    public String description;
    public CatalogEnum catalogType;

    public OrderItem(int itemId, String name, double price, String description, CatalogEnum catalogType) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.description = description;
        this.catalogType = catalogType;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CatalogEnum getCatalogType() {
        return catalogType;
    }

    public void setCatalogType(CatalogEnum catalogType) {
        this.catalogType = catalogType;
    }

    @Override
    public String toString() {
        return "OrderItem {" +
                "itemId=" + itemId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", catalogType=" + catalogType +
                '}';
    }
}
