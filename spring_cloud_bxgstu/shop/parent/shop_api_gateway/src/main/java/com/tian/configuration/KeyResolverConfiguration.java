package com.tian.configuration;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import reactor.core.publisher.Mono;

/**
 * @author:TianZhenYu
 * @date:2020/2/7
 * @description:com.tian.configuration shop_parent
 */
@Configuration
public class KeyResolverConfiguration {

    /**
     * 根据路径限流
     * @return
     */
    @Bean
    @Primary
    public KeyResolver pathKeyResolver(){
        return exchange -> Mono.just(exchange.getRequest().getPath().toString());
    }

    /**
     * 根据ip限流
     * @return
     */
    @Bean
    public KeyResolver ipKeyResolver(){
        return exchange -> Mono.just(exchange.getRequest().getHeaders().getFirst("X-Forwarded-For").toString());
    }

    /**
     * 根据用户限流
     * @return
     */
    @Bean
    public KeyResolver userKeyResolver(){
        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("user"));
    }
}
