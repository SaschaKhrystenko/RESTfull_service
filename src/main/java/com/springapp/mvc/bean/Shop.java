package com.springapp.mvc.bean;

import javax.persistence.*;


@Entity
@Table
public class Shop {

    @Id
    @Column
    @GeneratedValue
    private Integer id;

    @Column
    private Double price;

    @Enumerated(EnumType.ORDINAL)
    private Stock stock;

   /* @ManyToOne
    @JoinColumn(name="product_id")
    Product product;*/


    public enum Stock {
        NO,LACK,ENOUGH
    }


    public Shop() {
    }

    public Integer getId() {
        return id;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
