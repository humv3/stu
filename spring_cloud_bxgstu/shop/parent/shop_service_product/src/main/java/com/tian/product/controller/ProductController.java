package com.tian.product.controller;

import com.tian.common.entity.Product;
import com.tian.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.web.bind.annotation.*;

/**
 * @author:TianZhenYu
 * @date:2020/1/29
 * @description:common.tian.product.controller shop_parent
 */
@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private ProductService productService;
    @Value("${server.port}")
    private String port;
    @Value("${spring.cloud.client.ip-address}")
    private String ip;

    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id){
        Product product = productService.findById(id);
        product.setProductDesc(ip + ":" + port);
        return product;
    }

    @PostMapping
    public String save(@RequestBody Product product){
        productService.save(product);
        return"保存成功";
    }

    @PutMapping("/{id}")
    public String update(@RequestBody Product product) {
        productService.update(product);
        return"修改成功";
    }

    @DeleteMapping("/{id}")
    public String delete(Long id) {
        productService.delete(id);
        return"删除成功";
    }
}
