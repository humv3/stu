package com.tian.stu.designModel.filterChain.impl;

import com.tian.stu.designModel.filterChain.Excuter;
import com.tian.stu.designModel.filterChain.Filter;
import com.tian.stu.designModel.filterChain.FilterChain;

import java.util.List;

/**
 * @author:TianZhenYu
 * @date:2018/6/3
 * @description:com.tian.stu.designModel.filterChain.impl stu
 */
public abstract class AbstractFilterChain implements FilterChain {
    private Excuter excuter;

    public AbstractFilterChain(Excuter excuter){
        this.excuter = excuter;
    }

    protected abstract boolean hasNext();

    protected abstract Filter nextFilter();


    public void doFilter(Object a,Object b){
        if ( hasNext()){
            Filter filter = nextFilter();
            if(filter == null){
                throw new NullPointerException();
            }else {
                filter.doFilter(a,b,this);
            }
        }else {
            excuter.excute(a,b);
        }
    };
}
