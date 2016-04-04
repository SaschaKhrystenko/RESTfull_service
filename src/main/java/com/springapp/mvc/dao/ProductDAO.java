package com.springapp.mvc.dao;

import com.springapp.mvc.bean.Product;
import com.springapp.mvc.bean.Shop;

import java.util.List;


public interface ProductDAO {
    public List<Product> getProductPrices (String mpn, Integer availability, Integer pricesort );
}
