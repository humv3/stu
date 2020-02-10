package order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tian.common.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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





    /**
     * 加入ribbon配置的后的RestTemplate 可以把url中的主机地址写成服务提供者的名称
     * @param id
     * @return
     */
    @RequestMapping("/{id}")
    @HystrixCommand(fallbackMethod = "orderFallBack")
    public Product order(@PathVariable Long id) {
        System.out.println(id);
        Product object= restTemplate.getForObject("http://service-product/product/"+id, Product.class);
        System.out.println(object);
        return object;
    }

    /**
     * 降级方法
     * @param id
     * @return
     */
    public Product orderFallBack(@PathVariable Long id) {
        Product object= new Product();
        object.setProductDesc("服务降级rest");
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

