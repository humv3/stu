package order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author:TianZhenYu
 * @date:2020/1/29
 * @description:common.tian.product shop_parent
 */
@EntityScan("com.tian")
@SpringCloudApplication
public class OrderApplicationHsytrixRest {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplicationHsytrixRest.class,args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
