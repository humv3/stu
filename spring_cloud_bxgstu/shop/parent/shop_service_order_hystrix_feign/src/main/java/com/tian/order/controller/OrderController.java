package com.tian.order.controller;

import com.tian.common.entity.Product;
import com.tian.order.feign.ProductFeginClient;
import com.tian.order.producer.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:TianZhenYu
 * @date:2020/1/30
 * @description:com.tian.order shop_parent
 */
@RestController
@RequestMapping("/com/tian/order")
public class OrderController {


    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private ProductFeginClient productFeginClient;

    @Autowired
    private MessageSender messageSender;



    /**
     * 加入ribbon配置的后的RestTemplate 可以把url中的主机地址写成服务提供者的名称
     * @param id
     * @return
     */
    @RequestMapping("/{id}")
    public Product order(@PathVariable Long id) {
        System.out.println(id);
        Product object= productFeginClient.findById(id);
        System.out.println(object);
        return object;
    }

    /**
     * 发送数量到中间件
     * @param num
     */
    @RequestMapping("/send/{num}")
    public void sendNum(@PathVariable("num") Long num) {
        messageSender.send(num);
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

