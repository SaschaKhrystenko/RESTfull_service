package com.springapp.mvc.bean;


import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Product {

    @Id
    @Column
    @GeneratedValue
    private Integer id;

    @Column(unique = true)
    private String mpn;


    @OneToMany()
    @JoinColumn(name = "product_id")


    private List<Shop> shopList;

    public Product() {
    }


    public Integer getId() {
        return id;
    }

    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    public List<Shop> getShopkList() {
        return shopList;
    }

    public void setShopkList(List<Shop> shopkList) {
        this.shopList = shopkList;
    }



}
