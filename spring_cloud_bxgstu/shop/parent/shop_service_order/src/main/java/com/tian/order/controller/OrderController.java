package com.tian.order.controller;

import com.tian.common.entity.Product;
import com.tian.order.feign.ProductFeginClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author:TianZhenYu
 * @date:2020/1/30
 * @description:com.tian.order shop_parent
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private ProductFeginClient productFeginClient;

    /**
     * 通过restTemplate写定url调用
     * @param id
     * @return
     */
//    @RequestMapping("/{id}")
//    public Product order(@PathVariable Long id) {
//        Product object= restTemplate.getForObject("http://127.0.0.1:9002/product/"+id, Product.class);
//        //Product object= restTemplate.getForObject("http://service-product/product/"+id, Product.class);
//        System.out.println(object);
//        return object;
//    }

    /**
     * 加入ribbon配置的后的RestTemplate 可以把url中的主机地址写成服务提供者的名称
     * @param id
     * @return
     */
//    @RequestMapping("/{id}")
//    public Product order(@PathVariable Long id) {
//        //Product object= restTemplate.getForObject("http://127.0.0.1:9002/product/"+id, Product.class);
//        Product object= restTemplate.getForObject("http://service-product/product/"+id, Product.class);
//        System.out.println(object);
//        return object;
//    }

    /**
     * 使用feign调用
     * @param id
     * @return
     */
    @RequestMapping("/{id}")
    public Product order(@PathVariable Long id) {
        Product object= productFeginClient.findById(id);
        System.out.println(object);
        return object;
    }

    /**
     * 元数据的获取
     * @param num
     * @return
     */
    @RequestMapping("/metadata")
    public List<ServiceInstance> metadata(Integer num) {
        List<ServiceInstance> instances=discoveryClient.getInstances("SERVICE-PRODUCT");
        for (ServiceInstance instance : instances) {
            System.out.println(instance);
        }
        return instances;
    }
}

