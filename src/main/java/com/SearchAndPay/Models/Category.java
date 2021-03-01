package com.SearchAndPay.Models;

import javax.persistence.*;

@Entity
@Table(name="Categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CategoryId")
    private int CategoryId;

    @Column(name="Name")
    private String Name;

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
