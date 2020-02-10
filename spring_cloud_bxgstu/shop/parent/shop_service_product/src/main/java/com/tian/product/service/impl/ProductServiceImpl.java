package com.tian.product.service.impl;

import com.tian.common.entity.Product;
import com.tian.product.service.ProductService;
import com.tian.product.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author:TianZhenYu
 * @date:2020/1/29
 * @description:common.tian.product.service.impl shop_parent
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product findById(Long id) {
        Optional<Product> byId = productDao.findById(id);
        return byId.get();
    }

    @Override
    public List findAll() {
        return productDao.findAll();
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public void update(Product product) {
        productDao.save(product);
    }

    @Override
    public void delete(Long id) {
        productDao.deleteById(id);
    }
}
