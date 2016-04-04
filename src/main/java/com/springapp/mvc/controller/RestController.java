package com.springapp.mvc.controller;


import com.springapp.mvc.bean.Product;
import com.springapp.mvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/restful.api")
public class RestController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/getprice",method = RequestMethod.GET,headers="Accept=application/json")
    public List<Product> getShopsProductPrice(@RequestParam(value="mpn") String mpn,
                                           @RequestParam(value = "availability", required=false) Integer availability,
                                           @RequestParam(value = "pricesort", required=false) Integer pricesort ) {

        List<Product> myList = new ArrayList<Product>();
        myList = productService.getProductPrices(mpn,availability,pricesort);

        return myList;
    }
}
