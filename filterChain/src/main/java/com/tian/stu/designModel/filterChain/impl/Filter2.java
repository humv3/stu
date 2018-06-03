package com.tian.stu.designModel.filterChain.impl;

import com.tian.stu.designModel.filterChain.Filter;
import com.tian.stu.designModel.filterChain.FilterChain;

/**
 * @author:TianZhenYu
 * @date:2018/6/3
 * @description:com.tian.stu.designModel.filterChain.impl stu
 */
public class Filter2 extends AbstractFilter implements Filter {

    protected void before(Object a, Object b, FilterChain chain) {
        System.out.println("before  :  " + Filter2.class.getName());
    }

    protected void after(Object a, Object b, FilterChain chain) {
        System.out.println("after  :  " + Filter2.class.getName());

    }
}
