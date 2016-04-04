package com.springapp.mvc.dao;

import com.springapp.mvc.bean.Product;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Integer availability = null;
    private  Integer pricesort = null;

    @Override
    public List<Product> getProductPrices(String mpn,Integer availability, Integer pricesort) {


        String availabilitySort = availability == null ? "" : availability == 1 ? " AND shop.stockStatus > 0" : " AND shop.stockStatus = 2";
        String priceSort = pricesort == null ? "" : pricesort == 1 ? " ORDER BY shop.price ASC" : " ORDER BY shop.price DESC";

        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("SELECT DISTINCT p FROM Product p JOIN FETCH p.shopList shop WHERE p.mpn =:mpn");
        sqlBuilder.append(availabilitySort);
        sqlBuilder.append(priceSort);

        Query query = sessionFactory.getCurrentSession().createQuery(sqlBuilder.toString());

        query.setString("mpn", mpn);
        return  (List<Product>)query.list();


    }


}
