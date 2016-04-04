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

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private List<Shop> array;

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

    public List<Shop> getArray() {
        return array;
    }

    public void setArray(List<Shop> shopList) {
        this.array = shopList;
    }
}
