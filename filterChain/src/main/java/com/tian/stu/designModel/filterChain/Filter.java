package com.tian.stu.designModel.filterChain;

/**
 * @author:TianZhenYu
 * @date:2018/6/3
 * @description:com.tian.stu.designModel.filterChain stu
 */
public interface Filter {
    void doFilter(Object a,Object b,FilterChain chain);
}
