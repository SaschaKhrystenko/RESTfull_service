package com.springapp.mvc.dao;

import com.springapp.mvc.bean.Product;
import com.springapp.mvc.bean.Shop;
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


        /*String availabilitySort = availability == null ? "" : availability == 1 ? " AND shop.stock > 0" : " AND shop.stock = 2";
        String priceSort = pricesort == null ? "" : pricesort == 1 ? " ORDER BY shop.price ASC" : " ORDER BY shop.price DESC";

        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("SELECT shop FROM Shop shop JOIN shop.product p WHERE p.mpn =:mpn");
        sqlBuilder.append(availabilitySort);
        sqlBuilder.append(priceSort);

        Query query = sessionFactory.getCurrentSession().createQuery(sqlBuilder.toString());*/

        //Query query = sessionFactory.getCurrentSession().createQuery("SELECT DISTINCT product FROM Product product JOIN product.array shop WHERE product.mpn = 'FA-15HY' AND shop.stock > 0 ORDER BY shop.price DESC");
        Query query = sessionFactory.getCurrentSession().createQuery("SELECT product FROM Product product JOIN product.array shop WHERE product.mpn = 'FA-15HY' AND shop.stock > 0 ORDER BY shop.price DESC");

       // Query querySQL = sessionFactory.getCurrentSession().createSQLQuery("SELECT *  FROM product p JOIN shop s ON p.id = s.product_id WHERE p.mpn = 'FA-15HY' AND s.stock > 0 ORDER BY s.price DESC");
        //query.setString("mpn", mpn);
        return  (List<Product>)query.list();


    }


}
