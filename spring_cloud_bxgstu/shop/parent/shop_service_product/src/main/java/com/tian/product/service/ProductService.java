package com.tian.product.service;

import com.tian.common.entity.Product;

import java.util.List;

/**
 * @author:TianZhenYu
 * @date:2020/1/29
 * @description:common.tian.product shop_parent
 */
public interface ProductService {
    //根据id查询
    Product findById(Long id);
    //查询全部
     List findAll();
    // 保存
    void save(Product product);
    // 更新
    void update(Product product);
    // 删除
    void delete(Long id);
}
