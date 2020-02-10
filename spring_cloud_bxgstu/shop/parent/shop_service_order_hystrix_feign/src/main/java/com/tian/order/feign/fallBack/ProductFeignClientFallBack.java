package com.tian.order.feign.fallBack;

import com.tian.common.entity.Product;
import com.tian.order.feign.ProductFeginClient;
import org.springframework.stereotype.Component;

/**
 * @author:TianZhenYu
 * @date:2020/2/4
 * @description:order.feign.fallBack shop_parent
 */
@Component
public class ProductFeignClientFallBack implements ProductFeginClient {

    @Override
    public Product findById(Long id) {
        Product object= new Product();
        object.setProductDesc("服务降级feign");
        return object;
    }
}
