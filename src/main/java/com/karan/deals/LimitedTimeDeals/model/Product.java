package com.karan.deals.LimitedTimeDeals.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="pid")
    private Long pid;

    @Column(name="category")
    private String category;
    @Column(name="isDealActivate")
    private boolean isDealActivate;
    @Column(name="productPrice")
    private Integer productPrice;
    @Column(name="limitQuantity")
    private Integer limitQuantity;
    @Column(name="period")
    private String period;


    public Product(Long pid, String category, boolean isDealActivate, Integer productPrice, Integer limitQuantity, String period) {
        this.pid = pid;
        this.category = category;
        this.isDealActivate = isDealActivate;
        this.productPrice = productPrice;
        this.limitQuantity = limitQuantity;
        this.period = period;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", category='" + category + '\'' +
                ", isDealActivate=" + isDealActivate +
                ", productPrice=" + productPrice +
                ", limitQuantity=" + limitQuantity +
                ", period='" + period + '\'' +
                '}';
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isDealActivate() {
        return isDealActivate;
    }

    public void setDealActivate(boolean dealActivate) {
        isDealActivate = dealActivate;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getLimitQuantity() {
        return limitQuantity;
    }

    public void setLimitQuantity(Integer limitQuantity) {
        this.limitQuantity = limitQuantity;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
