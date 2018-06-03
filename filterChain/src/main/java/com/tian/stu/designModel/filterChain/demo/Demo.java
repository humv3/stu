package com.tian.stu.designModel.filterChain.demo;

import com.tian.stu.designModel.filterChain.FilterChain;
import com.tian.stu.designModel.filterChain.impl.ArrayListFilterChain;
import com.tian.stu.designModel.filterChain.impl.Excuter1;
import com.tian.stu.designModel.filterChain.impl.Filter1;
import com.tian.stu.designModel.filterChain.impl.Filter2;

/**
 * @author:TianZhenYu
 * @date:2018/6/3
 * @description:com.tian.stu.designModel.filterChain.demo stu
 */
public class Demo {
    public static void main(String[] args) {
        FilterChain filterChain = new ArrayListFilterChain(new Excuter1());

        filterChain.add(new Filter1());
        filterChain.add(new Filter2());

        filterChain.doFilter("a","b");
    }
}
