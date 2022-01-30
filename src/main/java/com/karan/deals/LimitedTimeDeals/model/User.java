package com.karan.deals.LimitedTimeDeals.model;

import javax.persistence.*;

@Entity(name="user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="uid")
    private Long uid;

    @Column(name="name")
    private String name;

    @Column(name="userProdQuantity")
    private Integer userProdQuantity;

    @Column(name="isClaim")
    private boolean  isClaim;


    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserProdQuantity() {
        return userProdQuantity;
    }

    public void setUserProdQuantity(Integer userProdQuantity) {
        this.userProdQuantity = userProdQuantity;
    }


    public boolean isClaim() {
        return isClaim;
    }

    public void setClaim(boolean claim) {
        isClaim = claim;
    }
}
