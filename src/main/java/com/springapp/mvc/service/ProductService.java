package com.springapp.mvc.service;


import com.springapp.mvc.bean.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getProductPrices (String mpn,Integer availability, Integer pricesort);
}
