package com.tian.order.feign;

import com.tian.common.entity.Product;
import com.tian.order.feign.fallBack.ProductFeignClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author:TianZhenYu
 * @date:2020/2/3
 * @description:com.tian.order.feign shop_parent
 */
@FeignClient(name="SERVICE-PRODUCT",fallback = ProductFeignClientFallBack.class)
public interface ProductFeginClient {

    @RequestMapping(value="/product/{id}",method=RequestMethod.GET)
    public Product findById(@PathVariable("id") Long id);
}
