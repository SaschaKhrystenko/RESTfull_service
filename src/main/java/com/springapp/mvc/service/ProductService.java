package com.springapp.mvc.service;

import com.springapp.mvc.bean.Product;
import com.springapp.mvc.bean.Shop;

import java.util.List;

public interface ProductService {

    public List<Product> getProductPrices (String mpn,Integer availability, Integer pricesort);
}
