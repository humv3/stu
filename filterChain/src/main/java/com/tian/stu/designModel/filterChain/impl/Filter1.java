package com.tian.stu.designModel.filterChain.impl;

import com.tian.stu.designModel.filterChain.Filter;
import com.tian.stu.designModel.filterChain.FilterChain;

/**
 * @author:TianZhenYu
 * @date:2018/6/3
 * @description:com.tian.stu.designModel.filterChain.impl stu
 */
public class Filter1 extends AbstractFilter implements Filter {
    protected void before(Object a, Object b, FilterChain chain) {
        System.out.println("before  :  " + Filter1.class.getName());
    }

    protected void after(Object a, Object b, FilterChain chain) {
        System.out.println("after  :  " + Filter1.class.getName());

    }
}
