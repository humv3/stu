package com.tian.stu.designModel.filterChain.impl;

import com.tian.stu.designModel.filterChain.Filter;
import com.tian.stu.designModel.filterChain.FilterChain;

/**
 * @author:TianZhenYu
 * @date:2018/6/3
 * @description:com.tian.stu.designModel.filterChain.impl stu
 */
public abstract class AbstractFilter implements Filter {
    public void doFilter(Object a, Object b, FilterChain chain) {
        before(a,b,chain);

        chain.doFilter(a,b);

        after(a,b,chain);
    }

    protected abstract void before(Object a, Object b, FilterChain chain);

    protected abstract void after(Object a, Object b, FilterChain chain);
}
