package com.tian.stu.spring_boot.redis.spring_boot_redis;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * @author:TianZhenYu
 * @date:2018/5/2
 * @description:com.tian.stu.spring_boot.redis.spring_boot_redis stu
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface CachePut_My {

    /**
     * Alias for {@link # cacheNames}.
     */
    @AliasFor("cacheNames")
    String[] value() default {};


    String key()default "";
}