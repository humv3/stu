package com.tian.product.dao;

import com.tian.common.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author:TianZhenYu
 * @date:2020/1/29
 * @description:common.tian.product.dao shop_parent
 */
public interface ProductDao extends JpaRepository<Product,Long>, JpaSpecificationExecutor<Product> {

}
