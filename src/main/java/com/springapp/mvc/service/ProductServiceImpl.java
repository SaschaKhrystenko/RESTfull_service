package com.springapp.mvc.service;

import com.springapp.mvc.bean.Product;
import com.springapp.mvc.bean.Shop;
import com.springapp.mvc.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Transactional
    @Override
    public List<Product> getProductPrices(String mpn, Integer availability, Integer pricesort) {
        return productDAO.getProductPrices(mpn,availability,pricesort);
    }
}
