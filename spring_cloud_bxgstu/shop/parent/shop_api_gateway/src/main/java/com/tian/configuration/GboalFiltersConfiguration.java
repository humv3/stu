package com.tian.configuration;


import com.tian.filter.AuthorGlobalFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author:TianZhenYu
 * @date:2020/2/7
 * @description:com.tian.configration shop_parent
 */
@Configuration
public class GboalFiltersConfiguration {

    private static final Logger log = LoggerFactory.getLogger( GboalFiltersConfiguration.class);

    @Bean
    public AuthorGlobalFilter getAuthorGlobalFilter(){
        return new AuthorGlobalFilter();
    }

}
