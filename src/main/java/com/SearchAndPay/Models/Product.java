package com.SearchAndPay.Models;

import javax.persistence.*;

@Entity
@Table(name="Products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ProductId")
    private int ProductId;

    @Column(name="Name")
    private String Name;

    @Column(name="Description")
    private String Description;

    @Column(name="UnitPrice")
    private double UnitPrice;

    @Column(name="Image")
    private String Image;

    @Column(name="CategoryId")
    private int CategoryId;

    @Column(name="MeasureTypeId")
    private int MeasureTypeId;

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public int getMeasureTypeId() {
        return MeasureTypeId;
    }

    public void setMeasureTypeId(int measureTypeId) {
        MeasureTypeId = measureTypeId;
    }
}
